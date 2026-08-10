package dev.chybx.spideroverhaul.effect;

import dev.chybx.spideroverhaul.Spideroverhaul;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class WebbedEffect extends StatusEffect {
    public WebbedEffect() {
        super(StatusEffectCategory.HARMFUL, 0xC8C8C0);
        addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                Identifier.of(Spideroverhaul.MOD_ID, "webbed"),
                -1.0,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
        );
        addAttributeModifier(
                EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                Identifier.of(Spideroverhaul.MOD_ID, "webbed_knockback"),
                0.5,
                EntityAttributeModifier.Operation.ADD_VALUE
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }
}
