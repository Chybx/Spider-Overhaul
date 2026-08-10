package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineEntity;
import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineModel;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class CactusSpineRenderer extends EntityRenderer<CactusSpineEntity> {
    private static final Identifier TEXTURE = Identifier.of(
            Spideroverhaul.MOD_ID,
            "textures/entity/cactus_spine.png"
    );

    private final CactusSpineModel model;

    public CactusSpineRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new CactusSpineModel(context.getPart(CactusSpineModel.LAYER));
    }

    @Override
    public void render(CactusSpineEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        float f = MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F;
        float g = MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch());
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(f));
        matrices.multiply(RotationAxis.NEGATIVE_Z.rotationDegrees(g));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));

        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(TEXTURE));
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xFFFFFFFF);
        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(CactusSpineEntity entity) {
        return TEXTURE;
    }
}
