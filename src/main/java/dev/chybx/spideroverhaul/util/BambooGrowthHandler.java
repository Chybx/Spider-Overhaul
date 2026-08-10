package dev.chybx.spideroverhaul.util;

import dev.chybx.spideroverhaul.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;

import java.util.*;

public class BambooGrowthHandler {
    private static final Map<ServerWorld, List<ConversionTask>> activeConversions = new HashMap<>();

    public static void startConversion(ServerWorld world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (!state.isOf(Blocks.BAMBOO) && !state.isOf(Blocks.BAMBOO_SAPLING)) return;

        List<ConversionTask> tasks = activeConversions.computeIfAbsent(world, k -> new ArrayList<>());
        for (ConversionTask task : tasks) {
            if (task.root.equals(pos)) return;
        }

        tasks.add(new ConversionTask(pos));
    }

    public static void tick(ServerWorld world) {
        List<ConversionTask> tasks = activeConversions.get(world);
        if (tasks == null || tasks.isEmpty()) return;

        if (world.getTime() % 5 != 0) return;

        Iterator<ConversionTask> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            ConversionTask task = iterator.next();
            if (task.tick(world)) {
                iterator.remove();
            }
        }
    }

    public static void removeWorld(ServerWorld world) {
        activeConversions.remove(world);
    }

    private static class ConversionTask {
        final BlockPos root;
        BlockPos top;
        BlockPos bottom;
        boolean topDone;
        boolean bottomDone;
        boolean rootConverted;

        ConversionTask(BlockPos root) {
            this.root = root;
            this.top = root;
            this.bottom = root;
        }

        boolean tick(ServerWorld world) {
            if (!rootConverted) {
                replaceAt(world, root);
                rootConverted = true;
                return false;
            }

            if (!topDone) {
                BlockPos above = top.up();
                BlockState stateAbove = world.getBlockState(above);
                if (stateAbove.isOf(Blocks.BAMBOO) || stateAbove.isOf(Blocks.BAMBOO_SAPLING)) {
                    replaceAt(world, above);
                    top = above;
                } else {
                    topDone = true;
                }
            }

            if (!bottomDone) {
                BlockPos below = bottom.down();
                BlockState stateBelow = world.getBlockState(below);
                if (stateBelow.isOf(Blocks.BAMBOO) || stateBelow.isOf(Blocks.BAMBOO_SAPLING)) {
                    replaceAt(world, below);
                    bottom = below;
                } else {
                    bottomDone = true;
                }
            }

            if (topDone && bottomDone) {
                return true;
            }

            return false;
        }

        private void replaceAt(ServerWorld world, BlockPos pos) {
            world.playSound(null, pos, SoundEvents.BLOCK_BAMBOO_PLACE, SoundCategory.BLOCKS, 1.0f, 0.8f);
            world.setBlockState(pos, ModBlocks.GIANT_BAMBOO_BLOCK.getDefaultState(), 3);
            world.spawnParticles(ParticleTypes.HAPPY_VILLAGER,
                pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                8, 0.4, 0.4, 0.4, 0.02);
        }
    }
}
