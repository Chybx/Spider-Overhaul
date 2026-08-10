package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class BogEffectMixin {
    private static final double WATER_SINK_ACCEL = -0.08;
    private static final double FALL_ACCELERATION_MULTIPLIER = 1.05;
    private static final double HORIZONTAL_DRAG = 0.85;

    @Inject(
            method = "travel",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/LivingEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V",
                    shift = At.Shift.AFTER
            )
    )
    private void applyBogEffect(Vec3d movementInput, CallbackInfo ci) {
        LivingEntity entity = (LivingEntity)(Object)this;

        if (!entity.hasStatusEffect(ModEffects.BOG)) return;

        Vec3d vel = entity.getVelocity();

        double x = vel.x;
        double y = vel.y;
        double z = vel.z;

        if (entity.isTouchingWater() || entity.isSubmergedInWater()) {
            y += WATER_SINK_ACCEL;

            x *= HORIZONTAL_DRAG;
            z *= HORIZONTAL_DRAG;
        }

        if (y < 0 && !entity.isOnGround()) {
            y *= FALL_ACCELERATION_MULTIPLIER;
        }

        entity.setVelocity(x, y, z);
    }
}