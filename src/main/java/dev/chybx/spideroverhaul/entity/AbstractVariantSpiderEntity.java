package dev.chybx.spideroverhaul.entity;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.world.World;

public abstract class AbstractVariantSpiderEntity extends SpiderVariantEntity {
    protected static final int ATTACK_ANIMATION_DURATION = 16;

    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(AbstractVariantSpiderEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState attackAnimationState = new AnimationState();
    public final AnimationState walkAnimationState = new AnimationState();

    private int attackAnimationTimeout = 0;
    private int attackingFlagResetTimer = 0;

    protected AbstractVariantSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(ATTACKING, false);
    }

    @Override
    public void setAttacking(boolean attacking) {
        super.setAttacking(attacking);
        if (!this.getWorld().isClient && attacking) {
            this.dataTracker.set(ATTACKING, true);
            this.attackingFlagResetTimer = 5;
        }
    }

    private void setupAnimationStates() {
        if (this.getVelocity().horizontalLength() > 0.01) {
            this.walkAnimationState.startIfNotRunning(this.age);
            this.idleAnimationState.stop();
        } else {
            this.walkAnimationState.stop();
            this.idleAnimationState.startIfNotRunning(this.age);
        }

        boolean isAttacking = this.dataTracker.get(ATTACKING);
        if (isAttacking) {
            if (this.attackAnimationTimeout <= 0) {
                this.attackAnimationState.start(this.age);
            }
            this.attackAnimationTimeout = ATTACK_ANIMATION_DURATION;
        }

        if (this.attackAnimationTimeout > 0) {
            this.attackAnimationState.startIfNotRunning(this.age);
        } else {
            this.attackAnimationState.stop();
        }
    }

    @Override
    protected void onVariantTick() {
        super.onVariantTick();

        if (this.getWorld().isClient) {
            if (this.attackAnimationTimeout > 0) {
                this.attackAnimationTimeout--;
            }
            setupAnimationStates();
            onVariantClientTick();
        } else {
            if (this.attackingFlagResetTimer > 0) {
                this.attackingFlagResetTimer--;
                if (this.attackingFlagResetTimer == 0) {
                    this.dataTracker.set(ATTACKING, false);
                }
            }
            onVariantServerTick();
        }
    }

    protected void onVariantClientTick() {
    }

    protected void onVariantServerTick() {
    }
}
