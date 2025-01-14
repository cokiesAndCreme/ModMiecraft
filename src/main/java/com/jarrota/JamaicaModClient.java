package com.jarrota;

import com.jarrota.itemsMod.entity.custom.CapiruchoRender;
import com.jarrota.itemsMod.entity.ModEntities;
import com.jarrota.itemsMod.entity.custom.TigerRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class JamaicaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.capirucho, CapiruchoRender::new);
        EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);
    }
}
