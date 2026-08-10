package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.SculkSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.sculk_spider.sculk_spider;
import dev.chybx.spideroverhaul.entity.v_models.sculk_spider.v_sculk_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SculkSpiderRenderer extends MobEntityRenderer<SculkSpiderEntity, SculkSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "sculk_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_sculk_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/sculk_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_sculk_spider.png"
    );

    public SculkSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new SculkSpiderModelWrapper(
            new sculk_spider(context.getPart(MODEL_LAYER)),
            new v_sculk_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(SculkSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
