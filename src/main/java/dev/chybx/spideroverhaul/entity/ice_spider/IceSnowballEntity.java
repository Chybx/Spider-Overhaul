package dev.chybx.spideroverhaul.entity.ice_spider;

import dev.chybx.spideroverhaul.registry.ModEffects;
import dev.chybx.spideroverhaul.registry.ModEntities;
import dev.chybx.spideroverhaul.registry.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class IceSnowballEntity extends ThrownItemEntity {
    public IceSnowballEntity(EntityType<? extends IceSnowballEntity> entityType, World world) {
        super(entityType, world);
    }

    public IceSnowballEntity(World world, LivingEntity owner) {
        super(ModEntities.ICE_SNOWBALL, owner, world);
    }

    public IceSnowballEntity(World world, double x, double y, double z) {
        super(ModEntities.ICE_SNOWBALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.ICE_SNOWBALL;
    }

    @Override
    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = new ItemStackParticleEffect(ParticleTypes.ITEM, this.getStack());
            for (int i = 0; i < 8; i++) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(),
                    (this.random.nextDouble() - 0.5) * 0.2,
                    this.random.nextDouble() * 0.2,
                    (this.random.nextDouble() - 0.5) * 0.2);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();

        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), 3.0F);

        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.ICY, 300, 0), this.getOwner());
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.getWorld().playSound(null, this.getBlockPos(), SoundEvents.ENTITY_PLAYER_HURT_FREEZE, this.getSoundCategory(), 1.0F, 1.0F);
            this.discard();
        }
    }

    @Override
    protected double getGravity() {
        return 0.04F;
    }
}
