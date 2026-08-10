package dev.chybx.spideroverhaul.entity.cavern_spider;

import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;
import java.util.function.IntFunction;

public enum CavernSpiderType implements StringIdentifiable {
    AMETHYST  ("amethyst",  0,  3, 1.4),
    EMERALD   ("emerald",   1,  1, 0.9),
    DIAMOND   ("diamond",   2,  2, 1.8);

    private static final IntFunction<CavernSpiderType> BY_ID = ValueLists.createIdToValueFunction(
        CavernSpiderType::getId, values(), ValueLists.OutOfBoundsHandling.ZERO
    );

    private final String name;
    private final int id;
    private final int baseWeight;
    private final double deepWeightMultiplier;

    CavernSpiderType(String name, int id, int baseWeight, double deepWeightMultiplier) {
        this.name = name;
        this.id = id;
        this.baseWeight = baseWeight;
        this.deepWeightMultiplier = deepWeightMultiplier;
    }

    public int getId() {
        return this.id;
    }

    public int getBaseWeight() {
        return this.baseWeight;
    }

    public double getDeepWeightMultiplier() {
        return this.deepWeightMultiplier;
    }

    public static CavernSpiderType byId(int id) {
        return BY_ID.apply(id);
    }

    @Override
    public String asString() {
        return this.name;
    }

    public double getWeightAt(int y) {
        double depthRatio = 1.0 - (y - (-64.0)) / (48.0 - (-64.0));
        depthRatio = Math.max(0.0, Math.min(1.0, depthRatio));
        return this.baseWeight * (1.0 + this.deepWeightMultiplier * depthRatio);
    }
}
