package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SPIDER_OVERHAUL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Spideroverhaul.MOD_ID, "general"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.spider-overhaul.general"))
                    .icon(() -> new ItemStack(ModItems.ICE_SHARD))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CACTUS_SPINE);
                        entries.add(ModItems.ICE_SHARD);
                        entries.add(ModItems.ICE_SNOWBALL);
                        entries.add(ModItems.CRAB_LEG);
                        entries.add(ModItems.COOKED_CRAB);

                        entries.add(ModItems.BIRCH_NEST);
                        entries.add(ModItems.SPIDER_LILY_PAD);
                        entries.add(ModItems.GIANT_BAMBOO_BLOCK);

                        entries.add(createPotionStack(Items.POTION, ModPotions.ICY_POTION));
                        entries.add(createPotionStack(Items.POTION, ModPotions.LONG_ICY_POTION));

                        entries.add(createPotionStack(Items.SPLASH_POTION, ModPotions.ICY_POTION));
                        entries.add(createPotionStack(Items.SPLASH_POTION, ModPotions.LONG_ICY_POTION));

                        entries.add(createPotionStack(Items.LINGERING_POTION, ModPotions.ICY_POTION));
                        entries.add(createPotionStack(Items.LINGERING_POTION, ModPotions.LONG_ICY_POTION));

                        entries.add(createPotionStack(Items.TIPPED_ARROW, ModPotions.ICY_POTION));
                        entries.add(createPotionStack(Items.TIPPED_ARROW, ModPotions.LONG_ICY_POTION));

                        entries.add(ModItems.DESERT_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.ICE_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.BOTTLE_OF_SPIDER_POLLEN);

                        entries.add(ModItems.JUNGLE_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.SCULK_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.MUSHROOM_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.CAVERN_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.OCEAN_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.TAIGA_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.BIRCH_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.SAVANNA_SPIDER_SPAWN_EGG);
                        entries.add(ModItems.SWAMP_SPIDER_SPAWN_EGG);
                    })
                    .build());

    private static ItemStack createPotionStack(Item item, RegistryEntry<Potion> potion) {
        ItemStack stack = new ItemStack(item);
        stack.set(DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(potion));
        return stack;
    }

    public static void registerItemGroups() {
        Spideroverhaul.LOGGER.info("Registering Spider Overhaul item groups...");
    }
}
