package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorEla extends ModelBiped {

	public ModelOperatorEla() {
		super(0.1f, 0.0f, 128, 128);
		textureWidth = 128;
		textureHeight = 128;
		this.bipedLeftArm.mirror = false;
		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		this.bipedLeftArm.mirror = false;

		ModelRenderer bipedHeadHat = new ModelRenderer(this);
		bipedHeadHat.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bipedHeadHat);
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 74, 9, -4.0F, -31.75F, -4.175F, 8, 2, 8, 0.275F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, -2.5F, -29.65F, -6.75F, 5, 0, 6, 0.225F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, 2.575F, -29.45F, -6.75F, 1, 0, 6, 0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, -3.525F, -29.4F, -6.75F, 1, 0, 6, 0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, 1.15F, -28.025F, -4.0F, 1, 0, 0, 0.15F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, 2.3F, -26.575F, -4.025F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, -1.925F, -26.175F, -4.025F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, -1.4F, -26.5F, -4.025F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, 1.4F, -26.425F, -4.1F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, 1.9F, -26.175F, -4.1F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 114, 50, -2.375F, -26.525F, -4.1F, 0, 0, 0, 0.05F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 20, 11, -3.675F, -30.025F, -4.5F, 1, 3, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 26, 12, 2.575F, -30.025F, -4.5F, 1, 3, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.3F, -30.275F, -4.5F, 1, 5, 1, -0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -29.625F, -4.0F, 1, 5, 1, -0.1F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -29.775F, -2.75F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.325F, -29.775F, -2.75F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -30.175F, -2.075F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -30.775F, -0.825F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.375F, -30.775F, -0.825F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -29.6F, -1.475F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.325F, -29.6F, -1.475F, 1, 5, 1, -0.175F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, 3.425F, -30.175F, -3.3F, 1, 5, 1, -0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.45F, -30.175F, -3.3F, 1, 5, 1, -0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.325F, -29.625F, -4.0F, 1, 5, 1, -0.1F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -4.25F, -30.275F, -4.5F, 1, 5, 1, -0.2F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -1.55F, -30.125F, -4.5F, 1, 2, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 2.15F, -29.775F, -4.5F, 1, 2, 1, -0.225F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 1.65F, -30.025F, -4.5F, 1, 2, 1, -0.225F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 1.15F, -30.125F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 0.8F, -29.95F, -4.5F, 1, 2, 1, -0.275F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 0.8F, -30.225F, -4.675F, 1, 2, 1, -0.325F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, 0.375F, -30.175F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -0.125F, -29.95F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -0.575F, -30.175F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -1.075F, -30.05F, -4.5F, 1, 2, 1, -0.225F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -2.0F, -30.1F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -2.5F, -30.0F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -3.35F, -29.875F, -4.5F, 1, 2, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 12, -2.9F, -30.025F, -4.5F, 1, 2, 1, -0.275F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, -2.1F, -28.025F, -4.0F, 1, 0, 0, 0.15F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, -2.85F, -28.0F, -4.0F, 1, 0, 0, 0.125F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 93, 8, 1.9F, -28.0F, -4.0F, 1, 0, 0, 0.125F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 21, 62, -3.275F, -30.375F, -5.25F, 3, 1, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 21, 62, -0.95F, -30.825F, -5.25F, 1, 1, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 21, 62, -0.6F, -31.125F, -5.25F, 1, 1, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 21, 62, -0.2F, -31.125F, -5.25F, 1, 1, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 21, 62, 0.175F, -30.8F, -5.25F, 1, 1, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 62, 0.45F, -30.375F, -5.25F, 3, 1, 1, -0.25F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 62, 0.4F, -32.1F, -5.25F, 3, 1, 1, -0.275F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 20, 60, -0.95F, -31.925F, -5.25F, 2, 1, 2, -0.35F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 84, 54, -3.25F, -31.7F, -5.175F, 3, 2, 1, -0.35F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 84, 54, 0.375F, -31.7F, -5.175F, 3, 2, 1, -0.35F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 90, 51, -0.875F, -31.4F, -4.85F, 2, 1, 1, -0.1F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 24, 48, 2.7F, -31.75F, -5.25F, 1, 2, 1, -0.325F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 24, 48, -3.475F, -31.775F, -5.25F, 1, 2, 1, -0.325F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 62, -3.175F, -32.1F, -5.25F, 3, 1, 1, -0.275F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 88, 76, 3.825F, -28.25F, -0.9F, 1, 2, 2, 0.0F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 100, 83, -4.8F, -28.25F, -0.9F, 1, 2, 2, 0.0F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 79, 72, 3.9F, -29.225F, -0.9F, 1, 2, 2, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 17, 22, -4.5F, -32.25F, -0.875F, 9, 5, 2, -0.125F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 78, 72, -4.5F, -31.175F, -4.625F, 9, 1, 9, -0.15F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 83, 70, -4.875F, -29.225F, -0.9F, 1, 2, 2, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 83, 70, 2.5F, -26.075F, -5.2F, 2, 1, 1, -0.3F, false));
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 96, 32, 2.925F, -26.075F, -5.2F, 2, 1, 1, -0.2F, false));

		ModelRenderer bipedHeadHatMic = new ModelRenderer(this);
		bipedHeadHatMic.setRotationPoint(-5.625F, -26.475F, -0.9F);
		bipedHeadHat.addChild(bipedHeadHatMic);
		setRotationAngle(bipedHeadHatMic, 0.3491F, 0.0F, 0.0F);
		bipedHeadHatMic.cubeList.add(new ModelBox(bipedHeadHatMic, 80, 12, 9.6F, -1.0F, -4.0F, 1, 1, 5, -0.2F, false));

		ModelRenderer bipedBodyHarness = new ModelRenderer(this);
		bipedBodyHarness.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBodyHarness);
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -3.5F, -24.25F, -2.0F, 1, 2, 4, 0.1F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -3.75F, -22.525F, -2.0F, 1, 2, 4, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 76, 71, -3.6F, -23.025F, -2.5F, 1, 2, 1, -0.175F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 74, 98, -3.6F, -23.025F, -2.7F, 1, 2, 1, -0.3F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -0.05F, -22.775F, -0.75F, 0, 2, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -0.05F, -21.775F, -0.5F, 0, 6, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -2.1F, -21.025F, -0.55F, 4, 0, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -2.1F, -19.775F, -0.55F, 4, 0, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -2.1F, -18.525F, -0.55F, 4, 0, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -2.1F, -17.025F, -0.55F, 4, 0, 4, 0.225F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, 0.25F, -23.025F, -0.75F, 0, 0, 4, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -0.35F, -23.025F, -0.75F, 0, 0, 4, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 84, 21, -3.75F, -20.525F, -2.225F, 1, 3, 4, -0.05F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 84, 21, -1.85F, -17.275F, -2.225F, 4, 1, 4, -0.05F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 84, 21, -3.1F, -23.025F, -2.275F, 6, 1, 4, -0.05F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 79, 70, -1.0F, -17.275F, -2.2F, 1, 1, 1, 0.0F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 79, 70, 0.05F, -17.275F, -2.25F, 1, 1, 1, -0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 84, 34, 0.0F, -17.275F, -2.6F, 1, 1, 1, -0.275F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 84, 34, -1.0F, -17.275F, -2.5F, 1, 1, 1, -0.2F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 26, 2.65F, -20.525F, -2.225F, 1, 3, 4, -0.05F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, 1.325F, -17.775F, -2.525F, 3, 2, 5, -0.175F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, 1.325F, -17.275F, -2.775F, 3, 1, 1, -0.25F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, 2.3F, -22.8F, -2.65F, 2, 1, 1, -0.375F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, -4.35F, -22.8F, -2.65F, 2, 1, 1, -0.375F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, 2.3F, -21.6F, -2.65F, 2, 1, 1, -0.375F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, -4.35F, -21.6F, -2.65F, 2, 1, 1, -0.375F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 76, -4.3F, -17.275F, -2.775F, 3, 1, 1, -0.25F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -4.325F, -17.775F, -2.525F, 3, 2, 5, -0.175F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 75, 68, -2.575F, -21.775F, 1.475F, 5, 6, 2, 0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 74, 68, -2.075F, -23.025F, 1.225F, 4, 6, 2, 0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 16, 25, -2.075F, -24.275F, -0.45F, 4, 2, 2, 0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 16, 25, 1.425F, -24.275F, -2.45F, 1, 1, 4, 0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 16, 25, -2.575F, -24.275F, -2.45F, 1, 1, 4, 0.025F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 16, 25, -2.075F, -23.525F, -2.45F, 4, 1, 4, -0.175F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 3, 23, -2.075F, -24.575F, -0.075F, 4, 2, 2, -0.1F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, 2.675F, -22.525F, -2.0F, 1, 2, 4, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, 2.425F, -20.525F, 1.25F, 1, 3, 1, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, -3.5F, -20.525F, 1.25F, 1, 3, 1, 0.125F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 83, 21, 2.5F, -24.25F, -2.0F, 1, 2, 4, 0.1F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 21, 24, -2.5F, -21.3F, -2.7F, 5, 2, 2, -0.25F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 105, -3.275F, -15.95F, -2.5F, 2, 3, 2, -0.25F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 71, 96, -3.325F, -16.05F, -2.725F, 2, 2, 2, -0.3F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 74, 95, 1.375F, -15.95F, -2.725F, 2, 2, 2, -0.3F, false));
		bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 86, 102, 1.4F, -15.8F, -2.5F, 2, 3, 2, -0.25F, false));

		ModelRenderer bipedBodyBelt = new ModelRenderer(this);
		bipedBodyBelt.setRotationPoint(5.9F, -14.3F, -2.5F);
		bipedBodyHarness.addChild(bipedBodyBelt);
		setRotationAngle(bipedBodyBelt, 0.0F, 0.0F, -0.1745F);
		bipedBodyBelt.cubeList.add(new ModelBox(bipedBodyBelt, 89, 83, -9.1972F, 0.7082F, -0.1F, 1, 1, 1, -0.15F, false));
		bipedBodyBelt.cubeList.add(new ModelBox(bipedBodyBelt, 82, 26, -9.1972F, 0.7082F, -0.375F, 1, 1, 1, -0.325F, false));
		bipedBodyBelt.cubeList.add(new ModelBox(bipedBodyBelt, 80, 31, -10.6932F, 0.6982F, 0.0F, 9, 1, 5, -0.2F, false));

		ModelRenderer bipedBodyHarnessTits = new ModelRenderer(this);
		bipedBodyHarnessTits.setRotationPoint(2.75F, -23.25F, -0.725F);
		bipedBodyHarness.addChild(bipedBodyHarnessTits);
		setRotationAngle(bipedBodyHarnessTits, 1.1345F, 0.0F, 0.0F);
		bipedBodyHarnessTits.cubeList.add(new ModelBox(bipedBodyHarnessTits, 21, 24, -5.25F, -0.3336F, -3.3184F, 5, 2, 2, 0.325F, false));
		bipedBodyHarnessTits.cubeList.add(new ModelBox(bipedBodyHarnessTits, 118, 95, -5.85F, -1.1379F, -3.7079F, 3, 1, 2, -0.6F, false));
		bipedBodyHarnessTits.cubeList.add(new ModelBox(bipedBodyHarnessTits, 116, 6, -5.35F, -0.9082F, -3.4905F, 2, 1, 2, -0.9F, false));
		bipedBodyHarnessTits.cubeList.add(new ModelBox(bipedBodyHarnessTits, 21, 24, -5.25F, 1.7969F, 0.1577F, 5, 2, 2, -0.075F, false));
		bipedBodyHarnessTits.cubeList.add(new ModelBox(bipedBodyHarnessTits, 0, 23, -5.25F, 1.6536F, 0.6425F, 5, 2, 2, -0.3F, false));

		ModelRenderer bipedRightArmSleeve = new ModelRenderer(this);
		bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArmSleeve);
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 88, 32, -4.75F, -20.9F, -2.25F, 1, 5, 3, -0.1F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 88, 27, -7.0F, -20.4F, -0.75F, 2, 3, 3, -0.1F, false));

		ModelRenderer bipedLeftArmSleeve = new ModelRenderer(this);
		bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArmSleeve);
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 32, 3.75F, -20.9F, -2.25F, 1, 5, 3, -0.1F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 27, 5.0F, -20.4F, -0.75F, 2, 3, 3, -0.1F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 27, 6.25F, -22.75F, -1.0F, 2, 2, 2, -0.1F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.625F, -22.8F, -0.525F, 2, 2, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.625F, -21.9F, 0.0F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -21.675F, -0.375F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.925F, -0.225F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.775F, -0.05F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.575F, -0.05F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.45F, -0.2F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.45F, -0.4F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.45F, -0.625F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.925F, -0.425F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -21.675F, -0.675F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -22.925F, -0.625F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -21.675F, -0.875F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.6F, -21.675F, -0.175F, 2, 1, 1, -0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 88, 100, 6.625F, -21.9F, -1.0F, 2, 1, 1, -0.4F, false));

		ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
		bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedRightLeg.addChild(bipedRightLegHolster);
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 82, 13, -4.75F, -11.5F, -1.0F, 2, 3, 2, -0.2F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 89, 83, -3.4813F, -9.6298F, -2.425F, 1, 1, 1, -0.15F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 24, -3.4813F, -9.6298F, -2.725F, 1, 1, 1, -0.325F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 82, 19, -4.7F, -9.75F, -2.5F, 5, 1, 5, -0.3F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 82, 19, -4.7F, -9.475F, -2.5F, 5, 1, 5, -0.325F, false));

		ModelRenderer bipedLeftLegHolder = new ModelRenderer(this);
		bipedLeftLegHolder.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedLeftLeg.addChild(bipedLeftLegHolder);
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 82, 19, -0.45F, -8.475F, -2.5F, 5, 1, 5, -0.325F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 82, 19, -0.45F, -9.525F, -2.5F, 5, 1, 5, -0.3F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 82, 19, -0.45F, -8.75F, -2.5F, 5, 1, 5, -0.3F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 82, 19, 3.625F, -10.25F, -2.25F, 1, 3, 4, -0.3F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 80, 72, 3.175F, -9.45F, -2.25F, 2, 2, 2, -0.35F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 98, 16, 3.175F, -10.875F, -2.25F, 2, 3, 2, -0.575F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 113, 108, 3.1F, -10.55F, -2.25F, 2, 1, 2, -0.45F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 113, 108, 3.1F, -10.55F, -0.5F, 2, 1, 2, -0.45F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 98, 16, 3.175F, -11.175F, -2.25F, 2, 3, 2, -0.675F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 98, 16, 3.175F, -10.875F, -0.475F, 2, 3, 2, -0.575F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 98, 16, 3.175F, -11.2F, -0.475F, 2, 3, 2, -0.675F, false));
		bipedLeftLegHolder.cubeList.add(new ModelBox(bipedLeftLegHolder, 97, 73, 3.175F, -9.45F, -0.475F, 2, 2, 2, -0.35F, false));
	}


	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}