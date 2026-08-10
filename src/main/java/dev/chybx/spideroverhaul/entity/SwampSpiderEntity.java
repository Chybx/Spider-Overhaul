package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.joml.Vector3f;

public class SwampSpiderEntity extends AbstractVariantSpiderEntity {
    private static final int BOG_EFFECT_DURATION = 160;
    private static final double WATER_SPEED_MULTIPLIER = 5.0;

    public final AnimationState swimAnimationState = new AnimationState();

    public SwampSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createSwampSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(12.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.28))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean success = super.tryAttack(target);
        if (success && target instanceof LivingEntity livingTarget) {
            livingTarget.addStatusEffect(
                new StatusEffectInstance(ModEffects.BOG, BOG_EFFECT_DURATION, 0),
                this
            );
        }
        return success;
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.isTouchingWater()) {
            Vec3d boosted = new Vec3d(
                    movementInput.x * WATER_SPEED_MULTIPLIER,
                    movementInput.y,
                    movementInput.z * WATER_SPEED_MULTIPLIER
            );

            super.travel(boosted);
            return;
        }

        super.travel(movementInput);
    }

    @Override
    protected void onVariantClientTick() {
        if (this.isTouchingWater()) {
            if (this.getVelocity().horizontalLengthSquared() > 0.0001) {
                this.swimAnimationState.startIfNotRunning(this.age);
                this.walkAnimationState.stop();
                this.idleAnimationState.stop();
                this.attackAnimationState.stop();
            } else {
                this.swimAnimationState.stop();
            }
        } else {
            this.swimAnimationState.stop();
        }
    }

    public boolean canSpawnInDark() {
        return true;
    }
}
