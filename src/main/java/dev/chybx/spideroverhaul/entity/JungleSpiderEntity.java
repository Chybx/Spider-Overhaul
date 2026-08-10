package dev.chybx.spideroverhaul.entity;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.jungle_spider.JungleSpiderParticles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class JungleSpiderEntity extends AbstractVariantSpiderEntity {
    private static final int POISON_DURATION = 100;

    public JungleSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createJungleSpiderAttributes() {
        return SpiderEntity.createSpiderAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, SpiderOverhaulConfig.scaleHealth(16.0))
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, SpiderOverhaulConfig.scaleSpeed(0.32))
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, SpiderOverhaulConfig.scaleDamage(2.0));
    }

    @Override
    protected void onAttackSuccess(Entity target) {
        super.onAttackSuccess(target);

        if (target instanceof LivingEntity livingTarget) {
            livingTarget.addStatusEffect(
                new StatusEffectInstance(StatusEffects.POISON, POISON_DURATION, 0),
                this
            );
        }
    }

    @Override
    public void onDeath(DamageSource source) {
        if (getWorld() instanceof ServerWorld serverWorld) {
            JungleSpiderParticles.spawn(getPos());
        }

        super.onDeath(source);
    }

    public boolean canSpawnInDark() {
        return true;
    }
}
