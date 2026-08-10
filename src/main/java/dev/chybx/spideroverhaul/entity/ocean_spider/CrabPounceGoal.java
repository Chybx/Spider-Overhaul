package dev.chybx.spideroverhaul.entity.ocean_spider;

import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;

public class CrabPounceGoal extends Goal {
    private final OceanSpiderEntity crab;

    public CrabPounceGoal(OceanSpiderEntity crab) {
        this.crab = crab;
    }

    @Override
    public boolean canStart() {
        LivingEntity target = crab.getTarget();

        if (target == null || !target.isAlive())
            return false;

        if (!crab.canLeap())
            return false;

        double distSq = crab.squaredDistanceTo(target);

        return distSq > 9 && distSq < 64;
    }

    @Override
    public void start() {
        LivingEntity target = crab.getTarget();

        if (target == null)
            return;

        Vec3d futurePos = target.getPos().add(
                target.getVelocity().multiply(8)
        );

        Vec3d dir = futurePos.subtract(crab.getPos()).normalize();

        crab.setVelocity(
                dir.x * 0.65,
                0.75,
                dir.z * 0.65
        );

        crab.velocityModified = true;

        crab.leapAnimTicks = 0;

        crab.setLeaping(true);

        crab.leapGroundCheckDelay = 10;
    }

    @Override
    public boolean shouldContinue() {
        return crab.isLeaping();
    }
}
