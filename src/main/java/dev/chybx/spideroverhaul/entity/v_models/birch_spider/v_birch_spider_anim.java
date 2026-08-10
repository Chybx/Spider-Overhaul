package dev.chybx.spideroverhaul.entity.v_models.birch_spider;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class v_birch_spider_anim {
	public static final Animation attack = Animation.Builder.create(0.875F).looping()
		.addBoneAnimation("spider", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, -3.2F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5946F, -9.5428F, 32.7727F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-2.5672F, 1.1074F, 32.2934F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-4.081F, -24.2969F, 26.001F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-10.5092F, -24.2851F, 33.4821F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(-2.5946F, -9.5428F, 32.7727F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.9F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.1459F, -33.6238F, 42.7154F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-18.0546F, -22.2781F, 38.2773F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-32.1086F, -41.458F, 48.0546F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-25.2463F, -53.7539F, 35.7345F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(-20.1459F, -33.6238F, 42.7154F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(-0.475F, 0.0F, 1.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(-0.48F, 0.275F, -0.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5946F, 9.5428F, 32.7727F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(2.7517F, 21.4838F, 33.3511F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-7.7173F, -13.0572F, 24.5493F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-18.7173F, -13.0572F, 24.5493F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(2.5946F, 9.5428F, 32.7727F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, -1.6F, -1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, -1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(20.1459F, 33.6238F, 42.7154F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-6.271F, 47.3393F, 1.5386F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(18.5223F, 50.2304F, 8.0669F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(17.4414F, 58.7566F, 42.0034F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(20.1459F, 33.6238F, 42.7154F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(-1.1F, -2.29F, -2.25F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.375F, AnimationHelper.createScalingVector(1.39F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("2limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -85.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("1limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -95.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("3limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("4limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -105.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-21.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-29.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, 1.7F, 0.6F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.8F, 0.6F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.12F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4167F, AnimationHelper.createScalingVector(1.0F, 1.32F, 1.12F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("back", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(17.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("chelicera_l", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -4.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.83F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.58F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 9.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -4.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-45.7817F, -14.2426F, 22.019F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(16.2183F, -14.2426F, 22.019F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("chelicera_l", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.32F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chelicera_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -7.83F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 6.58F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -9.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-45.7817F, 14.2426F, -22.019F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(16.2183F, 14.2426F, -22.019F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("chelicera_r", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.32F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(7.76F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, -3.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -3.2F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(20.1459F, -33.6238F, -42.7154F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-6.271F, -47.3393F, -1.5386F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(18.5223F, -50.2304F, -8.0669F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(17.4414F, -58.7566F, -42.0034F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(20.1459F, -33.6238F, -42.7154F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(1.1F, -2.29F, -2.25F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.375F, AnimationHelper.createScalingVector(1.39F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5946F, -9.5428F, -32.7727F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(2.7517F, -21.4838F, -33.3511F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-7.7173F, 13.0572F, -24.5493F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-18.7173F, 13.0572F, -24.5493F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(2.5946F, -9.5428F, -32.7727F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, -1.6F, -1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, -1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5946F, 9.5428F, -32.7727F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-2.5672F, -1.1074F, -32.2934F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-4.081F, 24.2969F, -26.001F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-10.5092F, 24.2851F, -33.4821F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(-2.5946F, 9.5428F, -32.7727F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.4F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.9F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.1459F, 33.6238F, -42.7154F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-18.0546F, 22.2781F, -38.2773F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(-32.1086F, 41.458F, -48.0546F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-25.2463F, 53.7539F, -35.7345F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createRotationalVector(-20.1459F, 33.6238F, -42.7154F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.475F, 0.0F, 1.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.48F, 0.275F, -0.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation idle = Animation.Builder.create(1.5F).looping()
		.addBoneAnimation("spider", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.8F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 11.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.15F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5129F, -8.8051F, 9.7916F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.3438F, -35.8415F, 15.9178F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.1F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.8188F, 8.6424F, 11.8083F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.3F, 0.3F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.3751F, 22.0657F, 11.1614F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.49F, -0.77F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("2limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -85.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("1limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -95.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("3limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("4limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -105.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.4F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("back", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.8333F, AnimationHelper.createRotationalVector(3.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("back", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -0.2F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, -0.3F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -11.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.15F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.3751F, -22.0657F, -11.1614F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.49F, -0.77F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.8188F, -8.6424F, -11.8083F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.3F, 0.3F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5129F, 8.8051F, -9.7916F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.3438F, 35.8415F, -15.9178F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.1F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation walk = Animation.Builder.create(0.4F).looping()
		.addBoneAnimation("spider", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 60.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_l", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-13.3756F, -19.7581F, -31.489F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createRotationalVector(-16.3378F, -30.6123F, -33.0822F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-17.2998F, -39.2338F, -31.5826F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(12.9643F, -27.2021F, -41.878F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-13.3756F, -19.7581F, -31.489F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.3F, -1.3F, -0.2F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createTranslationalVector(-0.94F, -2.18F, -0.42F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2167F, AnimationHelper.createTranslationalVector(-0.54F, -1.58F, -0.67F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(-0.5F, -1.7F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(-1.3F, -1.3F, -0.2F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-61.2252F, -60.8072F, -1.9111F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createRotationalVector(11.0362F, -58.8227F, -34.1283F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-30.4393F, -48.9421F, -21.3352F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-61.2252F, -60.8072F, -1.9111F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.8F, -1.7F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createTranslationalVector(-1.7F, -2.1F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(-1.19F, -1.92F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3167F, AnimationHelper.createTranslationalVector(-1.33F, -1.39F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3667F, AnimationHelper.createTranslationalVector(-1.08F, -1.6F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(-0.8F, -1.7F, -1.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.0181F, -12.7106F, -35.3593F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createRotationalVector(-1.968F, -9.6644F, -46.7378F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2167F, AnimationHelper.createRotationalVector(-0.9769F, 5.7814F, -34.3535F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(7.0181F, -12.7106F, -35.3593F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.7F, -0.9F, -0.1F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2167F, AnimationHelper.createTranslationalVector(-0.8F, -0.9F, 0.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2833F, AnimationHelper.createTranslationalVector(-0.88F, -0.6F, -0.02F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(-0.7F, -0.9F, -0.1F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-9.8007F, 43.8711F, -29.6513F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0333F, AnimationHelper.createRotationalVector(-13.0252F, 38.7047F, -33.7505F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(11.8726F, 25.6692F, -32.7043F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(8.1608F, 11.8871F, -33.0497F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-22.6394F, 26.9585F, -50.3279F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-9.8007F, 43.8711F, -29.6513F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("l1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.65F, -0.75F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0833F, AnimationHelper.createTranslationalVector(-0.49F, -0.77F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createTranslationalVector(-1.085F, -0.79F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(-0.975F, -0.8F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(-0.65F, -0.75F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("2limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -85.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("1limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -95.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("3limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -82.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("4limb_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -105.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("back", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(2.4966F, 0.1308F, -2.9971F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(2.4985F, -0.0872F, 1.9981F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("back", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(9.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(9.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -60.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("limbs_r", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.1608F, -11.8871F, 33.0497F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-22.6394F, -26.9585F, 50.3279F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-9.8007F, -43.8711F, 29.6513F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2333F, AnimationHelper.createRotationalVector(-13.0252F, -38.7047F, 33.7505F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(11.8726F, -25.6692F, 32.7043F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(8.1608F, -11.8871F, 33.0497F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.975F, -0.8F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.65F, -0.75F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2833F, AnimationHelper.createTranslationalVector(0.49F, -0.77F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createTranslationalVector(1.085F, -0.79F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.975F, -0.8F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.9769F, -5.7814F, 34.3535F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1833F, AnimationHelper.createRotationalVector(7.0181F, 12.7106F, 35.3593F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-1.968F, 9.6644F, 46.7378F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-0.9769F, -5.7814F, 34.3535F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.8F, -0.9F, 0.3F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0667F, AnimationHelper.createTranslationalVector(0.88F, -0.6F, -0.02F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1833F, AnimationHelper.createTranslationalVector(0.7F, -0.9F, -0.1F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.8F, -0.9F, 0.3F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.2998F, 39.2338F, 31.5826F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0833F, AnimationHelper.createRotationalVector(7.2162F, 34.4145F, 43.7436F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-13.3756F, 19.7581F, 31.489F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2667F, AnimationHelper.createRotationalVector(-16.3378F, 30.6123F, 33.0822F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-17.2998F, 39.2338F, 31.5826F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5F, -1.7F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createTranslationalVector(1.3F, -1.3F, -0.2F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2667F, AnimationHelper.createTranslationalVector(0.94F, -2.18F, -0.42F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3667F, AnimationHelper.createTranslationalVector(0.54F, -1.58F, -0.67F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.5F, -1.7F, -0.7F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.4393F, 48.9421F, 21.3352F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-61.2252F, 60.8072F, 1.9111F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2667F, AnimationHelper.createRotationalVector(11.0362F, 58.8227F, 34.1283F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-30.4393F, 48.9421F, 21.3352F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("r4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.19F, -1.92F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0667F, AnimationHelper.createTranslationalVector(1.33F, -1.39F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1167F, AnimationHelper.createTranslationalVector(1.08F, -1.6F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createTranslationalVector(0.8F, -1.7F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2667F, AnimationHelper.createTranslationalVector(1.7F, -2.1F, -1.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(1.19F, -1.92F, -1.0F), Transformation.Interpolations.CUBIC)
		))
		.build();
}