package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.client.render.WebbedScreenOverlay;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void renderWebbedOverlay(
            DrawContext context,
            RenderTickCounter tickCounter,
            CallbackInfo ci
    ) {
        WebbedScreenOverlay.render(context, tickCounter);
    }
}
