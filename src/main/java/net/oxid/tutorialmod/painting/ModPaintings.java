package net.oxid.tutorialmod.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;

public class ModPaintings {
    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32,16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(16,32));
    public static final PaintingVariant BALDMAN = registerPainting("baldman", new PaintingVariant(64,64));
    public static final PaintingVariant ELYTRA = registerPainting("elytra", new PaintingVariant(64,48));
    public static final PaintingVariant EXPLOSION = registerPainting("explosion", new PaintingVariant(16,16));
    public static final PaintingVariant FEILDS = registerPainting("feilds", new PaintingVariant(128,64));
    public static final PaintingVariant FIELDPORTAL = registerPainting("fieldportal", new PaintingVariant(16,16));
    public static final PaintingVariant GUARDIAN = registerPainting("guardian", new PaintingVariant(16,32));
    public static final PaintingVariant NETHERSTAR = registerPainting("netherstar", new PaintingVariant(64,64));
    public static final PaintingVariant SOMEROSES = registerPainting("someroses", new PaintingVariant(16,16));
    public static final PaintingVariant SWORD = registerPainting("sword", new PaintingVariant(16,32));
    public static final PaintingVariant WITHER = registerPainting("wither", new PaintingVariant(32,32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant ) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(TutorialMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        TutorialMod.LOGGER.debug("Registering paintings for " + TutorialMod.MOD_ID);
    }
}
