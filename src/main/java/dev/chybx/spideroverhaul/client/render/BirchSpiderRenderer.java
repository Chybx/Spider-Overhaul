package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.BirchSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.birch_spider.birch_spider;
import dev.chybx.spideroverhaul.entity.v_models.birch_spider.v_birch_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class BirchSpiderRenderer extends MobEntityRenderer<BirchSpiderEntity, BirchSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "birch_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_birch_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/birch_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_birch_spider.png"
    );

    public BirchSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new BirchSpiderModelWrapper(
            new birch_spider(context.getPart(MODEL_LAYER)),
            new v_birch_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(BirchSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
