package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.TaigaSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.taiga_spider.taiga_spider;
import dev.chybx.spideroverhaul.entity.v_models.taiga_spider.v_taiga_spider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class TaigaSpiderModelWrapper extends EntityModel<TaigaSpiderEntity> {
    private final taiga_spider customModel;
    private final v_taiga_spider vanillaModel;

    public TaigaSpiderModelWrapper(taiga_spider customModel, v_taiga_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<TaigaSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(TaigaSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }
}
