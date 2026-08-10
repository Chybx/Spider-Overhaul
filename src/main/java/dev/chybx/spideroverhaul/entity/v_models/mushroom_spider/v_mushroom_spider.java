package dev.chybx.spideroverhaul.entity.v_models.mushroom_spider;

import dev.chybx.spideroverhaul.entity.MushroomSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class v_mushroom_spider extends SinglePartEntityModel<MushroomSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart mushroom;
	private final ModelPart mushroom2;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;
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
	public v_mushroom_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.mushroom = this.back.getChild("mushroom");
		this.mushroom2 = this.back.getChild("mushroom2");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.limbs_l = this.spider.getChild("limbs_l");
		this.l1 = this.limbs_l.getChild("l1");
		this.l2 = this.limbs_l.getChild("l2");
		this.l3 = this.limbs_l.getChild("l3");
		this.l4 = this.limbs_l.getChild("l4");
		this.limbs_r = this.spider.getChild("limbs_r");
		this.r1 = this.limbs_r.getChild("r1");
		this.r2 = this.limbs_r.getChild("r2");
		this.r3 = this.limbs_r.getChild("r3");
		this.r4 = this.limbs_r.getChild("r4");
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

		ModelPartData cube_r1 = mushroom.addChild("cube_r1", ModelPartBuilder.create().uv(38, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r2 = mushroom.addChild("cube_r2", ModelPartBuilder.create().uv(38, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData mushroom2 = back.addChild("mushroom2", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, -8.6178F, 8.5759F));

		ModelPartData cube_r3 = mushroom2.addChild("cube_r3", ModelPartBuilder.create().uv(46, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r4 = mushroom2.addChild("cube_r4", ModelPartBuilder.create().uv(46, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(30, 37).cuboid(-3.0F, -4.7154F, -7.088F, 6.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.9843F, -2.3843F));

		ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(42, 0).cuboid(-3.0F, -14.0448F, -2.1258F, 8.0F, 9.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.5896F, -13.1328F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.525F, 1.2481F, -6.3359F));

		ModelPartData cube_r6 = cheliceraL.addChild("cube_r6", ModelPartBuilder.create().uv(42, 12).cuboid(5.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r7 = cheliceraL.addChild("cube_r7", ModelPartBuilder.create().uv(0, 51).cuboid(-4.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 0.8481F, -7.0859F));

		ModelPartData cube_r8 = cheliceraR.addChild("cube_r8", ModelPartBuilder.create().uv(42, 12).mirrored().cuboid(-8.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r9 = cheliceraR.addChild("cube_r9", ModelPartBuilder.create().uv(0, 51).mirrored().cuboid(1.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 0.0F, 0.0F, 1.5708F));

		ModelPartData limbs_l = spider.addChild("limbs_l", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData l1 = limbs_l.addChild("l1", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData l2 = limbs_l.addChild("l2", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData l3 = limbs_l.addChild("l3", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData l4 = limbs_l.addChild("l4", ModelPartBuilder.create().uv(38, 30).cuboid(0.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -1.925F));

		ModelPartData limbs_r = spider.addChild("limbs_r", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData r1 = limbs_r.addChild("r1", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-13.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData r2 = limbs_r.addChild("r2", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-13.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData r3 = limbs_r.addChild("r3", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-13.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData r4 = limbs_r.addChild("r4", ModelPartBuilder.create().uv(38, 30).mirrored().cuboid(-13.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -1.925F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(MushroomSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, v_mushroom_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, v_mushroom_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, v_mushroom_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}