package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.BirchSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.birch_spider.birch_spider;
import dev.chybx.spideroverhaul.entity.v_models.birch_spider.v_birch_spider;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class BirchSpiderModelWrapper extends EntityModel<BirchSpiderEntity> {
    private final birch_spider customModel;
    private final v_birch_spider vanillaModel;

    public BirchSpiderModelWrapper(birch_spider customModel, v_birch_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<BirchSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(BirchSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        getActiveModel().setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        applyLegVisibility();
        getActiveModel().render(matrices, vertexConsumer, light, overlay, color);
    }

    private void applyLegVisibility() {
        boolean visible = !SpiderOverhaulConfig.getInstance().hideSpiderLegs;
        setLegPartsVisible(customModel.getPart(), "limbsL", "limbsR", visible);
        setLegPartsVisible(vanillaModel.getPart(), "limbs_l", "limbs_r", visible);
    }

    private static void setLegPartsVisible(ModelPart root, String left, String right, boolean visible) {
        if (root.hasChild("spider")) {
            ModelPart spider = root.getChild("spider");
            setPartVisible(spider, left, visible);
            setPartVisible(spider, right, visible);
        }
        setPartVisible(root, left, visible);
        setPartVisible(root, right, visible);
    }

    private static void setPartVisible(ModelPart root, String name, boolean visible) {
        if (root.hasChild(name)) {
            root.getChild(name).visible = visible;
        }
    }
}
