package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    private static final int ICY_DURATION = 2400;
    private static final int LONG_ICY_DURATION = 4800;

    public static RegistryEntry<Potion> ICY_POTION;
    public static RegistryEntry<Potion> LONG_ICY_POTION;

    private static RegistryEntry<Potion> registerPotion(String name, StatusEffectInstance... effects) {
        return Registry.registerReference(
            Registries.POTION,
            Identifier.of(Spideroverhaul.MOD_ID, name),
            new Potion(effects)
        );
    }

    public static void registerPotions() {
        Spideroverhaul.LOGGER.info("Registering potions for " + Spideroverhaul.MOD_ID);

        ICY_POTION = registerPotion("icy",
            new StatusEffectInstance(ModEffects.ICY, ICY_DURATION, 0)
        );

        LONG_ICY_POTION = registerPotion("long_icy",
            new StatusEffectInstance(ModEffects.ICY, LONG_ICY_DURATION, 0)
        );
    }

    public static void registerBrewingRecipes() {
        Spideroverhaul.LOGGER.info("Registering brewing recipes for " + Spideroverhaul.MOD_ID);

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                Potions.AWKWARD,
                ModItems.ICE_SHARD,
                ICY_POTION
            );
        });

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                ICY_POTION,
                Items.REDSTONE,
                LONG_ICY_POTION
            );
        });
    }
}
