package dev.chybx.spideroverhaul.entity.models.savanna_spider;

import dev.chybx.spideroverhaul.entity.SavannaSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class savanna_spider extends SinglePartEntityModel<SavannaSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;
	private final ModelPart hair;
	private final ModelPart limbsL;
	private final ModelPart L1;
	private final ModelPart L21;
	private final ModelPart L2;
	private final ModelPart L22;
	private final ModelPart L3;
	private final ModelPart L23;
	private final ModelPart L4;
	private final ModelPart L24;
	private final ModelPart limbsR;
	private final ModelPart R1;
	private final ModelPart R21;
	private final ModelPart R2;
	private final ModelPart R22;
	private final ModelPart R3;
	private final ModelPart R23;
	private final ModelPart R4;
	private final ModelPart R24;
	public savanna_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.hair = this.head.getChild("hair");
		this.limbsL = this.spider.getChild("limbsL");
		this.L1 = this.limbsL.getChild("L1");
		this.L21 = this.L1.getChild("L21");
		this.L2 = this.limbsL.getChild("L2");
		this.L22 = this.L2.getChild("L22");
		this.L3 = this.limbsL.getChild("L3");
		this.L23 = this.L3.getChild("L23");
		this.L4 = this.limbsL.getChild("L4");
		this.L24 = this.L4.getChild("L24");
		this.limbsR = this.spider.getChild("limbsR");
		this.R1 = this.limbsR.getChild("R1");
		this.R21 = this.R1.getChild("R21");
		this.R2 = this.limbsR.getChild("R2");
		this.R22 = this.R2.getChild("R22");
		this.R3 = this.limbsR.getChild("R3");
		this.R23 = this.R3.getChild("R23");
		this.R4 = this.limbsR.getChild("R4");
		this.R24 = this.R4.getChild("R24");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.8198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(30, 19).cuboid(-3.0F, -3.6997F, -2.4722F, 6.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1201F, -1.2144F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.8678F, -2.9241F, 8.0F, 9.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.168F, 4.4518F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 19).cuboid(-4.0F, -3.6568F, -0.876F, 8.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.043F, -8.5962F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.35F, 1.9067F, -0.874F));

		ModelPartData cube_r1 = cheliceraL.addChild("cube_r1", ModelPartBuilder.create().uv(36, 0).cuboid(-4.5442F, 0.35F, -8.875F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.7F, -2.1077F, 7.873F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-2.35F, 1.9067F, -0.874F));

		ModelPartData cube_r2 = cheliceraR.addChild("cube_r2", ModelPartBuilder.create().uv(36, 5).cuboid(1.5442F, 0.35F, -8.875F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7F, -2.1077F, 7.873F, 0.0F, 0.0F, 1.5708F));

		ModelPartData hair = head.addChild("hair", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.6568F, -0.876F));

		ModelPartData cube_r3 = hair.addChild("cube_r3", ModelPartBuilder.create().uv(0, 33).cuboid(-8.0F, 0.001F, 0.0F, 8.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData limbsL = spider.addChild("limbsL", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData L1 = limbsL.addChild("L1", ModelPartBuilder.create().uv(24, 33).cuboid(-0.5F, -1.5F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData L21 = L1.addChild("L21", ModelPartBuilder.create().uv(30, 28).cuboid(1.0F, -0.5F, -2.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(36, 10).cuboid(10.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L2 = limbsL.addChild("L2", ModelPartBuilder.create().uv(24, 33).cuboid(-0.5F, -1.5F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData L22 = L2.addChild("L22", ModelPartBuilder.create().uv(30, 28).cuboid(1.0F, -0.5F, -2.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(36, 10).cuboid(10.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L3 = limbsL.addChild("L3", ModelPartBuilder.create().uv(24, 33).cuboid(-0.5F, -1.5F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData L23 = L3.addChild("L23", ModelPartBuilder.create().uv(30, 28).cuboid(1.0F, -0.5F, -1.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(36, 10).cuboid(10.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData L4 = limbsL.addChild("L4", ModelPartBuilder.create().uv(24, 33).cuboid(-0.5F, -1.5F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData L24 = L4.addChild("L24", ModelPartBuilder.create().uv(30, 28).cuboid(1.0F, -0.5F, -1.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F))
				.uv(36, 10).cuboid(10.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData limbsR = spider.addChild("limbsR", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData R1 = limbsR.addChild("R1", ModelPartBuilder.create().uv(24, 33).mirrored().cuboid(-7.5F, -1.5F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData R21 = R1.addChild("R21", ModelPartBuilder.create().uv(30, 28).mirrored().cuboid(-10.0F, -0.5F, -2.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(36, 10).mirrored().cuboid(-12.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R2 = limbsR.addChild("R2", ModelPartBuilder.create().uv(24, 33).mirrored().cuboid(-7.5F, -1.5F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData R22 = R2.addChild("R22", ModelPartBuilder.create().uv(30, 28).mirrored().cuboid(-10.0F, -0.5F, -2.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(36, 10).mirrored().cuboid(-12.0F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R3 = limbsR.addChild("R3", ModelPartBuilder.create().uv(24, 33).mirrored().cuboid(-7.5F, -1.5F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData R23 = R3.addChild("R23", ModelPartBuilder.create().uv(36, 10).mirrored().cuboid(-12.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(30, 28).mirrored().cuboid(-10.0F, -0.5F, -1.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));

		ModelPartData R4 = limbsR.addChild("R4", ModelPartBuilder.create().uv(24, 33).mirrored().cuboid(-7.5F, -1.5F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData R24 = R4.addChild("R24", ModelPartBuilder.create().uv(30, 28).mirrored().cuboid(-10.0F, -0.5F, -1.0F, 9.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
				.uv(36, 10).mirrored().cuboid(-12.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SavannaSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, savanna_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, savanna_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, savanna_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}
