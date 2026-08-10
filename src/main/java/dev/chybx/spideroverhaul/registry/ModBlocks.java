package dev.chybx.spideroverhaul.registry;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.block.BirchNestBlock;
import dev.chybx.spideroverhaul.block.GiantBambooBlock;
import dev.chybx.spideroverhaul.block.SpiderLilyPadBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BIRCH_NEST = Registry.register(
        Registries.BLOCK,
        Identifier.of(Spideroverhaul.MOD_ID, "birch_nest"),
        new BirchNestBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.BROWN)
            .strength(2.0f)
            .sounds(BlockSoundGroup.WOOD)
            .pistonBehavior(PistonBehavior.DESTROY)
            .ticksRandomly()
        )
    );

    private static final BlockSoundGroup GIANT_BAMBOO_SOUND = new BlockSoundGroup(
        1.0f, 0.5f,
        SoundEvents.BLOCK_BAMBOO_BREAK,
        SoundEvents.BLOCK_BAMBOO_STEP,
        SoundEvents.BLOCK_BAMBOO_PLACE,
        SoundEvents.BLOCK_BAMBOO_HIT,
        SoundEvents.BLOCK_BAMBOO_FALL
    );

    public static final Block GIANT_BAMBOO_BLOCK = Registry.register(
        Registries.BLOCK,
        Identifier.of(Spideroverhaul.MOD_ID, "giant_bamboo_block"),
        new GiantBambooBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.GREEN)
            .strength(2.0f)
            .sounds(GIANT_BAMBOO_SOUND)
        )
    );

    public static final Block SPIDER_LILY_PAD = Registry.register(
        Registries.BLOCK,
        Identifier.of(Spideroverhaul.MOD_ID, "spider_lily_pad"),
        new SpiderLilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)
            .mapColor(MapColor.DARK_GREEN)
            .pistonBehavior(PistonBehavior.DESTROY)
        )
    );

    public static void registerBlocks() {
        Spideroverhaul.LOGGER.info("Registering Spider Overhaul blocks...");
    }
}
