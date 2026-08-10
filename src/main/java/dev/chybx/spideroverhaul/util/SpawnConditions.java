package dev.chybx.spideroverhaul.util;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.registry.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class SpawnConditions {
    public static void registerSpawns() {
        Spideroverhaul.LOGGER.info("Registering spider spawn conditions...");

        if (SpiderOverhaulConfig.getInstance().replaceVanillaSpiders) {
            removeVanillaSpidersFromCustomBiomes();
        }

        BiomeModifications.addSpawn(
            BiomeSelectors.tag(spiderBiomeTag("is_desert")),
            SpawnGroup.MONSTER,
            ModEntities.DESERT_SPIDER,
            SpiderOverhaulConfig.scaleWeight(100),
            1,
            3
        );

        BiomeModifications.addSpawn(
            BiomeSelectors.tag(spiderBiomeTag("is_ice")),
            SpawnGroup.MONSTER,
            ModEntities.ICE_SPIDER,
            SpiderOverhaulConfig.scaleWeight(100),
            1,
            3
        );

        /**BiomeModifications.addSpawn(
            BiomeSelectors.includeByKey(
                BiomeKeys.OCEAN,
                BiomeKeys.DEEP_OCEAN,
                BiomeKeys.WARM_OCEAN,
                BiomeKeys.LUKEWARM_OCEAN,
                BiomeKeys.COLD_OCEAN
            ),
            SpawnGroup.WATER_CREATURE,
            ModEntities.OCEAN_SPIDER,
            SpiderOverhaulConfig.scaleWeight(15),
            1,
            2
        );**/

        BiomeModifications.addSpawn(
            BiomeSelectors.tag(spiderBiomeTag("is_birch")),
            SpawnGroup.MONSTER,
            ModEntities.BIRCH_SPIDER,
            SpiderOverhaulConfig.scaleWeight(100),
            1,
            2
        );

        BiomeModifications.addSpawn(
            BiomeSelectors.tag(spiderBiomeTag("is_swamp")),
            SpawnGroup.MONSTER,
            ModEntities.SWAMP_SPIDER,
            SpiderOverhaulConfig.scaleWeight(100),
            1,
            3
        );

        BiomeModifications.addSpawn(
            BiomeSelectors.tag(spiderBiomeTag("is_jungle")),
            SpawnGroup.MONSTER,
            ModEntities.JUNGLE_SPIDER,
            SpiderOverhaulConfig.scaleWeight(100),
            1,
            3
        );

        BiomeModifications.addSpawn(
            BiomeSelectors.foundInOverworld(),
            SpawnGroup.MONSTER,
            ModEntities.CAVERN_SPIDER,
            SpiderOverhaulConfig.scaleWeight(120),
            1,
            3
        );

        Spideroverhaul.LOGGER.info("Registered spawn conditions for all spider variants");
    }

    private static TagKey<Biome> spiderBiomeTag(String path) {
        return TagKey.of(RegistryKeys.BIOME, Identifier.of(Spideroverhaul.MOD_ID, path));
    }

    private static void removeVanillaSpidersFromCustomBiomes() {
        Spideroverhaul.LOGGER.info("Removing vanilla spider spawns from custom variant biomes...");

        BiomeModifications.create(Identifier.of("remove_vanilla_spiders"))
                .add(
                        ModificationPhase.REMOVALS,
                        BiomeSelectors.tag(spiderBiomeTag("remove_vanilla_spawn_biomes")),
                        (selectionContext, modificationContext) -> {
                            modificationContext.getSpawnSettings().removeSpawns(
                                    (group, entry) ->
                                            group == SpawnGroup.MONSTER &&
                                                    (entry.type == EntityType.SPIDER || entry.type == EntityType.CAVE_SPIDER)
                            );
                        }
                );

        Spideroverhaul.LOGGER.info("Vanilla spider spawns removed from custom variant biomes");
    }
}
