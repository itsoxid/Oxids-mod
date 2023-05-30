package net.oxid.tutorialmod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.entity.custom.OtterEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OtterRenderer extends GeoEntityRenderer<OtterEntity> {
    public OtterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OtterModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(OtterEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/otter_texture.json");
    }

    @Override
    public RenderLayer getRenderType(OtterEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
