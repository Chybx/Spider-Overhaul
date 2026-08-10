package dev.chybx.spideroverhaul.block;

import dev.chybx.spideroverhaul.entity.BirchSpiderEntity;
import dev.chybx.spideroverhaul.registry.ModEntities;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirchNestBlock extends Block {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");

    public static final BooleanProperty EMPTY = BooleanProperty.of("empty");

    private static final int BLINK_INTERVAL = 80;
    private static final int BLINK_DURATION = 2;

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public BirchNestBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState()
                .with(ACTIVE, true)
                .with(EMPTY, false)
                .with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE, EMPTY, FACING);
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && state.get(ACTIVE) && !player.isCreative()) {
            BirchSpiderEntity spider = new BirchSpiderEntity(ModEntities.BIRCH_SPIDER, world);
            spider.refreshPositionAndAngles(
                    pos.getX() + 0.5,
                    pos.getY(),
                    pos.getZ() + 0.5,
                    0.0F,
                    0.0F
            );

            spider.setTarget(player);
            world.spawnEntity(spider);
            spider.getNavigation().startMovingTo(player, 1.0);

            ((ServerWorld)world).spawnParticles(
                    ParticleTypes.POOF,
                    pos.getX() + 0.5,
                    pos.getY() + 0.5,
                    pos.getZ() + 0.5,
                    20,
                    0.3, 0.3, 0.3,
                    0.05
            );

            world.playSound(null, pos, SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }

        return super.onBreak(world, pos, state, player);
    }

    private Vec3d findSafeSpawnPosition(ServerWorld world, BlockPos pos) {
        List<Direction> directions = new ArrayList<>(List.of(
            Direction.NORTH,
            Direction.SOUTH,
            Direction.EAST,
            Direction.WEST,
            Direction.UP,
            Direction.DOWN
        ));

        Collections.shuffle(directions);

        for (Direction direction : directions) {
            BlockPos sidePos = pos.offset(direction);

            BlockState sideState = world.getBlockState(sidePos);
            BlockState aboveState = world.getBlockState(sidePos.up());

            if (sideState.isAir() && aboveState.isAir()) {
                return new Vec3d(
                    sidePos.getX() + 0.5,
                    sidePos.getY(),
                    sidePos.getZ() + 0.5
                );
            }
        }

        return new Vec3d(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);

        long timeOfDay = world.getTimeOfDay() % 24000;
        boolean isNight = timeOfDay >= 13000 && timeOfDay < 23000;
        boolean spiderInside = state.get(ACTIVE);

        if (isNight && spiderInside) {
            world.setBlockState(pos, state.with(ACTIVE, false).with(EMPTY, false), Block.NOTIFY_ALL);

            Vec3d spawnPos = findSafeSpawnPosition(world, pos);

            BirchSpiderEntity spider = new BirchSpiderEntity(ModEntities.BIRCH_SPIDER, world);
            spider.refreshPositionAndAngles(
                spawnPos.x,
                spawnPos.y,
                spawnPos.z,
                random.nextFloat() * 360.0F,
                0.0F
            );
            world.spawnEntity(spider);

            (world).spawnParticles(
                    ParticleTypes.POOF,
                    spawnPos.x,
                    spawnPos.y + 0.5,
                    spawnPos.z,
                    20,
                    0.3, 0.3, 0.3,
                    0.05
            );
        } else if (!isNight && !spiderInside) {
            world.setBlockState(pos, state.with(ACTIVE, true).with(EMPTY, false), Block.NOTIFY_ALL);

            world.scheduleBlockTick(pos, this, BLINK_INTERVAL);
        } else if (!isNight && spiderInside) {
            if (!world.getBlockTickScheduler().isQueued(pos, this)) {
                world.scheduleBlockTick(pos, this, BLINK_INTERVAL);
            }
        }
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if (!state.get(ACTIVE)) {
            return;
        }

        boolean currentlyBlinking = state.get(EMPTY);

        if (currentlyBlinking) {
            world.setBlockState(pos, state.with(EMPTY, false), Block.NOTIFY_ALL);

            world.scheduleBlockTick(pos, this, BLINK_INTERVAL);
        } else {
            world.setBlockState(pos, state.with(EMPTY, true), Block.NOTIFY_ALL);

            world.scheduleBlockTick(pos, this, BLINK_DURATION);
        }
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);

        if (!world.isClient && state.get(ACTIVE)) {
            world.scheduleBlockTick(pos, this, BLINK_INTERVAL);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
}
