package dev.chybx.spideroverhaul.entity.models.spider_crab;

import dev.chybx.spideroverhaul.entity.OceanSpiderEntity;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

public class spider_crab extends SinglePartEntityModel<OceanSpiderEntity> {
	private final ModelPart crab_body;
	private final ModelPart limbR;
	private final ModelPart forelimb;
	private final ModelPart clawHigh;
	private final ModelPart clawLow;
	private final ModelPart limbL;
	private final ModelPart forelimb2;
	private final ModelPart clawHigh2;
	private final ModelPart clawLow2;
	private final ModelPart body;
	private final ModelPart mandibleR;
	private final ModelPart mandibleL;
	private final ModelPart legsL;
	private final ModelPart leg;
	private final ModelPart low;
	private final ModelPart leg2;
	private final ModelPart low2;
	private final ModelPart leg3;
	private final ModelPart low3;
	private final ModelPart backLeg;
	private final ModelPart backLow;
	private final ModelPart legsR;
	private final ModelPart backLeg2;
	private final ModelPart backLow2;
	private final ModelPart leg7;
	private final ModelPart low7;
	private final ModelPart leg6;
	private final ModelPart low6;
	private final ModelPart leg5;
	private final ModelPart low5;

	public spider_crab(ModelPart root) {
		this.crab_body = root.getChild("crab_body");
		this.limbR = this.crab_body.getChild("limbR");
		this.forelimb = this.limbR.getChild("forelimb");
		this.clawHigh = this.forelimb.getChild("clawHigh");
		this.clawLow = this.forelimb.getChild("clawLow");
		this.limbL = this.crab_body.getChild("limbL");
		this.forelimb2 = this.limbL.getChild("forelimb2");
		this.clawHigh2 = this.forelimb2.getChild("clawHigh2");
		this.clawLow2 = this.forelimb2.getChild("clawLow2");
		this.body = this.crab_body.getChild("body");
		this.mandibleR = this.crab_body.getChild("mandibleR");
		this.mandibleL = this.crab_body.getChild("mandibleL");
		this.legsL = this.crab_body.getChild("legsL");
		this.leg = this.legsL.getChild("leg");
		this.low = this.leg.getChild("low");
		this.leg2 = this.legsL.getChild("leg2");
		this.low2 = this.leg2.getChild("low2");
		this.leg3 = this.legsL.getChild("leg3");
		this.low3 = this.leg3.getChild("low3");
		this.backLeg = this.legsL.getChild("backLeg");
		this.backLow = this.backLeg.getChild("backLow");
		this.legsR = this.crab_body.getChild("legsR");
		this.backLeg2 = this.legsR.getChild("backLeg2");
		this.backLow2 = this.backLeg2.getChild("backLow2");
		this.leg7 = this.legsR.getChild("leg7");
		this.low7 = this.leg7.getChild("low7");
		this.leg6 = this.legsR.getChild("leg6");
		this.low6 = this.leg6.getChild("low6");
		this.leg5 = this.legsR.getChild("leg5");
		this.low5 = this.leg5.getChild("low5");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData crab_body = modelPartData.addChild("crab_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

		ModelPartData limbR = crab_body.addChild("limbR", ModelPartBuilder.create().uv(0, 32).cuboid(0.0F, -1.01F, -11.0F, 2.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 2.0F, -5.0F));

		ModelPartData forelimb = limbR.addChild("forelimb", ModelPartBuilder.create().uv(26, 32).cuboid(-2.0F, -1.01F, -11.0F, 2.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, -11.0F));

		ModelPartData clawHigh = forelimb.addChild("clawHigh", ModelPartBuilder.create().uv(0, 49).cuboid(-2.0F, -2.01F, -5.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, -11.0F));

		ModelPartData clawLow = forelimb.addChild("clawLow", ModelPartBuilder.create().uv(32, 49).cuboid(-2.0F, -0.01F, -5.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, -11.0F));

		ModelPartData limbL = crab_body.addChild("limbL", ModelPartBuilder.create().uv(0, 32).mirrored().cuboid(-2.0F, -1.01F, -11.0F, 2.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 2.0F, -5.0F));

		ModelPartData forelimb2 = limbL.addChild("forelimb2", ModelPartBuilder.create().uv(26, 32).mirrored().cuboid(0.0F, -1.01F, -11.0F, 2.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, -11.0F));

		ModelPartData clawHigh2 = forelimb2.addChild("clawHigh2", ModelPartBuilder.create().uv(0, 49).mirrored().cuboid(-1.0F, -2.01F, -5.0F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -11.0F));

		ModelPartData clawLow2 = forelimb2.addChild("clawLow2", ModelPartBuilder.create().uv(32, 49).mirrored().cuboid(-1.0F, -0.01F, -5.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, -11.0F));

		ModelPartData body = crab_body.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -7.495F, -5.0F, 10.0F, 8.0F, 10.0F, new Dilation(0.0F))
		.uv(16, 49).cuboid(-3.0F, -7.495F, -7.0F, 6.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 53).cuboid(0.0F, -4.505F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 41).cuboid(-2.0F, -4.505F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.505F, 0.0F));

