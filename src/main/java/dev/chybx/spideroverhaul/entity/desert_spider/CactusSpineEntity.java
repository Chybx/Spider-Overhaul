package dev.chybx.spideroverhaul.entity.desert_spider;

import dev.chybx.spideroverhaul.registry.ModDamageTypes;
import dev.chybx.spideroverhaul.registry.ModEntities;
import dev.chybx.spideroverhaul.registry.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class CactusSpineEntity extends PersistentProjectileEntity {
    public CactusSpineEntity(EntityType<? extends CactusSpineEntity> entityType, World world) {
        super(entityType, world);
    }

    public CactusSpineEntity(World world, LivingEntity owner) {
        super(ModEntities.CACTUS_SPINE, owner, world, new ItemStack(ModItems.CACTUS_SPINE), null);
    }

    public CactusSpineEntity(World world, double x, double y, double z) {
        this(world, x, y, z, new ItemStack(ModItems.CACTUS_SPINE));
    }

    public CactusSpineEntity(World world, double x, double y, double z, ItemStack pickupItem) {
        super(ModEntities.CACTUS_SPINE, x, y, z, world, pickupItem, null);
    }

    @Override
    protected ItemStack getDefaultItemStack() {
        return new ItemStack(ModItems.CACTUS_SPINE);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.damage(ModDamageTypes.cactusSpine(this, this.getOwner()), 2.0F);
    }
}
