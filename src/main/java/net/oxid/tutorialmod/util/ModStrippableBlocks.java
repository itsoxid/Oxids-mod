package net.oxid.tutorialmod.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.oxid.tutorialmod.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.DOGWOOD_LOG, ModBlocks.STRIPPED_DOGWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.DOGWOOD_WOOD, ModBlocks.STRIPPED_DOGWOOD_WOOD);
    }
}
