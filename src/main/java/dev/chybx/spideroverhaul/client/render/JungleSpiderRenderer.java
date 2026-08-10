package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.JungleSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.jungle_spider.jungle_spider;
import dev.chybx.spideroverhaul.entity.v_models.jungle_spider.v_jungle_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class JungleSpiderRenderer extends MobEntityRenderer<JungleSpiderEntity, JungleSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "jungle_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_jungle_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/jungle_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_jungle_spider.png"
    );

    public JungleSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new JungleSpiderModelWrapper(
            new jungle_spider(context.getPart(MODEL_LAYER)),
            new v_jungle_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(JungleSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
