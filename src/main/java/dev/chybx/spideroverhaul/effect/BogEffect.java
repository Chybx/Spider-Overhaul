package dev.chybx.spideroverhaul.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BogEffect extends StatusEffect {
    public BogEffect() {
        super(StatusEffectCategory.HARMFUL, 0x4A5D23);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }
}
