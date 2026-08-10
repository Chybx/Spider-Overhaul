package dev.chybx.spideroverhaul.entity.ocean_spider;

import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;

public class CrabAquaticChaseGoal extends Goal {
    private final OceanSpiderEntity crab;

    public CrabAquaticChaseGoal(OceanSpiderEntity crab) {
        this.crab = crab;
    }

    @Override
    public boolean canStart() {
        return crab.getTarget() != null;
    }

    @Override
    public void tick() {
        LivingEntity target = crab.getTarget();

        if (target == null)
            return;

        crab.getLookControl().lookAt(target, 30.0F, 30.0F);

        double distSq = crab.squaredDistanceTo(target);

        double speed = distSq > 36 ? 1.0D : 0.8D;

        Vec3d targetPos = target.getPos();

        if (crab.isTouchingWater()) {
            double offset =
                    target.isSwimming() ? 0.4 : 1.0;

            targetPos = targetPos.subtract(0, offset, 0);
        }

        crab.getNavigation().startMovingTo(
                targetPos.x,
                targetPos.y,
                targetPos.z,
                speed
        );
    }
}
