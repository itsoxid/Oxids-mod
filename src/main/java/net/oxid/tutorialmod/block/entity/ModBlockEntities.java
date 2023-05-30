package net.oxid.tutorialmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<GemInfusingBlockEntity> GEM_INFUSING_STATION;

    public static void registerBlockEntities() {
        GEM_INFUSING_STATION = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(TutorialMod.MOD_ID, "gem_infusing_station"),
                FabricBlockEntityTypeBuilder.create(GemInfusingBlockEntity:: new,
                        ModBlocks.GEM_INFUSING_STATION).build(null));
    }

}
