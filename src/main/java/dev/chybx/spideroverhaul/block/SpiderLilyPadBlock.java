package dev.chybx.spideroverhaul.block;

import dev.chybx.spideroverhaul.entity.SwampSpiderEntity;
import dev.chybx.spideroverhaul.registry.ModEntities;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class SpiderLilyPadBlock extends LilyPadBlock {
    private static final int TRAP_DELAY_TICKS = 10;
    private static final double TRAP_SPIDER_NAV_SPEED = 1.2;

    public SpiderLilyPadBlock(Settings settings) {
        super(settings
                .mapColor(MapColor.DARK_GREEN)
                .breakInstantly()
                .sounds(BlockSoundGroup.LILY_PAD)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.DESTROY)
        );
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && !player.isCreative()) {
            spawnSwampSpider(world, pos, player);
        }
        return super.onBreak(world, pos, state, player);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (world.isClient) {
            super.onEntityCollision(state, world, pos, entity);
            return;
        }

        if (entity instanceof PlayerEntity player && !player.isCreative()) {
            world.scheduleBlockTick(pos, this, TRAP_DELAY_TICKS);
        }

        if (entity instanceof BoatEntity boat) {
            world.breakBlock(pos, true);

            spawnSwampSpider(world, pos, null);
        }

        super.onEntityCollision(state, world, pos, entity);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        PlayerEntity player = world.getClosestPlayer(
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                2.5,
                false
        );

        if (player != null && !player.isCreative()) {
            world.breakBlock(pos, true);
            spawnSwampSpider(world, pos, player);
        }
    }

    private void spawnSwampSpider(World world, BlockPos pos, LivingEntity target) {
        SwampSpiderEntity spider = new SwampSpiderEntity(ModEntities.SWAMP_SPIDER, world);
        spider.refreshPositionAndAngles(
            pos.getX() + 0.5,
            pos.getY(),
            pos.getZ() + 0.5,
            0.0F,
            0.0F
        );

        spider.setTarget(target);
        spider.getNavigation().startMovingTo(target, TRAP_SPIDER_NAV_SPEED);
        world.spawnEntity(spider);

        ((ServerWorld)world).spawnParticles(
                ParticleTypes.SPLASH,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                20,
                0.3, 0.3, 0.3,
                0.05
        );

        world.playSound(
                null,
                pos,
                SoundEvents.ENTITY_ZOMBIE_CONVERTED_TO_DROWNED,
                SoundCategory.HOSTILE,
                1.0F,
                1.0F
        );
    }
}
