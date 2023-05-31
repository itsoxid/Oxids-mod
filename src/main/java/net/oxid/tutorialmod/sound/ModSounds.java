package net.oxid.tutorialmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;

public class ModSounds {
    public static SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");




    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT,id,new SoundEvent(id));
    }
}
