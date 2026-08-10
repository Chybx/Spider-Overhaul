package dev.chybx.spideroverhaul.mixin;

import dev.chybx.spideroverhaul.registry.ModDamageTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class CactusSpineDamageTypeMixin {

    @Inject(method = "damage", at = @At("HEAD"))
    private void ignoreInvulnerabilityForCactusSpine(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity self = (LivingEntity) (Object) this;

        if (source.getTypeRegistryEntry().getKey().orElse(null) == ModDamageTypes.CACTUS_SPINE && self.timeUntilRegen > 0) {
            self.timeUntilRegen = 0;
        }
    }
}
