package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.entity.IceSpiderEntity;
import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LivingEntity.class)
public class IcyEffectMixin {
    private static final float ICE_SLIPPERINESS = 0.98f;

    private static final float NORMAL_SLIPPERINESS = 0.6f;

    @Redirect(
            method = "travel",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/Block;getSlipperiness()F"
            )
    )
    private float modifySlipperiness(Block block, Vec3d movementInput) {
        LivingEntity entity = (LivingEntity)(Object)this;

        float slipperiness = block.getSlipperiness();

        if (entity instanceof IceSpiderEntity) {
            return NORMAL_SLIPPERINESS;
        }

        if (entity.hasStatusEffect(ModEffects.ICY) && slipperiness < ICE_SLIPPERINESS) {
            return ICE_SLIPPERINESS;
        }

        return slipperiness;
    }
}
