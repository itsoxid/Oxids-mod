package net.oxid.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.oxid.tutorialmod.block.ModBlocks;
import net.oxid.tutorialmod.item.ModItems;
import net.oxid.tutorialmod.painting.ModPaintings;
import net.oxid.tutorialmod.util.ModLootTableModifiers;
import net.oxid.tutorialmod.world.feature.ModConfiguredFeatures;
import net.oxid.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        ModOreGeneration.generateOres();
        ModLootTableModifiers.modifyLootTables();


    }
}