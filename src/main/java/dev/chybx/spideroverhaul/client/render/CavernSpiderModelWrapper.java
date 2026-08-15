package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.CavernSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.cavern_spider.cavern_spider;
import dev.chybx.spideroverhaul.entity.v_models.cavern_spider.v_cavern_spider;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CavernSpiderModelWrapper extends EntityModel<CavernSpiderEntity> {
    private final cavern_spider customModel;
    private final v_cavern_spider vanillaModel;

    public CavernSpiderModelWrapper(cavern_spider customModel, v_cavern_spider vanillaModel) {
        this.customModel = customModel;
        this.vanillaModel = vanillaModel;
    }

    private EntityModel<CavernSpiderEntity> getActiveModel() {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? vanillaModel : customModel;
    }

    @Override
    public void setAngles(CavernSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
