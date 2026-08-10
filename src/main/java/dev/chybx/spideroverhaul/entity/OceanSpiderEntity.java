package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.ocean_spider.CrabAquaticChaseGoal;
import dev.chybx.spideroverhaul.entity.ocean_spider.CrabMoveControl;
import dev.chybx.spideroverhaul.entity.ocean_spider.CrabPounceGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class OceanSpiderEntity extends AbstractVariantSpiderEntity {
    public final AnimationState leapAnimationState = new AnimationState();

    private static final TrackedData<Boolean> LEAPING =
            DataTracker.registerData(OceanSpiderEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    private static final int LEAP_COOLDOWN_TICKS = 80;

    public int leapCooldown = 0;

    public int leapGroundCheckDelay = 0;
    public int leapAnimTicks = 0;

    public OceanSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new CrabMoveControl(this);
        this.setPathfindingPenalty(PathNodeType.WATER, -0.1F);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(LEAPING, false);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new CrabPounceGoal(this));

        this.goalSelector.add(1, new CrabAquaticChaseGoal(this));

        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.15D, false));

        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8D));

        this.goalSelector.add(6,
                new LookAtEntityGoal(this, PlayerEntity.class, 12.0F));

        this.goalSelector.add(7, new LookAroundGoal(this));

        this.targetSelector.add(1, new RevengeGoal(this));

        this.targetSelector.add(2,
                new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    public static DefaultAttributeContainer.Builder createOceanSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(28.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.24))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(5.0))
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0);
    }

    @Override
    public boolean isPushedByFluids() {
        return false;
    }

    @Override
    protected int getNextAirUnderwater(int air) {
        return this.getMaxAir();
    }

    public boolean isLeaping() {
        return this.dataTracker.get(LEAPING);
    }

    public void setLeaping(boolean leaping) {
        this.dataTracker.set(LEAPING, leaping);
    }

    public boolean canLeap() {
        return leapCooldown <= 0 && this.isOnGround();
    }

    public void performLeap(LivingEntity target) {
        double dx = target.getX() - this.getX();
        double dz = target.getZ() - this.getZ();
        double horizontal = Math.sqrt(dx * dx + dz * dz);
        if (horizontal < 0.01) return;

        this.setVelocity(
            (dx / horizontal) * 0.4,
            0.6,
            (dz / horizontal) * 0.4
        );
        this.setLeaping(true);
        this.leapGroundCheckDelay = 5;
    }

    @Override
    protected void onAttackSuccess(Entity target) {
        super.onAttackSuccess(target);

        if (target instanceof LivingEntity livingTarget) {
            if (livingTarget.hasStatusEffect(StatusEffects.WATER_BREATHING)) {
                livingTarget.removeStatusEffect(StatusEffects.WATER_BREATHING);
            }

            if (this.getWorld().isClient) {
                for (int i = 0; i < 30; i++) {
                    double x = target.getX() + (this.random.nextDouble() - 0.5) * target.getWidth();
                    double y = target.getY() + this.random.nextDouble() * target.getHeight();
                    double z = target.getZ() + (this.random.nextDouble() - 0.5) * target.getWidth();

                    if (i % 3 == 0) {
                        this.getWorld().addParticle(ParticleTypes.BUBBLE, x, y, z, 0.0, 0.1, 0.0);
                    } else if (i % 3 == 1) {
                        this.getWorld().addParticle(ParticleTypes.BUBBLE_POP, x, y, z, 0.0, 0.05, 0.0);
                    } else {
                        this.getWorld().addParticle(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, 0.0, 0.1, 0.0);
                    }
                }
            }
        }
    }

    @Override
    protected void onVariantClientTick() {
        if (this.isLeaping() && !this.leapAnimationState.isRunning()) {
            this.leapAnimationState.start(this.age);
        }

        if (!this.isLeaping() && this.leapAnimationState.isRunning()) {
            this.leapAnimationState.stop();
        }
    }

    @Override
    protected void onVariantServerTick() {
        if (leapCooldown > 0) {
            leapCooldown--;
        }

        if (leapGroundCheckDelay > 0) {
            leapGroundCheckDelay--;
        }

        if (this.isLeaping()) {
            if (this.leapAnimTicks < 40) {
                this.leapAnimTicks++;
            }

            LivingEntity target = this.getTarget();

            if (target != null) {
                Vec3d toTarget = target.getPos()
                        .add(0, target.getHeight() * 0.5, 0)
                        .subtract(this.getPos());

                double distance = toTarget.length();

                if (distance > 0.001) {
                    Vec3d dir = toTarget.normalize();

                    Vec3d vel = this.getVelocity();

                    double steerStrength = this.isTouchingWater() ? 0.035 : 0.02;

                    this.setVelocity(
                            vel.x * 0.82 + dir.x * steerStrength,
                            vel.y * 0.85 + dir.y * steerStrength * 0.8,
                            vel.z * 0.82 + dir.z * steerStrength
                    );
                }
            }

            if (this.isOnGround() && leapGroundCheckDelay <= 0) {
                this.setLeaping(false);
                this.leapCooldown = LEAP_COOLDOWN_TICKS;
            }
        }
    }

    public boolean canSpawnInDark() {
        return true;
    }
}
