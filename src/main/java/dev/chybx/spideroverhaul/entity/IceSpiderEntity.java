package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IceSpiderEntity extends AbstractVariantSpiderEntity {
    private static final int FROST_BITE_DURATION = 60;

    public IceSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createIceSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(18.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.28))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    protected void onAttackSuccess(Entity target) {
        super.onAttackSuccess(target);

        if (target instanceof LivingEntity livingTarget) {
            livingTarget.addStatusEffect(
                new StatusEffectInstance(ModEffects.ICY, FROST_BITE_DURATION, 0),
                this
            );

            if (this.getWorld().isClient) {
                for (int i = 0; i < 15; i++) {
                    double x = target.getX() + (this.random.nextDouble() - 0.5) * target.getWidth();
                    double y = target.getY() + this.random.nextDouble() * target.getHeight();
                    double z = target.getZ() + (this.random.nextDouble() - 0.5) * target.getWidth();
                    this.getWorld().addParticle(ParticleTypes.SNOWFLAKE, x, y, z, 0.0, 0.1, 0.0);
                }
            }
        }
    }

    @Override
    protected void spawnIdentificationParticles() {
        super.spawnIdentificationParticles();

        if (this.getWorld().isClient && this.isOnGround() && this.age % 10 == 0) {
            BlockPos pos = this.getBlockPos().down();
            if (this.getWorld().getBlockState(pos).isOf(Blocks.FROSTED_ICE) ||
                this.getWorld().getBlockState(pos).isOf(Blocks.ICE)) {
                for (int i = 0; i < 3; i++) {
                    double x = this.getX() + (this.random.nextDouble() - 0.5) * 1.5;
                    double y = this.getY() + 0.1;
                    double z = this.getZ() + (this.random.nextDouble() - 0.5) * 1.5;
                    this.getWorld().addParticle(ParticleTypes.SNOWFLAKE, x, y, z, 0.0, 0.05, 0.0);
                }
            }
        }
    }

    @Override
    public boolean canFreeze() {
        return false;
    }

    public boolean canSpawnInDark() {
        return true;
    }
}
