package dev.chybx.spideroverhaul.entity.v_models.savanna_spider;

import dev.chybx.spideroverhaul.entity.SavannaSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class v_savanna_spider extends SinglePartEntityModel<SavannaSpiderEntity> {
	private final ModelPart spider;
	private final ModelPart body;
	private final ModelPart back;
	private final ModelPart head;
	private final ModelPart cheliceraL;
	private final ModelPart cheliceraR;
	private final ModelPart hair;
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
	public v_savanna_spider(ModelPart root) {
		this.spider = root.getChild("spider");
		this.body = this.spider.getChild("body");
		this.back = this.body.getChild("back");
		this.head = this.body.getChild("head");
		this.cheliceraL = this.head.getChild("cheliceraL");
		this.cheliceraR = this.head.getChild("cheliceraR");
		this.hair = this.head.getChild("hair");
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

		ModelPartData body = spider.addChild("body", ModelPartBuilder.create().uv(30, 23).cuboid(-3.0F, -3.6997F, -2.4722F, 6.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.1201F, -1.2144F));

		ModelPartData back = body.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.8678F, -2.9241F, 8.0F, 9.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.168F, 4.4518F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 19).cuboid(-4.0F, -4.7154F, -7.088F, 8.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.9843F, -2.3843F));

		ModelPartData cheliceraL = head.addChild("cheliceraL", ModelPartBuilder.create(), ModelTransform.pivot(2.35F, 0.8481F, -7.0859F));

		ModelPartData cube_r1 = cheliceraL.addChild("cube_r1", ModelPartBuilder.create().uv(0, 33).cuboid(-4.5442F, 0.35F, -8.875F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.7F, -2.1077F, 7.873F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cheliceraR = head.addChild("cheliceraR", ModelPartBuilder.create(), ModelTransform.pivot(-2.35F, 0.8481F, -7.0859F));

		ModelPartData cube_r2 = cheliceraR.addChild("cube_r2", ModelPartBuilder.create().uv(10, 33).cuboid(1.5442F, 0.35F, -8.875F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.7F, -2.1077F, 7.873F, 0.0F, 0.0F, 1.5708F));

		ModelPartData hair = head.addChild("hair", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.7154F, -7.088F));

		ModelPartData cube_r3 = hair.addChild("cube_r3", ModelPartBuilder.create().uv(30, 32).cuboid(-8.0F, 0.001F, 0.0F, 8.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData limbs_l = spider.addChild("limbs_l", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.1802F, 3.3217F));

		ModelPartData l1 = limbs_l.addChild("l1", ModelPartBuilder.create().uv(30, 19).cuboid(0.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData l2 = limbs_l.addChild("l2", ModelPartBuilder.create().uv(30, 19).cuboid(0.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData l3 = limbs_l.addChild("l3", ModelPartBuilder.create().uv(30, 19).cuboid(0.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData l4 = limbs_l.addChild("l4", ModelPartBuilder.create().uv(30, 19).cuboid(0.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -1.925F));

		ModelPartData limbs_r = spider.addChild("limbs_r", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 0.1802F, 3.3217F));

		ModelPartData r1 = limbs_r.addChild("r1", ModelPartBuilder.create().uv(30, 19).mirrored().cuboid(-13.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -6.0917F));

		ModelPartData r2 = limbs_r.addChild("r2", ModelPartBuilder.create().uv(30, 19).mirrored().cuboid(-13.0F, -1.0F, -0.9167F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -5.0917F));

		ModelPartData r3 = limbs_r.addChild("r3", ModelPartBuilder.create().uv(30, 19).mirrored().cuboid(-13.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -2.925F));

		ModelPartData r4 = limbs_r.addChild("r4", ModelPartBuilder.create().uv(30, 19).mirrored().cuboid(-13.0F, -1.0F, -1.0833F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -1.0F, -1.925F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SavannaSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, v_savanna_spider_anim.attack, ageInTicks, 1.0f);
		} else {
			this.updateAnimation(entity.walkAnimationState, v_savanna_spider_anim.walk, ageInTicks, 1.0f);
			this.updateAnimation(entity.idleAnimationState, v_savanna_spider_anim.idle, ageInTicks, 1.0f);
		}

		this.head.yaw = netHeadYaw * ((float)Math.PI / 180F);
		this.head.pitch = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public ModelPart getPart() {
		return spider;
	}
}