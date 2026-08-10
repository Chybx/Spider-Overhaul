package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class TaigaSpiderEntity extends AbstractVariantSpiderEntity {
    private static final double PACK_RANGE = 8.0;

    public TaigaSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createTaigaSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(14.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.32))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    public boolean tryAttack(Entity target) {
        int packSize = getNearbyPackMembers();
        float bonusDamage = Math.min(packSize, 3);

        if (bonusDamage > 0 && target instanceof net.minecraft.entity.LivingEntity livingTarget) {
            livingTarget.damage(this.getDamageSources().mobAttack(this), bonusDamage);

            if (this.getWorld().isClient && packSize > 0) {
                for (int i = 0; i < packSize * 3; i++) {
                    double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    double y = this.getY() + this.random.nextDouble() * this.getHeight();
                    double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth();
                    this.getWorld().addParticle(ParticleTypes.WHITE_ASH, x, y, z, 0.0, 0.1, 0.0);
                }
            }
        }

        return super.tryAttack(target);
    }

    @Override
    protected void onVariantClientTick() {
        if (this.getAttacker() != null && this.age % 100 == 0 && this.random.nextFloat() < 0.2f) {
            for (int i = 0; i < 20; i++) {
                double x = this.getX() + (this.random.nextDouble() - 0.5) * 2;
                double y = this.getY() + this.random.nextDouble() * 2;
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * 2;
                this.getWorld().addParticle(ParticleTypes.WHITE_ASH, x, y, z,
                    (this.random.nextDouble() - 0.5) * 0.3,
                    this.random.nextDouble() * 0.3,
                    (this.random.nextDouble() - 0.5) * 0.3);
            }
        }
    }

    @Override
    protected void onVariantServerTick() {
        if (this.getAttacker() != null && this.age % 100 == 0) {
            if (this.random.nextFloat() < 0.2f) {
                alertNearbyPack();
            }
        }
    }

    private int getNearbyPackMembers() {
        Box searchBox = new Box(
            this.getX() - PACK_RANGE, this.getY() - PACK_RANGE, this.getZ() - PACK_RANGE,
            this.getX() + PACK_RANGE, this.getY() + PACK_RANGE, this.getZ() + PACK_RANGE
        );
        return this.getWorld().getEntitiesByClass(
            TaigaSpiderEntity.class,
            searchBox,
            spider -> spider != this && spider.isAlive()
        ).size();
    }

    private void alertNearbyPack() {
        Box searchBox = new Box(
            this.getX() - PACK_RANGE * 2, this.getY() - PACK_RANGE, this.getZ() - PACK_RANGE * 2,
            this.getX() + PACK_RANGE * 2, this.getY() + PACK_RANGE, this.getZ() + PACK_RANGE * 2
        );

        List<TaigaSpiderEntity> nearbySpiders = this.getWorld().getEntitiesByClass(
            TaigaSpiderEntity.class,
            searchBox,
            spider -> spider != this && spider.isAlive()
        );

        for (TaigaSpiderEntity spider : nearbySpiders) {
            if (this.getAttacker() != null) {
                spider.setTarget(this.getAttacker());
            }
        }
    }

    public boolean canSpawnInDark() {
        return true;
    }
}
