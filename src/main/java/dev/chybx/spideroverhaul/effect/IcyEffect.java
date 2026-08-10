package dev.chybx.spideroverhaul.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class IcyEffect extends StatusEffect {
    public IcyEffect() {
        super(StatusEffectCategory.HARMFUL, 0x7FC7FF);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }
}
