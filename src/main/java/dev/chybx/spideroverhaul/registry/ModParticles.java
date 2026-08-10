package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType JUNGLE_SPIDER_VENOM = Registry.register(
        Registries.PARTICLE_TYPE,
        Identifier.of(Spideroverhaul.MOD_ID, "jungle_spider_venom"),
        FabricParticleTypes.simple()
    );

    public static void registerParticles() {
        Spideroverhaul.LOGGER.info("Registered custom particles");
    }
}
