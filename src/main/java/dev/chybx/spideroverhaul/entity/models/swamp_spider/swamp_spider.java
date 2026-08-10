package dev.chybx.spideroverhaul.entity.models.swamp_spider;

import dev.chybx.spideroverhaul.entity.SwampSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

import java.util.List;
import java.util.Set;

public class swamp_spider extends SinglePartEntityModel<SwampSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart lilypad_back;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart lilypad_head;
	private final ModelPart cheliceraR;
	private final ModelPart lilypad_body;
	private final ModelPart limbsL;
	private final ModelPart L1;
	private final ModelPart limbL21;
	private final ModelPart L2;
	private final ModelPart limbL22;
	private final ModelPart L3;
	private final ModelPart limbL23;
	private final ModelPart L4;
	private final ModelPart limbL24;
	private final ModelPart limbsR;
	private final ModelPart R1;
	private final ModelPart limbR21;
	private final ModelPart R2;
	private final ModelPart limbR22;
	private final ModelPart R3;
	private final ModelPart limbR23;
	private final ModelPart R4;
	private final ModelPart limbR24;
	public swamp_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.lilypad_back = this.back.getChild("lilypad_back");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.lilypad_head = this.head.getChild("lilypad_head");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.lilypad_body = this.body.getChild("lilypad_body");
		this.limbsL = this.spider.getChild("limbsL");
		this.L1 = this.limbsL.getChild("L1");
		this.limbL21 = this.L1.getChild("limbL21");
		this.L2 = this.limbsL.getChild("L2");
		this.limbL22 = this.L2.getChild("limbL22");
		this.L3 = this.limbsL.getChild("L3");
		this.limbL23 = this.L3.getChild("limbL23");
		this.L4 = this.limbsL.getChild("L4");
		this.limbL24 = this.L4.getChild("limbL24");
		this.limbsR = this.spider.getChild("limbsR");
		this.R1 = this.limbsR.getChild("R1");
		this.limbR21 = this.R1.getChild("limbR21");
		this.R2 = this.limbsR.getChild("R2");
		this.limbR22 = this.R2.getChild("limbR22");
		this.R3 = this.limbsR.getChild("R3");
		this.limbR23 = this.R3.getChild("limbR23");
		this.R4 = this.limbsR.getChild("R4");
		this.limbR24 = this.R4.getChild("limbR24");
		this.parts = new java.util.ArrayList<>();
		this.spider.traverse().forEach(this.parts::add);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.3198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(24, 22).cuboid(-2.5F, -2.0598F, -1.9778F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.0961F, -0.9715F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.8942F, -0.7393F, 6.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.9344F, 3.5615F));

		ModelPartData lilypad_back = back.addChild("lilypad_back", ModelPartBuilder.create().uv(0, 51).cuboid(-2.8F, -5.2F, -0.8F, 7.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.7F, -0.9442F, -0.1893F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 14).cuboid(-2.925F, -3.1723F, -5.6704F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 32).cuboid(-3.925F, -3.1723F, -5.6704F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(6, 32).cuboid(3.075F, -3.1723F, -5.6704F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.7875F, -1.9074F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.095F, 0.8235F, -5.0687F));

		ModelPartData cube_r1 = cheliceraL.addChild("cube_r1", ModelPartBuilder.create().uv(28, 12).cuboid(5.0179F, 1.88F, -4.1666F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.7F, -1.2462F, 5.6984F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r2 = cheliceraL.addChild("cube_r2", ModelPartBuilder.create().uv(16, 25).cuboid(-3.2353F, 0.68F, -7.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.7F, -1.2311F, 5.4984F, 0.0F, 0.0F, -1.5708F));

		ModelPartData lilypad_head = head.addChild("lilypad_head", ModelPartBuilder.create().uv(24, 14).cuboid(-3.5F, -1.0F, -6.0F, 7.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.075F, -2.4223F, 0.0796F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-1.2F, 0.6785F, -5.6687F));

		ModelPartData cube_r3 = cheliceraR.addChild("cube_r3", ModelPartBuilder.create().uv(28, 31).cuboid(-6.6179F, 1.88F, -4.1666F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.955F, -0.9861F, 6.0984F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r4 = cheliceraR.addChild("cube_r4", ModelPartBuilder.create().uv(20, 31).cuboid(1.6353F, 0.68F, -7.1F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.955F, -1.4862F, 6.0984F, 0.0F, 0.0F, 1.5708F));

		ModelPartData lilypad_body = body.addChild("lilypad_body", ModelPartBuilder.create().uv(0, 36).cuboid(-2.5F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -0.3098F, 1.0222F));

		ModelPartData limbsL = spider.addChild("limbsL", ModelPartBuilder.create(), ModelTransform.pivot(2.4F, 0.1441F, 2.6573F));

		ModelPartData L1 = limbsL.addChild("L1", ModelPartBuilder.create().uv(28, 0).cuboid(-0.4F, -2.0F, 0.0667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -5.6733F));

		ModelPartData limbL21 = L1.addChild("limbL21", ModelPartBuilder.create().uv(0, 25).cuboid(-0.775F, -0.4F, -1.6F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 3).cuboid(5.175F, 0.6F, -1.6F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.4F, -2.0F, 1.0667F));

		ModelPartData L2 = limbsL.addChild("L2", ModelPartBuilder.create().uv(28, 0).cuboid(-0.4F, -2.0F, 0.0667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -4.8733F));

		ModelPartData limbL22 = L2.addChild("limbL22", ModelPartBuilder.create().uv(0, 25).cuboid(-0.775F, -0.4F, -1.6F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 3).cuboid(5.175F, 0.6F, -1.6F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.4F, -2.0F, 1.0667F));

		ModelPartData L3 = limbsL.addChild("L3", ModelPartBuilder.create().uv(28, 0).cuboid(-0.4F, -2.0F, -0.8667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.54F));

		ModelPartData limbL23 = L3.addChild("limbL23", ModelPartBuilder.create().uv(0, 25).cuboid(-0.775F, -0.4F, 0.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 3).cuboid(5.175F, 0.6F, 0.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.4F, -2.0F, -1.0667F));

		ModelPartData L4 = limbsL.addChild("L4", ModelPartBuilder.create().uv(28, 0).cuboid(-0.4F, -2.0F, -0.8667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.74F));

		ModelPartData limbL24 = L4.addChild("limbL24", ModelPartBuilder.create().uv(0, 25).cuboid(-0.775F, -0.4F, 0.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(28, 3).cuboid(5.175F, 0.6F, 0.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.4F, -2.0F, -1.0667F));

		ModelPartData limbsR = spider.addChild("limbsR", ModelPartBuilder.create(), ModelTransform.pivot(-2.4F, 0.1441F, 2.6573F));

		ModelPartData R1 = limbsR.addChild("R1", ModelPartBuilder.create().uv(28, 0).cuboid(-6.0F, -2.0F, 0.0667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -5.6733F));

		ModelPartData limbR21 = R1.addChild("limbR21", ModelPartBuilder.create().uv(0, 25).mirrored().cuboid(-5.575F, -0.4F, -1.6F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
				.uv(28, 9).cuboid(-8.55F, 0.6F, -1.6F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.4F, -2.0F, 1.0667F));

		ModelPartData R2 = limbsR.addChild("R2", ModelPartBuilder.create().uv(28, 0).cuboid(-6.0F, -2.0F, 0.0667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -4.8733F));

		ModelPartData limbR22 = R2.addChild("limbR22", ModelPartBuilder.create().uv(0, 25).mirrored().cuboid(-5.575F, -0.4F, -1.6F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
				.uv(0, 29).cuboid(-8.55F, 0.6F, -1.6F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.4F, -2.0F, 1.0667F));

		ModelPartData R3 = limbsR.addChild("R3", ModelPartBuilder.create().uv(28, 0).cuboid(-6.0F, -2.0F, -0.8667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.54F));

		ModelPartData limbR23 = R3.addChild("limbR23", ModelPartBuilder.create().uv(28, 6).cuboid(-8.55F, 0.6F, 0.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 25).mirrored().cuboid(-5.575F, -0.4F, 0.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-6.4F, -2.0F, -1.0667F));

		ModelPartData R4 = limbsR.addChild("R4", ModelPartBuilder.create().uv(28, 0).cuboid(-6.0F, -2.0F, -0.8667F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.74F));

		ModelPartData limbR24 = R4.addChild("limbR24", ModelPartBuilder.create().uv(0, 25).mirrored().cuboid(-5.575F, -0.4F, 0.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
				.uv(10, 29).cuboid(-8.55F, 0.6F, 0.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.4F, -2.0F, -1.0667F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	private float lilyPadRed = 1.0f;
	private float lilyPadGreen = 1.0f;
	private float lilyPadBlue = 1.0f;
	private final List<ModelPart> parts;

	public void setLilyPadColor(int color) {
		this.lilyPadRed = ((color >> 16) & 0xFF) / 255.0f;
		this.lilyPadGreen = ((color >> 8) & 0xFF) / 255.0f;
		this.lilyPadBlue = (color & 0xFF) / 255.0f;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		boolean lilypadHeadVisible = this.lilypad_head.visible;
		boolean lilypadBodyVisible = this.lilypad_body.visible;
		boolean lilypadBackVisible = this.lilypad_back.visible;

		this.lilypad_head.visible = false;
		this.lilypad_body.visible = false;
		this.lilypad_back.visible = false;

		this.getPart().render(matrices, vertices, light, overlay, color);

		this.lilypad_head.visible = lilypadHeadVisible;
		this.lilypad_body.visible = lilypadBodyVisible;
		this.lilypad_back.visible = lilypadBackVisible;

		if (!lilypadHeadVisible && !lilypadBodyVisible && !lilypadBackVisible) {
			return;
		}

		int a = (color >> 24) & 0xFF;
		int r = (color >> 16) & 0xFF;
		int g = (color >> 8) & 0xFF;
		int b = color & 0xFF;

		int lilyPadColor =
				(a << 24)
						| (Math.min(255, Math.round(r * this.lilyPadRed)) << 16)
						| (Math.min(255, Math.round(g * this.lilyPadGreen)) << 8)
						|  Math.min(255, Math.round(b * this.lilyPadBlue));

		if (lilypadHeadVisible) {
			matrices.push();
			this.spider.rotate(matrices);
			this.body.rotate(matrices);
			this.head.rotate(matrices);
			this.lilypad_head.render(matrices, vertices, light, overlay, lilyPadColor);
			matrices.pop();
		}

		if (lilypadBodyVisible) {
			matrices.push();
			this.spider.rotate(matrices);
			this.body.rotate(matrices);
			this.lilypad_body.render(matrices, vertices, light, overlay, lilyPadColor);
			matrices.pop();
		}

		if (lilypadBackVisible) {
			matrices.push();
			this.spider.rotate(matrices);
			this.body.rotate(matrices);
			this.back.rotate(matrices);
			this.lilypad_back.render(matrices, vertices, light, overlay, lilyPadColor);
			matrices.pop();
		}
	}
	@Override
	public void setAngles(SwampSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, swamp_spider_anim.attack, ageInTicks, 1.0f);
		} else if (entity.swimAnimationState.isRunning()) {
			this.updateAnimation(entity.swimAnimationState, swamp_spider_anim.swim, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, swamp_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, swamp_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}
