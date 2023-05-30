package net.oxid.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oxid.tutorialmod.TutorialMod;
import net.oxid.tutorialmod.entity.custom.OtterEntity;

public class ModEntities {
    public static final EntityType<OtterEntity> OTTER = Registry.register (
            Registry.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "otter"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, OtterEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,1.5f)).build());
}
