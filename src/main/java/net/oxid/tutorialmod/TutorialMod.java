package net.oxid.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.oxid.tutorialmod.block.ModBlocks;
import net.oxid.tutorialmod.block.entity.ModBlockEntities;
import net.oxid.tutorialmod.entity.ModEntities;
import net.oxid.tutorialmod.entity.custom.OtterEntity;
import net.oxid.tutorialmod.item.ModItems;
import net.oxid.tutorialmod.painting.ModPaintings;
import net.oxid.tutorialmod.recipe.ModRecipes;
import net.oxid.tutorialmod.screen.ModScreenHandlers;
import net.oxid.tutorialmod.util.ModFlammableBlocks;
import net.oxid.tutorialmod.util.ModLootTableModifiers;
import net.oxid.tutorialmod.util.ModStrippableBlocks;
import net.oxid.tutorialmod.world.feature.ModConfiguredFeatures;
import net.oxid.tutorialmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();
        //has to be on the top

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModPaintings.registerPaintings();
        ModWorldGen.generateWorldGen();
        ModLootTableModifiers.modifyLootTables();
        ModBlockEntities.registerBlockEntities();
        ModRecipes.RegisterRecipes();

        ModScreenHandlers.registerAllScreenHandlers();

        GeckoLib.initialize();

        ModFlammableBlocks.registerFlammableBlocks();
        ModStrippableBlocks.registerStrippables();

        FabricDefaultAttributeRegistry.register(ModEntities.OTTER, OtterEntity.setAttributes());


    }
}