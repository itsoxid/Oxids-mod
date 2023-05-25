package net.oxid.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.oxid.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static ItemGroup Divinium = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "divinium"), ( ) -> new ItemStack(ModItems.DIVINIUM));
}
