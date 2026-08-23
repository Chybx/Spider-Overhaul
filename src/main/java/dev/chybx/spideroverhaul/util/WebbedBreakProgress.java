package dev.chybx.spideroverhaul.util;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.world.ServerWorld;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class WebbedBreakProgress {
    private static final Map<UUID, Integer> progressMap = new HashMap<>();
    private static final Map<UUID, Long> cooldownMap = new HashMap<>();
    public static final int MAX_PROGRESS = 16;
    public static final int MOB_MAX_PROGRESS = 3;
    public static final int COOLDOWN_MILLIS = 100;
    public static final int SWORD_INCREMENT = 4;

    public static boolean tryIncrement(UUID uuid) {
        return tryIncrement(uuid, 1);
    }

    public static boolean tryIncrement(UUID uuid, int amount) {
        long now = System.currentTimeMillis();
        Long last = cooldownMap.get(uuid);
        if (last != null && now - last < COOLDOWN_MILLIS) {
            return false;
        }
        cooldownMap.put(uuid, now);
        progressMap.merge(uuid, amount, Integer::sum);
        return true;
    }

    public static int getBreakIncrement(LivingEntity breaker) {
        return breaker.getMainHandStack().isIn(ItemTags.SWORDS) ? SWORD_INCREMENT : 1;
    }

    public static void reset(UUID uuid) {
        progressMap.remove(uuid);
        cooldownMap.remove(uuid);
    }

    public static int get(UUID uuid) {
        return progressMap.getOrDefault(uuid, 0);
    }

    public static void spawnCobwebParticles(LivingEntity entity) {
        if (!(entity.getWorld() instanceof ServerWorld serverWorld)) return;

        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 30; i++) {
            double x = entity.getX() + (random.nextDouble() - 0.5) * entity.getWidth() * 1.5;
            double y = entity.getY() + random.nextDouble() * entity.getHeight();
            double z = entity.getZ() + (random.nextDouble() - 0.5) * entity.getWidth() * 1.5;

            serverWorld.spawnParticles(
                    new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.COBWEB.getDefaultState()),
                    x, y, z,
                    1, 0.0, 0.0, 0.0, 0.0
            );
        }
    }
}
