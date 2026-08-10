package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.entity.*;
import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineEntity;
import dev.chybx.spideroverhaul.entity.ice_spider.IceSnowballEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<DesertSpiderEntity> DESERT_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "desert_spider"),
        EntityType.Builder.create(DesertSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<IceSpiderEntity> ICE_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "ice_spider"),
        EntityType.Builder.create(IceSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<JungleSpiderEntity> JUNGLE_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "jungle_spider"),
        EntityType.Builder.create(JungleSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<SculkSpiderEntity> SCULK_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "sculk_spider"),
        EntityType.Builder.create(SculkSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<MushroomSpiderEntity> MUSHROOM_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "mushroom_spider"),
        EntityType.Builder.create(MushroomSpiderEntity::new, SpawnGroup.CREATURE)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<CavernSpiderEntity> CAVERN_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "cavern_spider"),
        EntityType.Builder.create(CavernSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<OceanSpiderEntity> OCEAN_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "ocean_spider"),
        EntityType.Builder.create(OceanSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<TaigaSpiderEntity> TAIGA_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "taiga_spider"),
        EntityType.Builder.create(TaigaSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<BirchSpiderEntity> BIRCH_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "birch_spider"),
        EntityType.Builder.create(BirchSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.12f, 0.72f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<SavannaSpiderEntity> SAVANNA_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "savanna_spider"),
        EntityType.Builder.create(SavannaSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(1.4f, 0.9f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<SwampSpiderEntity> SWAMP_SPIDER = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "swamp_spider"),
        EntityType.Builder.create(SwampSpiderEntity::new, SpawnGroup.MONSTER)
            .dimensions(0.7f, 0.5f)
            .maxTrackingRange(8)
            .build()
    );

    public static final EntityType<IceSnowballEntity> ICE_SNOWBALL = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "ice_snowball"),
        EntityType.Builder.<IceSnowballEntity>create(IceSnowballEntity::new, SpawnGroup.MISC)
            .dimensions(0.25f, 0.25f)
            .maxTrackingRange(4)
            .trackingTickInterval(10)
            .build()
    );

    public static final EntityType<CactusSpineEntity> CACTUS_SPINE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Spideroverhaul.MOD_ID, "cactus_spine"),
            EntityType.Builder.<CactusSpineEntity>create(CactusSpineEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(20)
                    .build()
    );

    private static <T extends HostileEntity> void registerMonsterSpawn(EntityType<T> type) {
        SpawnRestriction.register(type, SpawnLocationTypes.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
            (entityType, world, reason, pos, random) -> HostileEntity.canSpawnInDark(entityType, world, reason, pos, random));
    }

    public static void registerEntities() {
        Spideroverhaul.LOGGER.info("Registering Spider Overhaul entities...");

        FabricDefaultAttributeRegistry.register(DESERT_SPIDER, DesertSpiderEntity.createDesertSpiderAttributes());
        FabricDefaultAttributeRegistry.register(ICE_SPIDER, IceSpiderEntity.createIceSpiderAttributes());
        FabricDefaultAttributeRegistry.register(JUNGLE_SPIDER, JungleSpiderEntity.createJungleSpiderAttributes());
        FabricDefaultAttributeRegistry.register(SCULK_SPIDER, SculkSpiderEntity.createSculkSpiderAttributes());
        FabricDefaultAttributeRegistry.register(MUSHROOM_SPIDER, MushroomSpiderEntity.createMushroomSpiderAttributes());
        FabricDefaultAttributeRegistry.register(CAVERN_SPIDER, CavernSpiderEntity.createCavernSpiderAttributes());

        registerMonsterSpawn(DESERT_SPIDER);
        registerMonsterSpawn(ICE_SPIDER);
        registerMonsterSpawn(JUNGLE_SPIDER);
        registerMonsterSpawn(SCULK_SPIDER);
        registerMonsterSpawn(OCEAN_SPIDER);
        registerMonsterSpawn(TAIGA_SPIDER);
        registerMonsterSpawn(BIRCH_SPIDER);
        registerMonsterSpawn(SAVANNA_SPIDER);
        registerMonsterSpawn(SWAMP_SPIDER);

        SpawnRestriction.register(CAVERN_SPIDER, SpawnLocationTypes.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, CavernSpiderEntity::canSpawn);
        FabricDefaultAttributeRegistry.register(OCEAN_SPIDER, OceanSpiderEntity.createOceanSpiderAttributes());
        FabricDefaultAttributeRegistry.register(TAIGA_SPIDER, TaigaSpiderEntity.createTaigaSpiderAttributes());
        FabricDefaultAttributeRegistry.register(BIRCH_SPIDER, BirchSpiderEntity.createBirchSpiderAttributes());
        FabricDefaultAttributeRegistry.register(SAVANNA_SPIDER, SavannaSpiderEntity.createSavannaSpiderAttributes());
        FabricDefaultAttributeRegistry.register(SWAMP_SPIDER, SwampSpiderEntity.createSwampSpiderAttributes());

        Spideroverhaul.LOGGER.info("Registered {} spider variants", 11);
    }
}
