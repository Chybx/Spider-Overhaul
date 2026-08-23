package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.registry.ModEffects;
import dev.chybx.spideroverhaul.util.WebbedBreakProgress;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class WebbedPlayerMixin {
    @Inject(method = "attack", at = @At("HEAD"), cancellable = true)
    private void onAttack(Entity target, CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity)(Object)this;
        if (player.getWorld().isClient()) return;

        if (player.hasStatusEffect(ModEffects.WEBBED)) {
            if (!WebbedBreakProgress.tryIncrement(player.getUuid(), WebbedBreakProgress.getBreakIncrement(player))) {
                ci.cancel();
                return;
            }
            WebbedBreakProgress.spawnCobwebParticles(player);

            if (WebbedBreakProgress.get(player.getUuid()) >= WebbedBreakProgress.MAX_PROGRESS) {
                player.removeStatusEffect(ModEffects.WEBBED);
                WebbedBreakProgress.reset(player.getUuid());
            }
            ci.cancel();
        } else {
            WebbedBreakProgress.reset(player.getUuid());
        }
    }
}
