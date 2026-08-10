package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.SwampSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.swamp_spider.swamp_spider;
import dev.chybx.spideroverhaul.entity.v_models.swamp_spider.v_swamp_spider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SwampSpiderRenderer extends MobEntityRenderer<SwampSpiderEntity, SwampSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "swamp_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_swamp_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/swamp_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_swamp_spider.png"
    );

    public SwampSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new SwampSpiderModelWrapper(
            new swamp_spider(context.getPart(MODEL_LAYER)),
            new v_swamp_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public void render(SwampSpiderEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        int grassColor = BiomeColors.getGrassColor(entity.getWorld(), entity.getBlockPos());
        EntityModel<?> activeModel = this.model.getActiveModel();
        if (activeModel instanceof swamp_spider custom) {
            custom.setLilyPadColor(grassColor);
        } else if (activeModel instanceof v_swamp_spider vanilla) {
            vanilla.setLilyPadColor(grassColor);
        }
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(SwampSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
