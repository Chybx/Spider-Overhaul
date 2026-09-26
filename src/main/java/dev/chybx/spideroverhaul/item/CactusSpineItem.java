package dev.chybx.spideroverhaul.item;

import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class CactusSpineItem extends Item implements ProjectileItem {
    public CactusSpineItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        world.playSound(
            null,
            user.getX(),
            user.getY(),
            user.getZ(),
            SoundEvents.ENTITY_SNOWBALL_THROW,
            SoundCategory.NEUTRAL,
            0.5F,
            0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
        );

        if (!world.isClient) {
            CactusSpineEntity spine = new CactusSpineEntity(world, user);
            spine.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 2.0F, 1.0F);
            world.spawnEntity(spine);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        user.getItemCooldownManager().set(this, 20);
        itemStack.decrementUnlessCreative(1, user);

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        CactusSpineEntity spine = new CactusSpineEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
        spine.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
        return spine;
    }
}
