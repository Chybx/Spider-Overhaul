package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.IceSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.ice_spider.ice_spider;
import dev.chybx.spideroverhaul.entity.v_models.ice_spider.v_ice_spider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class IceSpiderRenderer extends MobEntityRenderer<IceSpiderEntity, IceSpiderModelWrapper> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "ice_spider"),
        "main"
    );

    public static final EntityModelLayer V_MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "v_ice_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/ice_spider.png"
    );

    private static final Identifier VANILLA_TEXTURE = Identifier.of(
        Spideroverhaul.MOD_ID,
        "textures/model/v_ice_spider.png"
    );

    public IceSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new IceSpiderModelWrapper(
            new ice_spider(context.getPart(MODEL_LAYER)),
            new v_ice_spider(context.getPart(V_MODEL_LAYER))
        ), 0.7f);
    }

    @Override
    public Identifier getTexture(IceSpiderEntity entity) {
        return SpiderOverhaulConfig.getInstance().useVanillaModels ? VANILLA_TEXTURE : TEXTURE;
    }
}
