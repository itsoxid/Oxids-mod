package net.oxid.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.oxid.tutorialmod.block.ModBlocks;
import net.oxid.tutorialmod.entity.ModEntities;
import net.oxid.tutorialmod.entity.client.OtterRenderer;
import net.oxid.tutorialmod.screen.GemInfusingScreen;
import net.oxid.tutorialmod.screen.ModScreenHandlers;


public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HASH_CROP, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.GEM_INFUSING_SCREEN_HANDLER, GemInfusingScreen::new);

        EntityRendererRegistry.register(ModEntities.OTTER, OtterRenderer::new);

    }

}
