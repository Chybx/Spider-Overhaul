package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class SculkSpiderEntity extends AbstractVariantSpiderEntity {
    private static final int DARKNESS_DURATION = 160;

    public SculkSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createSculkSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(20.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.3))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(3.0));
    }

    @Override
    protected void onAttackSuccess(Entity target) {
        super.onAttackSuccess(target);

        if (target instanceof LivingEntity livingTarget) {
            livingTarget.addStatusEffect(
                new StatusEffectInstance(StatusEffects.DARKNESS, DARKNESS_DURATION, 0),
                this
            );

            if (this.getWorld().isClient) {
                for (int i = 0; i < 25; i++) {
                    double x = target.getX() + (this.random.nextDouble() - 0.5) * target.getWidth();
                    double y = target.getY() + this.random.nextDouble() * target.getHeight();
                    double z = target.getZ() + (this.random.nextDouble() - 0.5) * target.getWidth();
                    this.getWorld().addParticle(ParticleTypes.SCULK_SOUL, x, y, z,
                        (this.random.nextDouble() - 0.5) * 0.2,
                        0.1,
                        (this.random.nextDouble() - 0.5) * 0.2);
                }
            }
        }
    }

    public boolean canSpawnInDark() {
        return true;
    }

    @Override
    public boolean isInvisibleTo(PlayerEntity player) {
        if (player.hasStatusEffect(StatusEffects.DARKNESS)) {
            return this.getBlockPos().getSquaredDistance(player.getBlockPos()) > 16;
        }
        return super.isInvisibleTo(player);
    }

    @Override
    protected ParticleEffect getIdentificationParticle() {
        return ParticleTypes.SCULK_SOUL;
    }
}
