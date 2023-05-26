package net.oxid.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block DIVINIUM_ORE = registerBlock("DIVINIUM_ORE",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.Divinium);



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
