package com.jarrota.itemsMod.entity;

import com.jarrota.Jamaica;
import com.jarrota.itemsMod.entity.custom.Capirucho;
import com.jarrota.itemsMod.entity.custom.TigerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public  static final EntityType<Capirucho>capirucho= Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Jamaica.MOD_ID, "capirucho"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,Capirucho::new)
                    .dimensions(EntityDimensions.fixed(1.3f,1.55f)).build());

    public static final EntityType<TigerEntity> TIGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Jamaica.MOD_ID, "tiger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TigerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
