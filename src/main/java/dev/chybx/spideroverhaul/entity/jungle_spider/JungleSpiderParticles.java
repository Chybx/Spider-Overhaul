package dev.chybx.spideroverhaul.entity.jungle_spider;

import dev.chybx.spideroverhaul.registry.ModParticles;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class JungleSpiderParticles {
    private static final List<Puddle> PUDDLES = new ArrayList<>();

    public static void spawn(Vec3d pos) {
        PUDDLES.add(new Puddle(pos));
    }

    public static void tick(ServerWorld world) {
        PUDDLES.removeIf(p -> !p.tick(world));
    }

    public static boolean hasPuddleAt(BlockPos pos) {
        double cx = pos.getX() + 0.5;
        double cz = pos.getZ() + 0.5;
        for (Puddle puddle : PUDDLES) {
            if (Math.abs(puddle.pos.x - cx) < 0.8 && Math.abs(puddle.pos.z - cz) < 0.8) {
                return true;
            }
        }
        return false;
    }

    public static void removePuddleAt(BlockPos pos) {
        double cx = pos.getX() + 0.5;
        double cz = pos.getZ() + 0.5;
        PUDDLES.removeIf(puddle ->
            Math.abs(puddle.pos.x - cx) < 0.8 && Math.abs(puddle.pos.z - cz) < 0.8
        );
    }

    private static class Puddle {
        private final Vec3d pos;
        private int ticks = 400;
        private boolean spawned = false;

        Puddle(Vec3d pos) {
            this.pos = pos;
        }

        boolean tick(ServerWorld world) {
            ticks--;

            if (!spawned) {
                spawned = true;

                for (int i = 0; i < 50; i++) {
                    double angle = world.random.nextDouble() * Math.PI * 2;
                    double radius = world.random.nextDouble() * 0.6;
                    double vx = (world.random.nextDouble() - 0.5) * 0.04;
                    double vy = world.random.nextDouble() * 0.03;
                    double vz = (world.random.nextDouble() - 0.5) * 0.04;

                    world.spawnParticles(
                            ModParticles.JUNGLE_SPIDER_VENOM,
                            pos.x + Math.cos(angle) * radius,
                            pos.y + 0.3,
                            pos.z + Math.sin(angle) * radius,
                            1, vx, vy, vz, 0
                    );
                }
            }

            return ticks > 0;
        }
    }
}
