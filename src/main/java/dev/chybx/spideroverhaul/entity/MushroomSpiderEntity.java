package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MushroomSpiderEntity extends AbstractVariantSpiderEntity {
    private boolean wasAttackedByPlayer = false;

    public MushroomSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createMushroomSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(14.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.25))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(1.0));
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (source.getAttacker() instanceof PlayerEntity) {
            wasAttackedByPlayer = true;
        }
        return super.damage(source, amount);
    }

    @Override
    public boolean canTarget(LivingEntity target) {
        if (!wasAttackedByPlayer) {
            return false;
        }
        return super.canTarget(target);
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);

        if (!this.getWorld().isClient) {
            BlockPos pos = this.getBlockPos();

            for (int i = 0; i < 3; i++) {
                double offsetX = this.random.nextGaussian() * 2;
                double offsetZ = this.random.nextGaussian() * 2;
                BlockPos targetPos = pos.add((int)offsetX, 0, (int)offsetZ);

                if (this.getWorld().getBlockState(targetPos).isAir() &&
                    (this.getWorld().getBlockState(targetPos.down()).isOf(Blocks.GRASS_BLOCK) ||
                     this.getWorld().getBlockState(targetPos.down()).isOf(Blocks.MYCELIUM))) {
                    if (this.random.nextBoolean()) {
                        this.getWorld().setBlockState(targetPos, Blocks.RED_MUSHROOM.getDefaultState());
                    } else {
                        this.getWorld().setBlockState(targetPos, Blocks.BROWN_MUSHROOM.getDefaultState());
                    }
                }
            }
        } else {
            for (int i = 0; i < 50; i++) {
                double x = this.getX() + (this.random.nextGaussian() * 2);
                double y = this.getY() + this.random.nextDouble() * 1.5;
                double z = this.getZ() + (this.random.nextGaussian() * 2);
                this.getWorld().addParticle(ParticleTypes.CRIMSON_SPORE, x, y, z,
                    (this.random.nextDouble() - 0.5) * 0.2,
                    this.random.nextDouble() * 0.1,
                    (this.random.nextDouble() - 0.5) * 0.2);
            }
        }
    }

    public boolean canSpawnInDark() {
        return false;
    }
}
