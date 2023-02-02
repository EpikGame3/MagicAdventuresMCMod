// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Rarm;
	private final ModelPart LArm;
	private final ModelPart LLeg;
	private final ModelPart RLeg;
	private final ModelPart BODY;

	public custom_model(ModelPart root) {
		this.Rarm = root.getChild("Rarm");
		this.LArm = root.getChild("LArm");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
		this.BODY = root.getChild("BODY");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rarm = partdefinition.addOrReplaceChild("Rarm", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 8.0F, 1.0F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -1.0F, -3.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 8.0F, 1.0F));

		PartDefinition bone = LArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(35, 42).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 19.0F, 1.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(40, 32).addBox(-2.0F, 0.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 19.0F, 1.0F));

		PartDefinition BODY = partdefinition.addOrReplaceChild("BODY", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -21.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -13.0F, -10.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BODY.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}