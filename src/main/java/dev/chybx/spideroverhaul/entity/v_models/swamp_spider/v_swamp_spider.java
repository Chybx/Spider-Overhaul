package dev.chybx.spideroverhaul.entity.v_models.swamp_spider;

import dev.chybx.spideroverhaul.entity.SwampSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class v_swamp_spider extends SinglePartEntityModel<SwampSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart lilypad_back;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart lilypad;
	private final ModelPart cheliceraR;
	private final ModelPart lilypad_body;
	private final ModelPart limbs_l;
	private final ModelPart l1;
	private final ModelPart l2;
	private final ModelPart l3;
	private final ModelPart l4;
	private final ModelPart limbs_r;
	private final ModelPart r1;
	private final ModelPart r2;
	private final ModelPart r3;
	private final ModelPart r4;
	private final ModelPart root;
	public v_swamp_spider(ModelPart root) {
		this.root = root;
		this.spider = root.getChild("spider");
        this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.lilypad_back = this.back.getChild("lilypad_back");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.lilypad = this.head.getChild("lilypad");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.lilypad_body = this.body.getChild("lilypad_body");
		this.limbs_l = root.getChild("limbs_l");
		this.l1 = this.limbs_l.getChild("l1");
		this.l2 = this.limbs_l.getChild("l2");
		this.l3 = this.limbs_l.getChild("l3");
		this.l4 = this.limbs_l.getChild("l4");
		this.limbs_r = root.getChild("limbs_r");
		this.r1 = this.limbs_r.getChild("r1");
		this.r2 = this.limbs_r.getChild("r2");
		this.r3 = this.limbs_r.getChild("r3");
		this.r4 = this.limbs_r.getChild("r4");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.3198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(30, 0).cuboid(-2.5F, -0.0598F, -1.9778F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.0961F, -0.9715F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 13).cuboid(-3.0F, -3.8942F, -0.7393F, 6.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.9344F, 3.5615F));

		ModelPartData lilypad_back = back.addChild("lilypad_back", ModelPartBuilder.create().uv(0, 0).cuboid(-3.3F, -5.45F, -1.05F, 7.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.2F, 1.3058F, 0.0607F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 27).cuboid(-2.925F, -1.1723F, -5.6704F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 38).cuboid(-3.925F, -1.1723F, -5.6704F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(6, 38).cuboid(3.075F, -1.1723F, -5.6704F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.7875F, -1.9074F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(0.175F, 2.9155F, -5.7074F));

		ModelPartData cube_r1 = cheliceraL.addChild("cube_r1", ModelPartBuilder.create().uv(32, 35).cuboid(5.0179F, 1.88F, -4.1666F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.78F, -1.3382F, 6.337F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r2 = cheliceraL.addChild("cube_r2", ModelPartBuilder.create().uv(30, 9).cuboid(-3.2353F, 0.68F, -7.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.78F, -1.3232F, 6.137F, 0.0F, 0.0F, -1.5708F));

		ModelPartData lilypad = head.addChild("lilypad", ModelPartBuilder.create().uv(24, 27).cuboid(-3.5F, 1.0F, -6.0F, 7.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.075F, -2.4223F, 0.0796F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-0.15F, 2.8393F, -5.7076F));

		ModelPartData cube_r3 = cheliceraR.addChild("cube_r3", ModelPartBuilder.create().uv(32, 37).cuboid(-6.6179F, 1.88F, -4.1666F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.905F, -1.147F, 6.1372F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r4 = cheliceraR.addChild("cube_r4", ModelPartBuilder.create().uv(24, 35).cuboid(1.6353F, 0.68F, -7.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.905F, -1.647F, 6.1372F, 0.0F, 0.0F, 1.5708F));

		ModelPartData lilypad_body = body.addChild("lilypad_body", ModelPartBuilder.create().uv(28, 13).cuboid(-2.5F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 1.6902F, 1.0222F));

		ModelPartData limbs_l = modelPartData.addChild("limbs_l", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 20.0F, 3.0083F));

		ModelPartData l1 = limbs_l.addChild("l1", ModelPartBuilder.create().uv(28, 23).cuboid(0.0F, 1.0F, -0.9167F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData l2 = limbs_l.addChild("l2", ModelPartBuilder.create().uv(28, 23).cuboid(0.0F, 1.0F, -0.9167F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData l3 = limbs_l.addChild("l3", ModelPartBuilder.create().uv(28, 23).cuboid(0.0F, 1.0F, -1.0833F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData l4 = limbs_l.addChild("l4", ModelPartBuilder.create().uv(28, 23).cuboid(0.0F, 1.0F, -1.0833F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -1.925F));

		ModelPartData limbs_r = modelPartData.addChild("limbs_r", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 20.0F, 3.0083F));

		ModelPartData r1 = limbs_r.addChild("r1", ModelPartBuilder.create().uv(28, 23).mirrored().cuboid(-10.0F, 1.0F, -0.9167F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData r2 = limbs_r.addChild("r2", ModelPartBuilder.create().uv(28, 23).mirrored().cuboid(-10.0F, 1.0F, -0.9167F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData r3 = limbs_r.addChild("r3", ModelPartBuilder.create().uv(28, 23).mirrored().cuboid(-10.0F, 1.0F, -1.0833F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData r4 = limbs_r.addChild("r4", ModelPartBuilder.create().uv(28, 23).mirrored().cuboid(-10.0F, 1.0F, -1.0833F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -1.925F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	private float lilyPadRed = 1.0F;
	private float lilyPadGreen = 1.0F;
	private float lilyPadBlue = 1.0F;

	public void setLilyPadColor(int color) {
		this.lilyPadRed = ((color >> 16) & 0xFF) / 255.0F;
		this.lilyPadGreen = ((color >> 8) & 0xFF) / 255.0F;
		this.lilyPadBlue = (color & 0xFF) / 255.0F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		boolean lilyPadHeadVisible = this.lilypad.visible;
		boolean lilyPadBodyVisible = this.lilypad_body.visible;
		boolean lilyPadBackVisible = this.lilypad_back.visible;

		this.lilypad.visible = false;
		this.lilypad_body.visible = false;
		this.lilypad_back.visible = false;

		this.root.render(matrices, vertices, light, overlay, color);

		this.lilypad.visible = lilyPadHeadVisible;
		this.lilypad_body.visible = lilyPadBodyVisible;
		this.lilypad_back.visible = lilyPadBackVisible;

		if (!lilyPadHeadVisible
				&& !lilyPadBodyVisible
				&& !lilyPadBackVisible) {
			return;
		}

		int alpha = (color >> 24) & 0xFF;
		int red = (color >> 16) & 0xFF;
		int green = (color >> 8) & 0xFF;
		int blue = color & 0xFF;

		int lilyPadColor =
				(alpha << 24)
						| (Math.min(255, Math.round(red * this.lilyPadRed)) << 16)
						| (Math.min(255, Math.round(green * this.lilyPadGreen)) << 8)
						| Math.min(255, Math.round(blue * this.lilyPadBlue));

		if (lilyPadHeadVisible) {
			matrices.push();

			this.spider.rotate(matrices);
			this.body.rotate(matrices);
			this.head.rotate(matrices);

			this.lilypad.render(
					matrices,
					vertices,
					light,
					overlay,
					lilyPadColor
			);

			matrices.pop();
		}

		if (lilyPadBodyVisible) {
			matrices.push();

			this.spider.rotate(matrices);
			this.body.rotate(matrices);

			this.lilypad_body.render(
					matrices,
					vertices,
					light,
					overlay,
					lilyPadColor
			);

			matrices.pop();
		}

		if (lilyPadBackVisible) {
			matrices.push();

			this.spider.rotate(matrices);
			this.body.rotate(matrices);
			this.back.rotate(matrices);

			this.lilypad_back.render(
					matrices,
					vertices,
					light,
					overlay,
					lilyPadColor
			);

			matrices.pop();
		}
	}

	@Override
	public void setAngles(SwampSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, v_swamp_spider_anim.attack, ageInTicks, 1.0f);
		} else if (entity.swimAnimationState.isRunning()) {
			this.updateAnimation(entity.swimAnimationState, v_swamp_spider_anim.swim, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, v_swamp_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, v_swamp_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}
}