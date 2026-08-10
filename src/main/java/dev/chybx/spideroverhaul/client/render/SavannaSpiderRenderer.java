package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.SavannaSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.savanna_spider.savanna_spider;
import dev.chybx.spideroverhaul.entity.v_models.savanna_spider.v_savanna_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SavannaSpiderRenderer extends MobEntityRenderer<SavannaSpiderEntity, SavannaSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "savanna_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_savanna_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/savanna_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_savanna_spider.png"
    );

    public SavannaSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new SavannaSpiderModelWrapper(
            new savanna_spider(context.getPart(MODEL_LAYER)),
            new v_savanna_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(SavannaSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
