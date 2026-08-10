package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.SwampSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.swamp_spider.swamp_spider;
import dev.chybx.spideroverhaul.entity.v_models.swamp_spider.v_swamp_spider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SwampSpiderModelWrapper extends EntityModel<SwampSpiderEntity> {
    private final swamp_spider customModel;
    private final v_swamp_spider vanillaModel;

    public SwampSpiderModelWrapper(swamp_spider customModel, v_swamp_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    public EntityModel<SwampSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(SwampSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }
}
