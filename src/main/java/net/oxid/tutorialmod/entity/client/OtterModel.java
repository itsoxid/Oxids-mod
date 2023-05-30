package net.oxid.tutorialmod.entity.client;

import net.minecraft.util.Identifier;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.entity.custom.OtterEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OtterModel extends AnimatedGeoModel<OtterEntity> {
    @Override
    public Identifier getModelResource(OtterEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "geo/otter.geo.json");
    }

    @Override
    public Identifier getTextureResource(OtterEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/otter_texture.png");
    }

    @Override
    public Identifier getAnimationResource(OtterEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/otter.animation.json");
    }
}
