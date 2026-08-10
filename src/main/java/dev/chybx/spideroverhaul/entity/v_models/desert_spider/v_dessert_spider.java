package dev.chybx.spideroverhaul.entity.v_models.desert_spider;

import dev.chybx.spideroverhaul.entity.DesertSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class v_dessert_spider extends SinglePartEntityModel<DesertSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart head;
	private final ModelPart chelicera_l;
	private final ModelPart flower;
	private final ModelPart chelicera_r;
	private final ModelPart limbs_l;
	private final ModelPart l1;
	private final ModelPart limb_l21;
	private final ModelPart l2;
	private final ModelPart limb_l22;
	private final ModelPart l3;
	private final ModelPart limb_l23;
	private final ModelPart l4;
	private final ModelPart limb_l24;
	private final ModelPart limbs_r;
	private final ModelPart r1;
	private final ModelPart limb_r21;
	private final ModelPart r2;
	private final ModelPart limb_r22;
	private final ModelPart r3;
	private final ModelPart limb_r23;
	private final ModelPart r4;
	private final ModelPart limb_r24;
	public v_dessert_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.head = this.body.getChild("head");
		this.chelicera_l = this.head.getChild("chelicera_l");
		this.flower = this.head.getChild("flower");
		this.chelicera_r = this.head.getChild("chelicera_r");
		this.limbs_l = this.spider.getChild("limbs_l");
		this.l1 = this.limbs_l.getChild("l1");
		this.limb_l21 = this.l1.getChild("limb_l21");
		this.l2 = this.limbs_l.getChild("l2");
		this.limb_l22 = this.l2.getChild("limb_l22");
		this.l3 = this.limbs_l.getChild("l3");
		this.limb_l23 = this.l3.getChild("limb_l23");
		this.l4 = this.limbs_l.getChild("l4");
		this.limb_l24 = this.l4.getChild("limb_l24");
		this.limbs_r = this.spider.getChild("limbs_r");
		this.r1 = this.limbs_r.getChild("r1");
		this.limb_r21 = this.r1.getChild("limb_r21");
		this.r2 = this.limbs_r.getChild("r2");
		this.limb_r22 = this.r2.getChild("limb_r22");
		this.r3 = this.limbs_r.getChild("r3");
		this.limb_r23 = this.r3.getChild("limb_r23");
		this.r4 = this.limbs_r.getChild("r4");
		this.limb_r24 = this.r4.getChild("limb_r24");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData spider = modelPartData.addChild("spider", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.8198F, -0.3133F));

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(26, 19).cuboid(-3.0F, -3.6997F, -2.4722F, 6.0F, 5.0F, 7.0F, new Dilation(0.0F))
		.uv(50, 31).cuboid(0.0F, -6.6997F, -2.4722F, 0.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1201F, -1.2144F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -7.8678F, 0.0759F, 8.0F, 8.0F, 11.0F, new Dilation(0.0F))
		.uv(26, 31).cuboid(4.0F, -7.8678F, 1.0759F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F))
		.uv(0, 43).cuboid(4.0F, 0.1322F, 0.0759F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F))
		.uv(48, 42).cuboid(-5.0F, 0.1322F, 0.0759F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F))
		.uv(38, 0).cuboid(-5.0F, -7.8678F, 1.0759F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.168F, 4.4518F));

		ModelPartData cube_r1 = back.addChild("cube_r1", ModelPartBuilder.create().uv(24, 42).cuboid(-0.5F, 0.0F, -5.5F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -8.3678F, 5.5759F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r2 = back.addChild("cube_r2", ModelPartBuilder.create().uv(0, 32).cuboid(-0.5F, 0.0F, -5.5F, 1.0F, 0.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -8.3678F, 5.5759F, 0.0F, 0.0F, -1.5708F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(24, 53).cuboid(3.0F, -0.7154F, -5.088F, 4.0F, 0.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-3.0F, -3.7154F, -7.088F, 6.0F, 6.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.9843F, -2.3843F));

		ModelPartData chelicera_l = head.addChild("chelicera_l", ModelPartBuilder.create(), ModelTransform.pivot(2.525F, 1.2481F, -6.3359F));

		ModelPartData cube_r3 = chelicera_l.addChild("cube_r3", ModelPartBuilder.create().uv(38, 15).cuboid(5.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 3.1416F, 1.5272F, 1.5708F));

		ModelPartData cube_r4 = chelicera_l.addChild("cube_r4", ModelPartBuilder.create().uv(42, 53).cuboid(-4.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.375F, -1.5577F, 7.123F, 0.0F, 0.0F, -1.5708F));

		ModelPartData flower = head.addChild("flower", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, -5.7096F, 0.037F));

		ModelPartData cube_r5 = flower.addChild("cube_r5", ModelPartBuilder.create().uv(52, 15).cuboid(0.0F, -5.0F, -3.5F, 0.0F, 6.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.9942F, -3.625F, 0.0F, 0.0F, -1.1781F));

		ModelPartData cube_r6 = flower.addChild("cube_r6", ModelPartBuilder.create().uv(52, 15).cuboid(0.0F, -5.0F, -3.5F, 0.0F, 6.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.9942F, -3.625F, 0.0F, 0.0F, 1.1781F));

		ModelPartData cube_r7 = flower.addChild("cube_r7", ModelPartBuilder.create().uv(52, 15).cuboid(0.0F, -5.0F, -3.5F, 0.0F, 6.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.9942F, -3.625F, -1.5708F, -0.3927F, 1.5708F));

		ModelPartData cube_r8 = flower.addChild("cube_r8", ModelPartBuilder.create().uv(52, 15).cuboid(0.0F, -5.0F, -3.5F, 0.0F, 6.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.9942F, -3.625F, 1.5708F, -0.3927F, -1.5708F));

		ModelPartData chelicera_r = head.addChild("chelicera_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 0.8481F, -7.0859F));

		ModelPartData cube_r9 = chelicera_r.addChild("cube_r9", ModelPartBuilder.create().uv(38, 15).mirrored().cuboid(-8.7723F, 2.35F, -6.4582F, 3.0F, 0.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 3.1416F, -1.5272F, -1.5708F));

		ModelPartData cube_r10 = chelicera_r.addChild("cube_r10", ModelPartBuilder.create().uv(42, 53).mirrored().cuboid(1.5442F, 1.35F, -8.875F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.35F, -1.1577F, 7.873F, 0.0F, 0.0F, 1.5708F));

		ModelPartData limbs_l = spider.addChild("limbs_l", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData l1 = limbs_l.addChild("l1", ModelPartBuilder.create().uv(38, 11).cuboid(0.0F, -2.0F, 0.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limb_l21 = l1.addChild("limb_l21", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData l2 = limbs_l.addChild("l2", ModelPartBuilder.create().uv(38, 11).cuboid(0.0F, -2.0F, 0.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limb_l22 = l2.addChild("limb_l22", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -2.5F, 1.3333F));

		ModelPartData l3 = limbs_l.addChild("l3", ModelPartBuilder.create().uv(38, 11).cuboid(0.0F, -2.0F, -2.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limb_l23 = l3.addChild("limb_l23", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData l4 = limbs_l.addChild("l4", ModelPartBuilder.create().uv(38, 11).cuboid(0.0F, -2.0F, -2.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limb_l24 = l4.addChild("limb_l24", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -2.5F, -1.3333F));

		ModelPartData limbs_r = spider.addChild("limbs_r", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData r1 = limbs_r.addChild("r1", ModelPartBuilder.create().uv(38, 11).mirrored().cuboid(-13.0F, -2.0F, 0.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -7.0917F));

		ModelPartData limb_r21 = r1.addChild("limb_r21", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData r2 = limbs_r.addChild("r2", ModelPartBuilder.create().uv(38, 11).mirrored().cuboid(-13.0F, -2.0F, 0.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -6.0917F));

		ModelPartData limb_r22 = r2.addChild("limb_r22", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -2.5F, 1.3333F));

		ModelPartData r3 = limbs_r.addChild("r3", ModelPartBuilder.create().uv(38, 11).mirrored().cuboid(-13.0F, -2.0F, -2.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -1.925F));

		ModelPartData limb_r23 = r3.addChild("limb_r23", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));

		ModelPartData r4 = limbs_r.addChild("r4", ModelPartBuilder.create().uv(38, 11).mirrored().cuboid(-13.0F, -2.0F, -2.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -0.925F));

		ModelPartData limb_r24 = r4.addChild("limb_r24", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -2.5F, -1.3333F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(DesertSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, v_dessert_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, v_dessert_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, v_dessert_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}
