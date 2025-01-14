package com.jarrota.itemsMod.chalesMoncho;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.nio.file.Files;
;
import java.nio.file.Paths;

public  class Culebritica  {

    public static String readFiles(String bioma){
        try {
            String jsonfiles = Files.readString(Paths
                    .get("C:\\Users\\venta\\Desktop\\minecraftFabric\\jamaica-template-1.19.4\\src\\main\\java\\com\\jarrota\\itemsMod\\chalesMoncho\\amo.json"));
            JsonObject arry =JsonParser.parseString(jsonfiles).getAsJsonObject();

            if(arry.has(bioma)){
                System.out.println("el bioma es "+ bioma);
               JsonArray a = arry.get(bioma).getAsJsonArray();

                System.out.println(a.get(0).toString());
                return a.get(0).toString();
            }


            return "default";
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return "default";
    }

    public static String findBioma(World world,BlockPos blockPos){
        return world.getBiome(blockPos).getKey().map(a -> a.getValue().toString()).orElse("default");
    }


    public static void findItem(World world,BlockPos blockPos, String path){
        BlockEntity blockEntity = world.getBlockEntity(blockPos);
        if(blockEntity instanceof ChestBlockEntity ){
            System.out.println("entrando a extasis" + path);
            ChestBlockEntity cofresito = ((ChestBlockEntity) blockEntity);
            if(cofresito.isEmpty()){
                System.out.println("esta vacio");
                cofresito.setLootTable(new Identifier("minecraft", "chests/village/village_armorer"),world.getRandom().nextLong());
            }
            cofresito.setLootTable(new Identifier("minecraft", "chests/village/village_armorer"),world.getRandom().nextLong());




            System.out.println("asignacion correcta");

        }
    }

}
