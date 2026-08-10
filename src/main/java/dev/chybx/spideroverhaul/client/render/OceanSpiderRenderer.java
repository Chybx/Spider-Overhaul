package dev.chybx.spideroverhaul.client.render;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import dev.chybx.spideroverhaul.entity.models.spider_crab.spider_crab;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class OceanSpiderRenderer extends MobEntityRenderer<OceanSpiderEntity, spider_crab> {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
        Identifier.of(Spideroverhaul.MOD_ID, "ocean_spider"),
        "main"
    );

    private static final Identifier TEXTURE = Identifier.of(
            Spideroverhaul.MOD_ID,
            "textures/model/spider_crab.png"
    );

    public OceanSpiderRenderer(EntityRendererFactory.Context context) {
        super(context, new spider_crab(context.getPart(MODEL_LAYER)), 0.7f);
    }

    @Override
    public Identifier getTexture(OceanSpiderEntity entity) {
        return TEXTURE;
    }
}
