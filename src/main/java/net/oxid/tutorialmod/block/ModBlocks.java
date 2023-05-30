package net.oxid.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.block.custom.GemInfusionStationBlock;
import net.oxid.tutorialmod.block.custom.HashCropBlock;
import net.oxid.tutorialmod.block.custom.JumpyBlock;
import net.oxid.tutorialmod.block.custom.SoulLaternBlock;
import net.oxid.tutorialmod.item.ModItemGroup;
import net.oxid.tutorialmod.world.feature.tree.DogwoodSaplingGenerator;

public class ModBlocks {
    public static final Block DIVINIUM_ORE = registerBlock("divinium_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 9)), ModItemGroup.Divinium);

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(25f).resistance(600f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.Divinium);

    public static final Block DIVNINIUM_BLOCK = registerBlock("divinium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),
            ModItemGroup.Divinium);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool()),
            ModItemGroup.Divinium);

    public static final Block SOUL_LANTERN_BLOCK = registerBlock("soul_lantern_block",
            new SoulLaternBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(4f).requiresTool()
                    .luminance(state -> state.get(SoulLaternBlock.LIT) ? 15 : 0)), ModItemGroup.Divinium);

    public static final Block HASH_CROP = registerBlockWithoutItem("hash_crop",
            new HashCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block GEM_INFUSING_STATION = registerBlock("gem_infusing_station",
            new GemInfusionStationBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), ModItemGroup.Divinium);

    public static final Block DOGWOOD_LOG = registerBlock("dogwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.Divinium);
    public static final Block DOGWOOD_WOOD = registerBlock("dogwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.Divinium);
    public static final Block STRIPPED_DOGWOOD_LOG = registerBlock("stripped_dogwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.Divinium);
    public static final Block STRIPPED_DOGWOOD_WOOD = registerBlock("stripped_dogwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.Divinium);

    public static final Block DOGWOOD_PLANKS = registerBlock("dogwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.Divinium);
    public static final Block DOGWOOD_LEAVES = registerBlock("dogwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.Divinium);

    public static final Block DOGWOOD_SAPLING = registerBlock("dogwood_sapling",
            new SaplingBlock(new DogwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.Divinium);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBLockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBLockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