		ModelPartData mandibleR = crab_body.addChild("mandibleR", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -2.0F, -7.0F));

		ModelPartData mandibleL = crab_body.addChild("mandibleL", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -2.0F, -7.0F));

		ModelPartData legsL = crab_body.addChild("legsL", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leg = legsL.addChild("leg", ModelPartBuilder.create().uv(40, 0).cuboid(0.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 2.0F, -4.0F));

		ModelPartData low = leg.addChild("low", ModelPartBuilder.create().uv(40, 4).cuboid(0.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 32).cuboid(12.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -1.0F, 0.0F));

		ModelPartData leg2 = legsL.addChild("leg2", ModelPartBuilder.create().uv(40, 8).cuboid(0.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 2.0F, 0.0F));

		ModelPartData low2 = leg2.addChild("low2", ModelPartBuilder.create().uv(40, 12).cuboid(0.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 35).cuboid(12.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -1.0F, 0.0F));

		ModelPartData leg3 = legsL.addChild("leg3", ModelPartBuilder.create().uv(0, 45).cuboid(0.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 2.0F, 4.0F));

		ModelPartData low3 = leg3.addChild("low3", ModelPartBuilder.create().uv(28, 45).cuboid(0.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 38).cuboid(12.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -1.0F, 0.0F));

		ModelPartData backLeg = legsL.addChild("backLeg", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 3.0F, 4.0F));

		ModelPartData backLow = backLeg.addChild("backLow", ModelPartBuilder.create().uv(48, 49).cuboid(-1.0F, -1.75F, 12.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(28, 18).cuboid(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.25F, 11.0F));

		ModelPartData legsR = crab_body.addChild("legsR", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData backLeg2 = legsR.addChild("backLeg2", ModelPartBuilder.create().uv(0, 18).mirrored().cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 3.0F, 4.0F));

		ModelPartData backLow2 = backLeg2.addChild("backLow2", ModelPartBuilder.create().uv(28, 18).mirrored().cuboid(-1.0F, -1.75F, 0.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F))
		.uv(48, 49).mirrored().cuboid(-1.0F, -1.75F, 12.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.25F, 11.0F));

		ModelPartData leg7 = legsR.addChild("leg7", ModelPartBuilder.create().uv(0, 45).mirrored().cuboid(-12.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 2.0F, 4.0F));

		ModelPartData low7 = leg7.addChild("low7", ModelPartBuilder.create().uv(28, 45).mirrored().cuboid(-12.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 38).mirrored().cuboid(-15.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-11.0F, -1.0F, 0.0F));

		ModelPartData leg6 = legsR.addChild("leg6", ModelPartBuilder.create().uv(40, 8).mirrored().cuboid(-12.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 2.0F, 0.0F));

		ModelPartData low6 = leg6.addChild("low6", ModelPartBuilder.create().uv(40, 12).mirrored().cuboid(-12.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 35).mirrored().cuboid(-15.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-11.0F, -1.0F, 0.0F));

		ModelPartData leg5 = legsR.addChild("leg5", ModelPartBuilder.create().uv(40, 0).mirrored().cuboid(-12.0F, -1.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 2.0F, -4.0F));

		ModelPartData low5 = leg5.addChild("low5", ModelPartBuilder.create().uv(52, 32).mirrored().cuboid(-15.0F, -2.0F, -0.99F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 4).mirrored().cuboid(-12.0F, -2.0F, -0.99F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-11.0F, -1.0F, 0.0F));

		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(OceanSpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		if (entity.attackAnimationState.isRunning()) {
			this.updateAnimation(entity.attackAnimationState, spider_crab_anim.attack, ageInTicks, 1.0f);
		} else if (entity.leapAnimationState.isRunning()) {
			this.updateAnimation(entity.leapAnimationState, spider_crab_anim.leap, ageInTicks, 1.0f);
		} else if (entity.walkAnimationState.isRunning()) {
			this.updateAnimation(entity.walkAnimationState, spider_crab_anim.walk, ageInTicks, 1.0f);
		} else if (entity.idleAnimationState.isRunning()) {
			this.updateAnimation(entity.idleAnimationState, spider_crab_anim.idle, ageInTicks, 1.0f);
		}
	}

	@Override
	public ModelPart getPart() {
		return crab_body;
	}
}
