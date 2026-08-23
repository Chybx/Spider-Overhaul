package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.Spideroverhaul;
import dev.chybx.spideroverhaul.registry.ModEffects;
import dev.chybx.spideroverhaul.util.WebbedBreakProgress;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class WebbedEffectMixin {
    @Inject(method = "addStatusEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;Lnet/minecraft/entity/Entity;)Z", at = @At("HEAD"))
    private void onWebbedApplied(StatusEffectInstance instance, net.minecraft.entity.Entity source, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (!entity.getWorld().isClient()
                && entity instanceof PlayerEntity player
                && instance.getEffectType().equals(ModEffects.WEBBED)) {
            player.playSoundToPlayer(SoundEvents.ENTITY_LEASH_KNOT_PLACE, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }
    }

    @Inject(method = "jump", at = @At("HEAD"), cancellable = true)
    private void preventJumpIfWebbed(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (entity.hasStatusEffect(ModEffects.WEBBED)) {
            ci.cancel();
        }
    }

    @Inject(method = "tickMovement", at = @At("HEAD"))
    private void preventSprintingIfWebbed(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (entity.hasStatusEffect(ModEffects.WEBBED)) {
            entity.setSprinting(false);
        }
    }

    @Inject(method = "removeStatusEffectInternal", at = @At("HEAD"))
    private void onRemoveWebbed(RegistryEntry<StatusEffect> effect, CallbackInfoReturnable<StatusEffectInstance> cir) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (effect == ModEffects.WEBBED && !entity.getWorld().isClient()) {
            WebbedBreakProgress.reset(entity.getUuid());

            if (entity instanceof ServerPlayerEntity serverPlayer) {
                grantBreakWebbedAdvancement(serverPlayer);
            }
        }
    }

    private static void grantBreakWebbedAdvancement(ServerPlayerEntity player) {
        AdvancementEntry advancement = player.getServer().getAdvancementLoader()
                .get(Identifier.of(Spideroverhaul.MOD_ID, "break_webbed"));
        if (advancement != null) {
            player.getAdvancementTracker().grantCriterion(advancement, "break_webbed");
        }
    }

    @Inject(method = "damage", at = @At("HEAD"))
    private void onMobDamagedWhileWebbed(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (entity.getWorld().isClient()) return;
        if (entity instanceof PlayerEntity) return;
        if (!entity.hasStatusEffect(ModEffects.WEBBED)) return;

        int increment = source.getAttacker() instanceof LivingEntity attacker
                ? WebbedBreakProgress.getBreakIncrement(attacker)
                : 1;
        if (!WebbedBreakProgress.tryIncrement(entity.getUuid(), increment)) return;

        WebbedBreakProgress.spawnCobwebParticles(entity);

        if (WebbedBreakProgress.get(entity.getUuid()) >= WebbedBreakProgress.MOB_MAX_PROGRESS) {
            entity.removeStatusEffect(ModEffects.WEBBED);
            WebbedBreakProgress.reset(entity.getUuid());
        }
    }
}
