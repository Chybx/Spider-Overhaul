package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.desert_spider.CactusSpineEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class DesertSpiderEntity extends AbstractVariantSpiderEntity {
    private static final double ARC_COMPENSATION_FACTOR = 0.2;
    private static final float BASE_VELOCITY = 1.6F;
    private static final float BASE_INACCURACY = 14.0F;
    private static final float DIFFICULTY_INACCURACY_MULTIPLIER = 4.0F;
    private static final int SPIKE_BURST_COUNT = 10;

    public DesertSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
    }

    public static DefaultAttributeContainer.Builder createDesertSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(16.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.35))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        boolean damaged = super.damage(source, amount);
        if (damaged && !this.getWorld().isClient) {
            Entity attacker = source.getAttacker();
            if (attacker instanceof LivingEntity livingAttacker && attacker != this) {
                float thornsDamage = this.random.nextInt(3) + 1;
                attacker.damage(this.getDamageSources().thorns(this), thornsDamage);
                attacker.playSound(SoundEvents.ENCHANT_THORNS_HIT, 1.0F, 1.0F);
            }
        }
        return damaged;
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (!this.getWorld().isClient) {
            fireSpikeBurst();
        }
    }

    public boolean canSpawnInDark() {
        return true;
    }

    private void fireSpikeBurst() {
        float inaccuracy = BASE_INACCURACY - this.getWorld().getDifficulty().getId() * DIFFICULTY_INACCURACY_MULTIPLIER;

        for (int i = 0; i < SPIKE_BURST_COUNT; i++) {
            CactusSpineEntity spine = new CactusSpineEntity(this.getWorld(), this);

            double angle = (2 * Math.PI * i) / SPIKE_BURST_COUNT;
            double dirX = Math.cos(angle);
            double dirZ = Math.sin(angle);

            spine.setVelocity(dirX, ARC_COMPENSATION_FACTOR, dirZ, BASE_VELOCITY, inaccuracy);

            this.getWorld().spawnEntity(spine);
        }

        this.playSound(SoundEvents.ENTITY_ARROW_SHOOT, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
    }
}
