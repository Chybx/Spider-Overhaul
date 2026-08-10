package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class SavannaSpiderEntity extends AbstractVariantSpiderEntity {
    public SavannaSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createSavannaSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(16.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.38))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    protected void onVariantClientTick() {
        if (this.getTarget() != null && !this.getTarget().isRemoved() && this.age % 3 == 0) {
            double distanceToTarget = this.squaredDistanceTo(this.getTarget());
            if (distanceToTarget > 4.0 && distanceToTarget < 256.0) {
                double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getWidth();
                double y = this.getY() + this.random.nextDouble() * this.getHeight();
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getWidth();
                this.getWorld().addParticle(ParticleTypes.CRIT, x, y, z,
                    (this.random.nextDouble() - 0.5) * 0.2,
                    0.0,
                    (this.random.nextDouble() - 0.5) * 0.2);
            }
        }
    }

    @Override
    protected void onVariantServerTick() {
        if (this.getTarget() != null && !this.getTarget().isRemoved()) {
            double distanceToTarget = this.squaredDistanceTo(this.getTarget());
            if (distanceToTarget > 4.0 && distanceToTarget < 256.0) {
                if (!this.hasStatusEffect(StatusEffects.SPEED)) {
                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 0, true, false));
                }
            }
        }
    }

    public boolean canSpawnInDark() {
        return false;
    }
}
