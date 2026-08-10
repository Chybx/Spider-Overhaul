package dev.chybx.spideroverhaul.entity.jungle_spider;

import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class JungleSpiderFluidParticle extends SpriteBillboardParticle {
    private final float yOffset;

    private JungleSpiderFluidParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z);
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
        this.maxAge = 400;
        this.scale = 0.15f + this.random.nextFloat() * 0.1f;
        this.yOffset = this.random.nextFloat() * 0.03f;

        this.red = 0.5f;
        this.green = 0.8f;
        this.blue = 0.22f;
        this.alpha = 0.9f;

        this.gravityStrength = 1.0f;
        this.collidesWithWorld = true;
    }

    @Override
    protected int getBrightness(float tickDelta) {
        return 0xF000F0;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void buildGeometry(VertexConsumer vertexConsumer, Camera camera, float tickDelta) {
        float ageProgress = ((float) this.age + tickDelta) / (float) this.maxAge;
        this.alpha = ageProgress < 0.1f ? ageProgress / 0.1f : 1.0f - ((ageProgress - 0.1f) / 0.9f);
        this.alpha = Math.max(0.0f, this.alpha);

        float size = getSize(tickDelta);
        float minU = getMinU();
        float maxU = getMaxU();
        float minV = getMinV();
        float maxV = getMaxV();
        int light = getBrightness(tickDelta);

        double cameraX = camera.getPos().x;
        double cameraY = camera.getPos().y;
        double cameraZ = camera.getPos().z;

        org.joml.Vector3f euler = camera.getRotation().getEulerAnglesYXZ(new org.joml.Vector3f());
        Quaternionf horizontalRotation = new Quaternionf().rotationY(euler.y);

        Vector3f[] offsets = {
            new Vector3f(-size, 0, -size),
            new Vector3f(-size, 0,  size),
            new Vector3f( size, 0,  size),
            new Vector3f( size, 0, -size)
        };
        float[] u = {minU, minU, maxU, maxU};
        float[] v = {minV, maxV, maxV, minV};

        for (int i = 0; i < 4; i++) {
            Vector3f offset = new Vector3f(offsets[i]);
            offset.rotate(horizontalRotation);

            vertexConsumer
                .vertex(offset.x + (float)(this.x - cameraX), offset.y + (float)(this.y - cameraY) + this.yOffset, offset.z + (float)(this.z - cameraZ))
                .texture(u[i], v[i])
                .color(this.red, this.green, this.blue, this.alpha)
                .light(light);
        }
    }

    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final FabricSpriteProvider spriteProvider;

        public Factory(FabricSpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public JungleSpiderFluidParticle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            JungleSpiderFluidParticle particle = new JungleSpiderFluidParticle(world, x, y, z, velocityX, velocityY, velocityZ);
            particle.setSprite(this.spriteProvider);
            return particle;
        }
    }
}
