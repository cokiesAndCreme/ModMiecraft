package com.jarrota;

import com.jarrota.itemsMod.ModItemTotem;
import com.jarrota.itemsMod.chalesMoncho.ChangoBonito;
import com.jarrota.itemsMod.chalesMoncho.Culebritica;
import com.jarrota.itemsMod.entity.custom.Capirucho;
import com.jarrota.itemsMod.entity.ModEntities;
import com.jarrota.itemsMod.entity.custom.TigerEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.impl.event.interaction.InteractionEventsRouter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.decoration.InteractionEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jamaica implements ModInitializer {
	public static final String MOD_ID = "jamaica";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	UseBlockCallback.EVENT.register(new ChangoBonito());
//		((player, world, hand, hitResult) ->{
//			BlockPos hit = hitResult.getBlockPos();
//			BlockState blockState = world.getBlockState(hit);
//			Block block = blockState.getBlock();
//
//			if(block instanceof ChestBlock){
//				String chao = Culebritica.readFiles(Culebritica.findBioma(world,hit));
//				if (!chao.equals("default")){
//					Culebritica.findItem(world,hit,chao);
//
//				}
//				return ActionResult.PASS;
//			}
//			return  ActionResult.PASS;
//		});


		LOGGER.info("Hello Fabric world!");
		ModItemTotem.registerModItems();

		FabricDefaultAttributeRegistry.register(ModEntities.capirucho, Capirucho.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());

	}
}