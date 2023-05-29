package net.oxid.tutorialmod.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_MITHRIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_DIVINIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.DIVINIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MITHRIL_ORE =
            ConfiguredFeatures.register("mithril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MITHRIL_ORES,9)); //vein size

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_DIVINIUM_ORE =
            ConfiguredFeatures.register("divinium_ore", Feature.ORE, new OreFeatureConfig(END_DIVINIUM_ORES,9));



    public static void registerConfiguredFeatures() {
        TutorialMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + TutorialMod.MOD_ID);
    }
}
