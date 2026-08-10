package dev.chybx.spideroverhaul;

import dev.chybx.spideroverhaul.client.render.*;
import dev.chybx.spideroverhaul.entity.models.birch_spider.birch_spider;
import dev.chybx.spideroverhaul.entity.v_models.birch_spider.v_birch_spider;
import dev.chybx.spideroverhaul.entity.models.cavern_spider.cavern_spider;
import dev.chybx.spideroverhaul.entity.v_models.cavern_spider.v_cavern_spider;
import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineModel;
import dev.chybx.spideroverhaul.entity.models.desert_spider.desert_spider;
import dev.chybx.spideroverhaul.entity.models.ice_spider.ice_spider;
import dev.chybx.spideroverhaul.entity.models.jungle_spider.jungle_spider;
import dev.chybx.spideroverhaul.entity.models.mushroom_spider.mushroom_spider;
import dev.chybx.spideroverhaul.entity.models.savanna_spider.savanna_spider;
import dev.chybx.spideroverhaul.entity.models.sculk_spider.sculk_spider;
import dev.chybx.spideroverhaul.entity.models.spider_crab.spider_crab;
import dev.chybx.spideroverhaul.entity.models.swamp_spider.swamp_spider;
import dev.chybx.spideroverhaul.entity.models.taiga_spider.taiga_spider;
import dev.chybx.spideroverhaul.entity.v_models.swamp_spider.v_swamp_spider;
import dev.chybx.spideroverhaul.entity.v_models.taiga_spider.v_taiga_spider;
import dev.chybx.spideroverhaul.entity.v_models.desert_spider.v_dessert_spider;
import dev.chybx.spideroverhaul.entity.v_models.ice_spider.v_ice_spider;
import dev.chybx.spideroverhaul.entity.v_models.jungle_spider.v_jungle_spider;
import dev.chybx.spideroverhaul.entity.v_models.mushroom_spider.v_mushroom_spider;
import dev.chybx.spideroverhaul.entity.v_models.savanna_spider.v_savanna_spider;
import dev.chybx.spideroverhaul.entity.v_models.sculk_spider.v_sculk_spider;
import dev.chybx.spideroverhaul.entity.jungle_spider.JungleSpiderFluidParticle;
import dev.chybx.spideroverhaul.registry.ModEntities;
import dev.chybx.spideroverhaul.registry.ModBlocks;
import dev.chybx.spideroverhaul.registry.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.RenderLayer;

public class SpideroverhaulClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(IceSpiderRenderer.MODEL_LAYER, ice_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(BirchSpiderRenderer.MODEL_LAYER, birch_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(BirchSpiderRenderer.V_MODEL_LAYER, v_birch_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SwampSpiderRenderer.MODEL_LAYER, swamp_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SwampSpiderRenderer.V_MODEL_LAYER, v_swamp_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(DesertSpiderRenderer.MODEL_LAYER, desert_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(DesertSpiderRenderer.V_MODEL_LAYER, v_dessert_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(IceSpiderRenderer.V_MODEL_LAYER, v_ice_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(MushroomSpiderRenderer.MODEL_LAYER, mushroom_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(MushroomSpiderRenderer.V_MODEL_LAYER, v_mushroom_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(CavernSpiderRenderer.MODEL_LAYER, cavern_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(CavernSpiderRenderer.V_MODEL_LAYER, v_cavern_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SculkSpiderRenderer.MODEL_LAYER, sculk_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SculkSpiderRenderer.V_MODEL_LAYER, v_sculk_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(JungleSpiderRenderer.MODEL_LAYER, jungle_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(JungleSpiderRenderer.V_MODEL_LAYER, v_jungle_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SavannaSpiderRenderer.MODEL_LAYER, savanna_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(SavannaSpiderRenderer.V_MODEL_LAYER, v_savanna_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(OceanSpiderRenderer.MODEL_LAYER, spider_crab::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(TaigaSpiderRenderer.MODEL_LAYER, taiga_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(TaigaSpiderRenderer.V_MODEL_LAYER, v_taiga_spider::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(CactusSpineModel.LAYER, CactusSpineModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.DESERT_SPIDER, DesertSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.ICE_SPIDER, IceSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.JUNGLE_SPIDER, JungleSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.SCULK_SPIDER, SculkSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.MUSHROOM_SPIDER, MushroomSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.CAVERN_SPIDER, CavernSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.OCEAN_SPIDER, OceanSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.TAIGA_SPIDER, TaigaSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.BIRCH_SPIDER, BirchSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.SAVANNA_SPIDER, SavannaSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.SWAMP_SPIDER, SwampSpiderRenderer::new);

        EntityRendererRegistry.register(ModEntities.ICE_SNOWBALL, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CACTUS_SPINE, CactusSpineRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIDER_LILY_PAD, RenderLayer.getCutout());

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> BiomeColors.getGrassColor(world, pos),
                ModBlocks.SPIDER_LILY_PAD
        );

        ColorProviderRegistry.ITEM.register(
            (stack, tintIndex) -> 0xFF2D9C33,
            ModBlocks.SPIDER_LILY_PAD
        );

        ParticleFactoryRegistry.getInstance().register(ModParticles.JUNGLE_SPIDER_VENOM, JungleSpiderFluidParticle.Factory::new);
    }
}
