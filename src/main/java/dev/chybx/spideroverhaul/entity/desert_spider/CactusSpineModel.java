package dev.chybx.spideroverhaul.entity.desert_spider;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CactusSpineModel extends EntityModel<CactusSpineEntity> {
    public static final EntityModelLayer LAYER =
            new EntityModelLayer(
                    Identifier.of(Spideroverhaul.MOD_ID, "cactus_spine"),
                    "main"
            );

    private final ModelPart bb_main;
    private final ModelPart bb_cross;

    public CactusSpineModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
        this.bb_cross = root.getChild("bb_cross");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("bb_main",
                ModelPartBuilder.create()
                        .uv(0, 0)
                        .cuboid(-1.0F, -3.0F, 0.0F, 2.0F, 6.0F, 0.0F),
                ModelTransform.NONE
        );

        root.addChild("bb_cross",
                ModelPartBuilder.create()
                        .uv(0, 0)
                        .cuboid(-1.0F, -3.0F, 0.0F, 2.0F, 6.0F, 0.0F),
                ModelTransform.rotation(0.0F, 90.0F, 0.0F)
        );

        return TexturedModelData.of(modelData, 16, 16);
    }

    @Override
    public void setAngles(CactusSpineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        bb_main.render(matrices, vertices, light, overlay, color);
        bb_cross.render(matrices, vertices, light, overlay, color);
    }
}
