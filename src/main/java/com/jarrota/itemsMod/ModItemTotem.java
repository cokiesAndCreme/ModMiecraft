package com.jarrota.itemsMod;

import com.jarrota.Jamaica;
import com.jarrota.itemsMod.comifda.Comidita;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.report.ReporterEnvironment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class ModItemTotem {
    public static final Item TOMET = añadirItem("tomet", new Item(new FabricItemSettings()));
    public static final Item BOLA = añadirItem("bolita", new Item(new FabricItemSettings().food(Comidita.TOMATE)));


    private static void addItemsToIngredientItemGroup (FabricItemGroupEntries entries){
        entries.add(TOMET);
    }

    private static Item añadirItem(String itemName,Item item ){
        return Registry.register(Registries.ITEM, new Identifier(Jamaica.MOD_ID, itemName),item);
    }

    public static  void registerModItems(){
        Jamaica.LOGGER.info("Registering item for mod " + Jamaica.MOD_ID );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItemTotem::addItemsToIngredientItemGroup);
    }

}
