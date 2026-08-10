package dev.chybx.spideroverhaul.entity.models.taiga_spider;

import dev.chybx.spideroverhaul.entity.TaigaSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class taiga_spider extends SinglePartEntityModel<TaigaSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;
	private final ModelPart hair;
	private final ModelPart limbsL;
	private final ModelPart L1;
	private final ModelPart limb1L2;
	private final ModelPart L2;
	private final ModelPart limb2L2;
	private final ModelPart L3;
	private final ModelPart limb3L2;
	private final ModelPart L4;
	private final ModelPart limb4L2;
	private final ModelPart limbsR;
	private final ModelPart R1;
	private final ModelPart limb1R2;
	private final ModelPart R2;
	private final ModelPart limb2R2;
	private final ModelPart R3;
	private final ModelPart limb3R2;
	private final ModelPart R4;
	private final ModelPart limb4R2;
	public taiga_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.hair = this.head.getChild("hair");
		this.limbsL = this.spider.getChild("limbsL");
		this.L1 = this.limbsL.getChild("L1");
		this.limb1L2 = this.L1.getChild("limb1L2");
		this.L2 = this.limbsL.getChild("L2");
		this.limb2L2 = this.L2.getChild("limb2L2");
		this.L3 = this.limbsL.getChild("L3");
		this.limb3L2 = this.L3.getChild("limb3L2");
		this.L4 = this.limbsL.getChild("L4");
		this.limb4L2 = this.L4.getChild("limb4L2");
		this.limbsR = this.spider.getChild("limbsR");
		this.R1 = this.limbsR.getChild("R1");
		this.limb1R2 = this.R1.getChild("limb1R2");
		this.R2 = this.limbsR.getChild("R2");
		this.limb2R2 = this.R2.getChild("limb2R2");
		this.R3 = this.limbsR.getChild("R3");
		this.limb3R2 = this.R3.getChild("limb3R2");
		this.R4 = this.limbsR.getChild("R4");
		this.limb4R2 = this.R4.getChild("limb4R2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.8198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(30, 20).cuboid(-3.0F, -3.6997F, -2.4722F, 6.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1201F, -1.2144F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.8678F, 0.0759F, 8.0F, 9.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.168F, 4.4518F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 20).cuboid(-4.0F, -4.7154F, -7.088F, 8.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.9843F, -2.3843F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.35F, 0.8481F, -7.0859F));

		ModelPartData cube_r1 = cheliceraL.addChild("cube_r1", ModelPartBuilder.create().uv(38, 0).cuboid(5.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.35F, -1.5577F, 7.123F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r2 = cheliceraL.addChild("cube_r2", ModelPartBuilder.create().uv(1, 38).cuboid(-4.5442F, 0.35F, -8.875F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.35F, -1.5577F, 7.123F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-2.35F, 0.8481F, -7.0859F));

		ModelPartData cube_r3 = cheliceraR.addChild("cube_r3", ModelPartBuilder.create().uv(38, 0).mirrored().cuboid(-8.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.5577F, 7.123F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r4 = cheliceraR.addChild("cube_r4", ModelPartBuilder.create().uv(1, 38).mirrored().cuboid(2.5442F, 0.35F, -8.875F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.5577F, 7.123F, 0.0F, 0.0F, 1.5708F));

		ModelPartData hair = head.addChild("hair", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.7308F, -6.2402F));

		ModelPartData cube_r5 = hair.addChild("cube_r5", ModelPartBuilder.create().uv(23, 7).cuboid(-4.0F, -6.0448F, -4.1258F, 8.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0212F, 6.2022F, 0.3927F, 0.0F, 0.0F));

		ModelPartData limbsL = spider.addChild("limbsL", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData L1 = limbsL.addChild("L1", ModelPartBuilder.create().uv(0, 34).cuboid(0.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limb1L2 = L1.addChild("limb1L2", ModelPartBuilder.create().uv(30, 32).cuboid(0.0F, -1.0F, -2.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 34).cuboid(9.0F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L2 = limbsL.addChild("L2", ModelPartBuilder.create().uv(0, 34).cuboid(0.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limb2L2 = L2.addChild("limb2L2", ModelPartBuilder.create().uv(30, 32).cuboid(0.0F, -1.0F, -2.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 34).cuboid(9.0F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData L3 = limbsL.addChild("L3", ModelPartBuilder.create().uv(0, 34).cuboid(0.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limb3L2 = L3.addChild("limb3L2", ModelPartBuilder.create().uv(30, 32).cuboid(0.0F, -1.0F, -1.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 34).cuboid(9.0F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData L4 = limbsL.addChild("L4", ModelPartBuilder.create().uv(0, 34).cuboid(0.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limb4L2 = L4.addChild("limb4L2", ModelPartBuilder.create().uv(30, 32).cuboid(0.0F, -1.0F, -1.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 34).cuboid(9.0F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData limbsR = spider.addChild("limbsR", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData R1 = limbsR.addChild("R1", ModelPartBuilder.create().uv(0, 34).mirrored().cuboid(-8.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limb1R2 = R1.addChild("limb1R2", ModelPartBuilder.create().uv(30, 32).mirrored().cuboid(-9.0F, -1.0F, -2.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 34).mirrored().cuboid(-11.0F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R2 = limbsR.addChild("R2", ModelPartBuilder.create().uv(0, 34).mirrored().cuboid(-8.0F, -2.0F, 0.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limb2R2 = R2.addChild("limb2R2", ModelPartBuilder.create().uv(30, 32).mirrored().cuboid(-9.0F, -1.0F, -2.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 34).mirrored().cuboid(-11.0F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData R3 = limbsR.addChild("R3", ModelPartBuilder.create().uv(0, 34).mirrored().cuboid(-8.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limb3R2 = R3.addChild("limb3R2", ModelPartBuilder.create().uv(20, 34).mirrored().cuboid(-11.0F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(30, 32).mirrored().cuboid(-9.0F, -1.0F, -1.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));

		ModelPartData R4 = limbsR.addChild("R4", ModelPartBuilder.create().uv(0, 34).mirrored().cuboid(-8.0F, -2.0F, -2.0833F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limb4R2 = R4.addChild("limb4R2", ModelPartBuilder.create().uv(30, 32).mirrored().cuboid(-9.0F, -1.0F, -1.0F, 9.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 34).mirrored().cuboid(-11.0F, 1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(TaigaSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, taiga_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, taiga_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, taiga_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}
