package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class WebbedScreenOverlay {
    private static final Identifier OVERLAY_TEXTURE = Identifier.of(Spideroverhaul.MOD_ID, "textures/screen/webbed_screen.png");

    public static void render(DrawContext context, RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        if (player == null || !player.hasStatusEffect(ModEffects.WEBBED)) return;

        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        context.drawTexture(OVERLAY_TEXTURE, 0, 0, 0.0F, 0.0F, width, height, width, height);
        RenderSystem.disableBlend();
    }
}
