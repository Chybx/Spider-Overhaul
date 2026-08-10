package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.IceSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.ice_spider.ice_spider;
import dev.chybx.spideroverhaul.entity.v_models.ice_spider.v_ice_spider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class IceSpiderModelWrapper extends EntityModel<IceSpiderEntity> {
    private final ice_spider customModel;
    private final v_ice_spider vanillaModel;

    public IceSpiderModelWrapper(ice_spider customModel, v_ice_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<IceSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(IceSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }
}
