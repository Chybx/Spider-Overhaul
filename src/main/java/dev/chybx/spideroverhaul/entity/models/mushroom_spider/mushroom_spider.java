package dev.chybx.spideroverhaul.entity.models.mushroom_spider;

import dev.chybx.spideroverhaul.entity.MushroomSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class mushroom_spider extends SinglePartEntityModel<MushroomSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart mushroom;
	private final ModelPart mushroom2;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;
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
	public mushroom_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.mushroom = this.back.getChild("mushroom");
		this.mushroom2 = this.back.getChild("mushroom2");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.cheliceraR = this.head.getChild("cheliceraR");
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
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.8198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(38, 18).cuboid(-3.0F, -3.6997F, -2.4722F, 6.0F, 5.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 37).cuboid(-3.5F, -3.9497F, -2.9722F, 7.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1201F, -1.2144F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 18).cuboid(-4.0F, -7.8678F, 0.0759F, 8.0F, 8.0F, 11.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.5F, -8.1178F, -0.4241F, 9.0F, 6.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.168F, 4.4518F));

		ModelPartData mushroom = back.addChild("mushroom", ModelPartBuilder.create(), ModelTransform.pivot(0.5F, -9.6178F, 2.5759F));

		ModelPartData cube_r1 = mushroom.addChild("cube_r1", ModelPartBuilder.create().uv(34, 51).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r2 = mushroom.addChild("cube_r2", ModelPartBuilder.create().uv(34, 51).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData mushroom2 = back.addChild("mushroom2", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, -8.6178F, 8.5759F));

		ModelPartData cube_r3 = mushroom2.addChild("cube_r3", ModelPartBuilder.create().uv(42, 51).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r4 = mushroom2.addChild("cube_r4", ModelPartBuilder.create().uv(42, 51).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(30, 37).cuboid(-3.0F, -4.7154F, -7.088F, 6.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.9843F, -2.3843F));

		ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(42, 0).cuboid(-3.0F, -14.0448F, -2.1258F, 8.0F, 9.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.5896F, -13.1328F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.525F, 1.2481F, -6.3359F));

		ModelPartData cube_r6 = cheliceraL.addChild("cube_r6", ModelPartBuilder.create().uv(0, 51).cuboid(5.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r7 = cheliceraL.addChild("cube_r7", ModelPartBuilder.create().uv(14, 51).cuboid(-4.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 0.8481F, -7.0859F));

		ModelPartData cube_r8 = cheliceraR.addChild("cube_r8", ModelPartBuilder.create().uv(0, 51).mirrored().cuboid(-8.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r9 = cheliceraR.addChild("cube_r9", ModelPartBuilder.create().uv(14, 51).mirrored().cuboid(1.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 0.0F, 0.0F, 1.5708F));

		ModelPartData limbsL = spider.addChild("limbsL", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData L1 = limbsL.addChild("L1", ModelPartBuilder.create().uv(42, 12).cuboid(0.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limbL21 = L1.addChild("limbL21", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.45F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 51).cuboid(9.0F, 1.0F, -1.45F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L2 = limbsL.addChild("L2", ModelPartBuilder.create().uv(42, 12).cuboid(0.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limbL22 = L2.addChild("limbL22", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.45F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 51).cuboid(9.0F, 1.0F, -1.45F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L3 = limbsL.addChild("L3", ModelPartBuilder.create().uv(42, 12).cuboid(0.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limbL23 = L3.addChild("limbL23", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.0F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 51).cuboid(9.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData L4 = limbsL.addChild("L4", ModelPartBuilder.create().uv(42, 12).cuboid(0.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limbL24 = L4.addChild("limbL24", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.0F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 51).cuboid(9.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData limbsR = spider.addChild("limbsR", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData R1 = limbsR.addChild("R1", ModelPartBuilder.create().uv(42, 12).mirrored().cuboid(-8.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limbR21 = R1.addChild("limbR21", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-9.0F, -1.0F, -1.25F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(26, 51).mirrored().cuboid(-11.0F, 1.0F, -1.25F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R2 = limbsR.addChild("R2", ModelPartBuilder.create().uv(42, 12).mirrored().cuboid(-8.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limbR22 = R2.addChild("limbR22", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-9.0F, -1.0F, -1.25F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(26, 51).mirrored().cuboid(-11.0F, 1.0F, -1.25F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R3 = limbsR.addChild("R3", ModelPartBuilder.create().uv(42, 12).mirrored().cuboid(-8.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limbR23 = R3.addChild("limbR23", ModelPartBuilder.create().uv(26, 51).mirrored().cuboid(-11.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(38, 30).mirrored().cuboid(-9.0F, -1.0F, -1.0F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));

		ModelPartData R4 = limbsR.addChild("R4", ModelPartBuilder.create().uv(42, 12).mirrored().cuboid(-8.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limbR24 = R4.addChild("limbR24", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-9.0F, -1.0F, -1.0F, 9.0F, 3.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(26, 51).mirrored().cuboid(-11.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(MushroomSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, mushroom_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, mushroom_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, mushroom_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}