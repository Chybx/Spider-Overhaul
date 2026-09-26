package dev.chybx.spideroverhaul.dispenser;

import dev.chybx.spideroverhaul.registry.ModItems;
import net.minecraft.block.DispenserBlock;

public final class ModDispenserBehaviors {
    private ModDispenserBehaviors() {
    }

    public static void register() {
        DispenserBlock.registerProjectileBehavior(ModItems.ICE_SNOWBALL);
        DispenserBlock.registerProjectileBehavior(ModItems.CACTUS_SPINE);
    }
}
