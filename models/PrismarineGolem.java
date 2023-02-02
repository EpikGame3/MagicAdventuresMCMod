// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart LLeg;
	private final ModelPart RLeg;
	private final ModelPart RArm;
	private final ModelPart LArm;

	public custom_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
		this.RArm = root.getChild("RArm");
		this.LArm = root.getChild("LArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -60.0F, -8.0F, 48.0F, 19.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(62, 63).addBox(-8.0F, -41.0F, -4.0F, 16.0F, 22.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 37).addBox(-10.0F, -18.0F, -9.0F, 18.0F, 18.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -10.0F, -14.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -36.0F, 1.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(107, 87).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 5.0F, 1.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(0, 104).addBox(-4.0F, 0.0F, -4.0F, 7.0F, 19.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 5.0F, 1.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(31, 93).addBox(-10.0F, -3.0F, -4.0F, 10.0F, 20.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-24.0F, -28.0F, 0.0F));

		PartDefinition cube_r1 = RArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 37).addBox(-33.0F, -34.0F, -20.0F, 8.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, 52.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -2.0F, -6.0F, 10.0F, 20.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(24.0F, -29.0F, 2.0F));

		PartDefinition cube_r2 = LArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 95).addBox(-33.0F, -34.0F, -20.0F, 8.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, 53.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}