package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.client.render.WebbedOverlayFeatureRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public class LivingEntityRendererMixin<T extends LivingEntity, M extends EntityModel<T>> {
    @SuppressWarnings("unchecked")
    @Inject(method = "<init>", at = @At("RETURN"))
    private void addWebbedOverlay(EntityRendererFactory.Context ctx, M model, float shadowRadius, CallbackInfo ci) {
        ((LivingEntityRendererAccessor)this).invokeAddFeature(new WebbedOverlayFeatureRenderer<>((LivingEntityRenderer<T, M>)(Object)this, model));
    }
}
