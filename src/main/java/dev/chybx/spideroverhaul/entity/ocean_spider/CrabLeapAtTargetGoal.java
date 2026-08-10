package dev.chybx.spideroverhaul.entity.ocean_spider;

import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import java.util.EnumSet;

public class CrabLeapAtTargetGoal extends Goal {
    private static final double MIN_DISTANCE_SQ = 1.0;
    private static final double MAX_DISTANCE_SQ = 100.0;

    private final OceanSpiderEntity crab;

    CrabLeapAtTargetGoal(OceanSpiderEntity crab) {
        this.crab = crab;
        this.setControls(EnumSet.of(Control.JUMP));
    }

    @Override
    public boolean canStart() {
        LivingEntity target = crab.getTarget();
        if (target == null || !target.isAlive()) return false;
        if (!crab.canLeap()) return false;
        double distSq = crab.squaredDistanceTo(target);
        return distSq >= MIN_DISTANCE_SQ && distSq <= MAX_DISTANCE_SQ;
    }

    @Override
    public boolean shouldContinue() {
        return crab.isLeaping();
    }

    @Override
    public void start() {
        LivingEntity target = crab.getTarget();
        if (target != null) {
            crab.performLeap(target);
        }
    }
}
