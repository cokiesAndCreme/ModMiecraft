package com.jarrota.itemsMod.entity.custom;

import com.jarrota.Jamaica;
import com.jarrota.itemsMod.entity.MDOEL.TigerModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TigerRenderer extends GeoEntityRenderer<TigerEntity> {
    public TigerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TigerModel());
    }

    @Override
    public Identifier getTextureLocation(TigerEntity animatable) {
        return new Identifier(Jamaica.MOD_ID, "textures/entity/tiger.png");
    }

    @Override
    public void render(TigerEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
