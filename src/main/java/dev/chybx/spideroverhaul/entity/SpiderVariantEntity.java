package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.world.World;

public abstract class SpiderVariantEntity extends SpiderEntity {
    private static final int PARTICLE_SPAWN_INTERVAL = 5;
    private static final float PARTICLE_SPAWN_CHANCE = 0.8f;
    private static final double PARTICLE_Y_VELOCITY = 0.02;
    private static final int PARTICLE_COUNT_PER_SPAWN = 3;

    public SpiderVariantEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
    }

    public static DefaultAttributeContainer.Builder createSpiderVariantAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(16.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.3))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    public boolean tryAttack(net.minecraft.entity.Entity target) {
        boolean success = super.tryAttack(target);
        if (success) {
            onAttackSuccess(target);
        }
        return success;
    }

    protected void onAttackSuccess(net.minecraft.entity.Entity target) {
        spawnAttackParticles();
    }

    protected void spawnAttackParticles() {
        if (this.getWorld().isClient) {
            ParticleEffect particle = getIdentificationParticle();
            if (particle != null) {
                for (int i = 0; i < 5; i++) {
                    double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth() * 2;
                    double y = this.getY() + this.random.nextDouble() * this.getHeight();
                    double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth() * 2;
                    double velocityX = (this.random.nextDouble() - 0.5) * 0.1;
                    double velocityY = this.random.nextDouble() * 0.1;
                    double velocityZ = (this.random.nextDouble() - 0.5) * 0.1;
                    this.getWorld().addParticle(particle, x, y, z, velocityX, velocityY, velocityZ);
                }
            }
        }
    }

    @Override
    public void tick() {
        super.tick();
        onVariantTick();
    }

    protected void onVariantTick() {
        spawnIdentificationParticles();
    }

    protected void spawnIdentificationParticles() {
        if (this.age % PARTICLE_SPAWN_INTERVAL == 0 && this.getWorld().isClient && this.random.nextFloat() < PARTICLE_SPAWN_CHANCE) {
            ParticleEffect particle = getIdentificationParticle();
            if (particle != null) {
                for (int i = 0; i < PARTICLE_COUNT_PER_SPAWN; i++) {
                    double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    double y = this.getY() + this.random.nextDouble() * this.getHeight();
                    double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    double velocityX = (this.random.nextDouble() - 0.5) * 0.02;
                    double velocityZ = (this.random.nextDouble() - 0.5) * 0.02;
                    this.getWorld().addParticle(particle, x, y, z, velocityX, PARTICLE_Y_VELOCITY, velocityZ);
                }
            }
        }

        if (this.isOnGround() && this.getVelocity().horizontalLengthSquared() > 0.01 && this.age % 3 == 0 && this.getWorld().isClient) {
            ParticleEffect particle = getIdentificationParticle();
            if (particle != null) {
                double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth();
                double y = this.getY() + 0.1;
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth();
                this.getWorld().addParticle(particle, x, y, z, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public boolean damage(net.minecraft.entity.damage.DamageSource source, float amount) {
        boolean damaged = super.damage(source, amount);
        if (damaged) {
            spawnDamageParticles();
        }
        return damaged;
    }

    protected void spawnDamageParticles() {
        if (this.getWorld().isClient) {
            ParticleEffect particle = getIdentificationParticle();
            if (particle != null) {
                for (int i = 0; i < 8; i++) {
                    double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    double y = this.getY() + this.random.nextDouble() * this.getHeight();
                    double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    double velocityX = (this.random.nextDouble() - 0.5) * 0.2;
                    double velocityY = this.random.nextDouble() * 0.2;
                    double velocityZ = (this.random.nextDouble() - 0.5) * 0.2;
                    this.getWorld().addParticle(particle, x, y, z, velocityX, velocityY, velocityZ);
                }
            }
        }
    }

    protected ParticleEffect getIdentificationParticle() {
        return null;
    }
}
