package com.jarrota.itemsMod.entity.custom;

import com.jarrota.Jamaica;
import com.jarrota.itemsMod.entity.MDOEL.Capirucho2;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CapiruchoRender extends GeoEntityRenderer<Capirucho> {

    public CapiruchoRender(EntityRendererFactory.Context renderManager) {
        super(renderManager,new Capirucho2());
    }

    @Override
    public Identifier getTextureLocation(Capirucho animatable) {
        return new Identifier(Jamaica.MOD_ID, "textures/entity/texture.png");
    }
}
