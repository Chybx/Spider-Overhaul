package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.CavernSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.cavern_spider.cavern_spider;
import dev.chybx.spideroverhaul.entity.v_models.cavern_spider.v_cavern_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class CavernSpiderRenderer extends MobEntityRenderer<CavernSpiderEntity, CavernSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "cavern_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_cavern_spider"),
        "main"
    );

    public CavernSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new CavernSpiderModelWrapper(
            new cavern_spider(context.getPart(MODEL_LAYER)),
            new v_cavern_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(CavernSpiderEntity entity) {
        String prefix = SpiderOverhaulConfig.getInstance().useVanillaModels ? "v_cavern_spider" : "cavern_spider";
        return Identifier.of(
            Spideroverhaul.MOD_ID,
            "textures/model/" + prefix + "/" + entity.getCavernType().asString() + ".png"
        );
    }
}
