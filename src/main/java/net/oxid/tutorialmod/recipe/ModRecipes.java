package net.oxid.tutorialmod.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;

public class ModRecipes {
    public static void RegisterRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(TutorialMod.MOD_ID, GemInfusingRecipe.Serializer.ID),
                GemInfusingRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(TutorialMod.MOD_ID, GemInfusingRecipe.Type.ID),
                GemInfusingRecipe.Type.INSTANCE);
    }
}
