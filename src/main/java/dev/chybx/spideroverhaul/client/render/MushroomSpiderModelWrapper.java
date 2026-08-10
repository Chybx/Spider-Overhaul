package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.MushroomSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.mushroom_spider.mushroom_spider;
import dev.chybx.spideroverhaul.entity.v_models.mushroom_spider.v_mushroom_spider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MushroomSpiderModelWrapper extends EntityModel<MushroomSpiderEntity> {
    private final mushroom_spider customModel;
    private final v_mushroom_spider vanillaModel;

    public MushroomSpiderModelWrapper(mushroom_spider customModel, v_mushroom_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<MushroomSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(MushroomSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }
}
