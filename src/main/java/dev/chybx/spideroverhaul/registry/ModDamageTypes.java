package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModDamageTypes {
    public static final RegistryKey<DamageType> CACTUS_SPINE = RegistryKey.of(
        RegistryKeys.DAMAGE_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "cactus_spine")
    );

    public static DamageSource cactusSpine(Entity projectile, Entity attacker) {
        return new DamageSource(
            projectile.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(CACTUS_SPINE),
            projectile,
            attacker
        );
    }
}
