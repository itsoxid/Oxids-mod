package net.oxid.tutorialmod.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
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


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DOGWOOD_TREE =
            ConfiguredFeatures.register("dogwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.DOGWOOD_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.DOGWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> DOGWOOD_CHECKED = PlacedFeatures.register("dogwood_checked",
            ModConfiguredFeatures.DOGWOOD_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.DOGWOOD_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> DOGWOOD_SPAWN =
            ConfiguredFeatures.register("dogwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(DOGWOOD_CHECKED, 0.5f)),
                            DOGWOOD_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> DIVINIUM_GEODE =
            ConfiguredFeatures.register("divinium_geode", Feature.GEODE,
                    new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                            BlockStateProvider.of(Blocks.DEEPSLATE),
                            BlockStateProvider.of(ModBlocks.DIVINIUM_ORE),
                            BlockStateProvider.of(Blocks.DIRT),
                            BlockStateProvider.of(Blocks.EMERALD_BLOCK),
                            List.of(ModBlocks.DIVNINIUM_BLOCK.getDefaultState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerThicknessConfig(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackConfig(0.25D, 1.5D, 1),
                            0.5D, 0.1D,
                            true, UniformIntProvider.create(3, 8),
                            UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                            -18, 18, 0.075D, 1));




    public static void registerConfiguredFeatures() {
        TutorialMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + TutorialMod.MOD_ID);
    }
}
