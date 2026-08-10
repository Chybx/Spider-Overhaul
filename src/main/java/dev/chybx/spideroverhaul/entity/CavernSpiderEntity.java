package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.cavern_spider.CavernSpiderType;
import dev.chybx.spideroverhaul.registry.ModEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class CavernSpiderEntity extends AbstractVariantSpiderEntity {
    private static final int WEBBED_DURATION = 160;
    private static final float WEBBED_CHANCE = 0.25f;
    private static final TrackedData<Integer> TYPE_ID =
        DataTracker.registerData(CavernSpiderEntity.class, TrackedDataHandlerRegistry.INTEGER);

    private boolean typeInitialized = false;

    public CavernSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(TYPE_ID, CavernSpiderType.AMETHYST.getId());
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("CavernType", getCavernType().getId());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("CavernType")) {
            setCavernType(CavernSpiderType.byId(nbt.getInt("CavernType")));
            typeInitialized = true;
        }
    }

    public CavernSpiderType getCavernType() {
        return CavernSpiderType.byId(this.dataTracker.get(TYPE_ID));
    }

    public void setCavernType(CavernSpiderType type) {
        this.dataTracker.set(TYPE_ID, type.getId());
    }

    @Override
    protected void onVariantServerTick() {
        super.onVariantServerTick();
        if (!typeInitialized) {
            typeInitialized = true;
            setCavernType(selectTypeForPosition());
        }
    }

    private CavernSpiderType selectTypeForPosition() {
        int y = this.getBlockY();
        double totalWeight = 0.0;
        for (CavernSpiderType type : CavernSpiderType.values()) {
            totalWeight += type.getWeightAt(y);
        }
        double roll = this.random.nextDouble() * totalWeight;
        double cumulative = 0.0;
        for (CavernSpiderType type : CavernSpiderType.values()) {
            cumulative += type.getWeightAt(y);
            if (roll < cumulative) {
                return type;
            }
        }
        return CavernSpiderType.AMETHYST;
    }

    public static DefaultAttributeContainer.Builder createCavernSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(18.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.28))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.5));
    }

    @Override
    protected void onAttackSuccess(Entity target) {
        super.onAttackSuccess(target);

        if (target instanceof LivingEntity livingTarget) {
            if (this.random.nextFloat() < WEBBED_CHANCE
                    && !livingTarget.hasStatusEffect(ModEffects.WEBBED)) {
                livingTarget.addStatusEffect(
                        new StatusEffectInstance(ModEffects.WEBBED, WEBBED_DURATION, 0),
                        this
                );
            }
        }
    }

    @Override
    protected void dropLoot(DamageSource damageSource, boolean causedByPlayer) {
        super.dropLoot(damageSource, causedByPlayer);

        if (causedByPlayer && this.random.nextFloat() < 0.4f) {
            ItemStack drop = getTypeDrop();
            if (!drop.isEmpty()) {
                this.dropStack(drop);
            }
        }
    }

    private ItemStack getTypeDrop() {
        return switch (getCavernType()) {
            case AMETHYST -> new ItemStack(Items.AMETHYST_SHARD, 1 + this.random.nextInt(2));
            case EMERALD -> new ItemStack(Items.EMERALD, 1 + this.random.nextInt(3));
            case DIAMOND -> new ItemStack(Items.DIAMOND, 1);
        };
    }

    public boolean canSpawnInDark() {
        return true;
    }

    public static boolean canSpawn(EntityType<CavernSpiderEntity> type, ServerWorldAccess world, SpawnReason reason, BlockPos pos, Random random) {
        return !world.isSkyVisible(pos) && HostileEntity.canSpawnInDark(type, world, reason, pos, random) && pos.getY() < 63;
    }
}
