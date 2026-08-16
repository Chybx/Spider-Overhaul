package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.registry.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.biome.BiomeKeys;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnRestriction.class)
public class SpiderSpawnRestrictionMixin {

    @Inject(method = "canSpawn", at = @At("RETURN"), cancellable = true)
    private static void onCanSpawn(EntityType<?> type, ServerWorldAccess world, SpawnReason reason, BlockPos pos, Random random, CallbackInfoReturnable<Boolean> cir) {
        if (reason != SpawnReason.NATURAL) {
            return;
        }

        if (cir.getReturnValue() && isModSpider(type)) {
            if (type == ModEntities.CAVERN_SPIDER) {
                if (pos.getY() >= 63 || world.getBiome(pos).matchesKey(BiomeKeys.MUSHROOM_FIELDS)) {
                    cir.setReturnValue(false);
                }
            } else if (pos.getY() < 63) {
                cir.setReturnValue(false);
            }
        }

        if (SpiderOverhaulConfig.getInstance().replaceVanillaSpiders && type == EntityType.SPIDER && cir.getReturnValue() && !world.isSkyVisible(pos)) {
            cir.setReturnValue(false);
        }
    }

    @Unique
    private static boolean isModSpider(EntityType<?> type) {
        return type == ModEntities.DESERT_SPIDER
                || type == ModEntities.ICE_SPIDER
                || type == ModEntities.JUNGLE_SPIDER
                || type == ModEntities.SCULK_SPIDER
                || type == ModEntities.MUSHROOM_SPIDER
                || type == ModEntities.CAVERN_SPIDER
                || type == ModEntities.OCEAN_SPIDER
                || type == ModEntities.TAIGA_SPIDER
                || type == ModEntities.BIRCH_SPIDER
                || type == ModEntities.SAVANNA_SPIDER
                || type == ModEntities.SWAMP_SPIDER;
    }
}
