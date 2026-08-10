package dev.chybx.spideroverhaul.entity.ocean_spider;

import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.attribute.EntityAttributes;

public class CrabMoveControl extends MoveControl {
    private final OceanSpiderEntity crab;

    public CrabMoveControl(OceanSpiderEntity crab) {
        super(crab);
        this.crab = crab;
    }

    @Override
    public void tick() {
        if (this.state != State.MOVE_TO) {
            crab.setForwardSpeed(0.0F);
            return;
        }

        double dx = this.targetX - crab.getX();
        double dy = this.targetY - crab.getY();
        double dz = this.targetZ - crab.getZ();

        double distSq = dx * dx + dy * dy + dz * dz;

        if (distSq < 0.0001) {
            crab.setForwardSpeed(0.0F);
            return;
        }

        LivingEntity livingTarget = crab.getTarget();
        if (livingTarget != null && livingTarget.isAlive()) {
            dx = livingTarget.getX() - crab.getX();
            dz = livingTarget.getZ() - crab.getZ();
        }

        float targetYaw = (float)(Math.atan2(dz, dx) * 57.295776D) - 90.0F;

        crab.setYaw(this.wrapDegrees(crab.getYaw(), targetYaw, 12.0F));
        crab.bodyYaw = crab.getYaw();

        float moveSpeed = (float)(this.speed * crab.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED));

        if (crab.isTouchingWater()) {
            moveSpeed *= 1.25F;
        }

        crab.setMovementSpeed(moveSpeed);

        if (crab.isTouchingWater() && dy < -0.2) {
            crab.setVelocity(crab.getVelocity().add(0.0, -0.005, 0.0));
        }

        if (dy > crab.getStepHeight() && crab.horizontalCollision) {
            crab.getJumpControl().setActive();
        }
    }
}
