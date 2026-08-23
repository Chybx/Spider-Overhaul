package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.registry.ModEffects;
import dev.chybx.spideroverhaul.util.WebbedBreakProgress;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandlerMixin {
    @Shadow public ServerPlayerEntity player;

    private void tryBreakWeb(ServerPlayerEntity player, CallbackInfo ci) {
        if (!player.hasStatusEffect(ModEffects.WEBBED)) return;

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
    }

    @Inject(method = "onHandSwing", at = @At("HEAD"), cancellable = true)
    private void onHandSwing(HandSwingC2SPacket packet, CallbackInfo ci) {
        tryBreakWeb(player, ci);
    }

    @Inject(method = "onPlayerAction", at = @At("HEAD"), cancellable = true)
    private void onPlayerAction(PlayerActionC2SPacket packet, CallbackInfo ci) {
        if (packet.getAction() == PlayerActionC2SPacket.Action.START_DESTROY_BLOCK) {
            tryBreakWeb(player, ci);
        }
    }
}
