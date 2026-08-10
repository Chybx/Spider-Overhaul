package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.SavannaSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.savanna_spider.savanna_spider;
import dev.chybx.spideroverhaul.entity.v_models.savanna_spider.v_savanna_spider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SavannaSpiderModelWrapper extends EntityModel<SavannaSpiderEntity> {
    private final savanna_spider customModel;
    private final v_savanna_spider vanillaModel;

    public SavannaSpiderModelWrapper(savanna_spider customModel, v_savanna_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<SavannaSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(SavannaSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }
}
