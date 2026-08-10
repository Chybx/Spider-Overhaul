package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.item.CactusSpineItem;
import dev.chybx.spideroverhaul.item.IceSnowballItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CACTUS_SPINE = registerItem("cactus_spine",
        new CactusSpineItem(new Item.Settings().maxCount(16)));

    public static final Item ICE_SHARD = registerItem("ice_shard",
        new Item(new Item.Settings()));

    public static final Item ICE_SNOWBALL = registerItem("ice_snowball",
        new IceSnowballItem(new Item.Settings().maxCount(16)));

    public static final Item CRAB_LEG = registerItem("crab_leg",
        new Item(new Item.Settings().component(DataComponentTypes.FOOD,
            new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build())));

    public static final Item COOKED_CRAB = registerItem("cooked_crab",
        new Item(new Item.Settings().component(DataComponentTypes.FOOD,
            new FoodComponent.Builder().nutrition(7).saturationModifier(0.7f).build())));

    public static final Item BIRCH_NEST = registerItem("birch_nest",
        new BlockItem(ModBlocks.BIRCH_NEST, new Item.Settings()));
    public static final Item SPIDER_LILY_PAD = registerItem("spider_lily_pad",
        new PlaceableOnWaterItem(ModBlocks.SPIDER_LILY_PAD, new Item.Settings()));

    public static final Item GIANT_BAMBOO_BLOCK = registerItem("giant_bamboo_block",
        new BlockItem(ModBlocks.GIANT_BAMBOO_BLOCK, new Item.Settings()));

    public static final Item DESERT_SPIDER_SPAWN_EGG = registerItem("desert_spider_spawn_egg",
        new SpawnEggItem(ModEntities.DESERT_SPIDER, 0xD2B48C, 0x8B4513, new Item.Settings()));

    public static final Item ICE_SPIDER_SPAWN_EGG = registerItem("ice_spider_spawn_egg",
        new SpawnEggItem(ModEntities.ICE_SPIDER, 0x555264, 0xb6cffa, new Item.Settings()));

    public static final Item BOTTLE_OF_SPIDER_POLLEN = registerItem("bottle_of_spider_pollen",
        new Item(new Item.Settings()));

    public static final Item JUNGLE_SPIDER_SPAWN_EGG = registerItem("jungle_spider_spawn_egg",
        new SpawnEggItem(ModEntities.JUNGLE_SPIDER, 0x228B22, 0x006400, new Item.Settings()));

    public static final Item SCULK_SPIDER_SPAWN_EGG = registerItem("sculk_spider_spawn_egg",
        new SpawnEggItem(ModEntities.SCULK_SPIDER, 0x1A1A1A, 0x00CED1, new Item.Settings()));

    public static final Item MUSHROOM_SPIDER_SPAWN_EGG = registerItem("mushroom_spider_spawn_egg",
        new SpawnEggItem(ModEntities.MUSHROOM_SPIDER, 0xFF6347, 0x8B4513, new Item.Settings()));

    public static final Item CAVERN_SPIDER_SPAWN_EGG = registerItem("cavern_spider_spawn_egg",
        new SpawnEggItem(ModEntities.CAVERN_SPIDER, 0x9B59B6, 0xE8D5F5, new Item.Settings()));

    public static final Item OCEAN_SPIDER_SPAWN_EGG = registerItem("ocean_spider_spawn_egg",
        new SpawnEggItem(ModEntities.OCEAN_SPIDER, 0x1E90FF, 0x00008B, new Item.Settings()));

    public static final Item TAIGA_SPIDER_SPAWN_EGG = registerItem("taiga_spider_spawn_egg",
        new SpawnEggItem(ModEntities.TAIGA_SPIDER, 0x228B22, 0xFFFFFF, new Item.Settings()));

    public static final Item BIRCH_SPIDER_SPAWN_EGG = registerItem("birch_spider_spawn_egg",
        new SpawnEggItem(ModEntities.BIRCH_SPIDER, 0xF5F5DC, 0x2F4F4F, new Item.Settings()));

    public static final Item SAVANNA_SPIDER_SPAWN_EGG = registerItem("savanna_spider_spawn_egg",
        new SpawnEggItem(ModEntities.SAVANNA_SPIDER, 0xDAA520, 0x8B4513, new Item.Settings()));

    public static final Item SWAMP_SPIDER_SPAWN_EGG = registerItem("swamp_spider_spawn_egg",
        new SpawnEggItem(ModEntities.SWAMP_SPIDER, 0x556B2F, 0x2F4F2F, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Spideroverhaul.MOD_ID, name), item);
    }

    public static void registerItems() {
        Spideroverhaul.LOGGER.info("Registering Spider Overhaul items...");
    }
}
