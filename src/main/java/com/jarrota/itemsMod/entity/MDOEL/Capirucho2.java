package com.jarrota.itemsMod.entity.MDOEL;

import com.jarrota.Jamaica;
import com.jarrota.itemsMod.entity.custom.Capirucho;
import net.minecraft.util.Identifier;

import software.bernie.geckolib.model.GeoModel;

public class Capirucho2 extends GeoModel<Capirucho> {

    @Override
     public Identifier getModelResource(Capirucho animatable) {
        return  new Identifier(Jamaica.MOD_ID,"geo/prueba.geo.json");
    }

    @Override
    public Identifier getTextureResource(Capirucho animatable) {
        return    new Identifier(Jamaica.MOD_ID,"textures/entity/texture.png");
//textures/entity
    }

    @Override
    public Identifier getAnimationResource(Capirucho animatable) {
        return new Identifier(Jamaica.MOD_ID,"animations/model.animation.json");
    }


}
