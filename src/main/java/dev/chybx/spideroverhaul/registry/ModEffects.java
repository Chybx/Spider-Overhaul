package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.effect.BogEffect;
import dev.chybx.spideroverhaul.effect.IcyEffect;
import dev.chybx.spideroverhaul.effect.WebbedEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static RegistryEntry<StatusEffect> ICY;
    public static RegistryEntry<StatusEffect> BOG;
    public static RegistryEntry<StatusEffect> WEBBED;

    private static RegistryEntry<StatusEffect> registerEffect(String name, StatusEffect effect) {
        return Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.of(Spideroverhaul.MOD_ID, name),
            effect
        );
    }

    public static void registerEffects() {
        Spideroverhaul.LOGGER.info("Registering status effects for " + Spideroverhaul.MOD_ID);

        ICY = registerEffect("icy", new IcyEffect());
        BOG = registerEffect("bog", new BogEffect());
        WEBBED = registerEffect("webbed", new WebbedEffect());
    }
}
