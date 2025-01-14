package com.jarrota.itemsMod.chalesMoncho;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChangoBonito implements UseBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        BlockPos hit = hitResult.getBlockPos();
			BlockState blockState = world.getBlockState(hit);
			Block block = blockState.getBlock();

			if(block instanceof ChestBlock){
				String chao = Culebritica.readFiles(Culebritica.findBioma(world,hit));
				if (!chao.equals("default")){
					Culebritica.findItem(world,hit,chao);

				}

			}
			return  ActionResult.PASS;
    }
}
