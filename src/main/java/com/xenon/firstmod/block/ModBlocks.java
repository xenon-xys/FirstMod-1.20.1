package com.xenon.firstmod.block;

import com.xenon.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block WATER_ETHER_BLOCK = registerBlocks("water_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FIRE_ETHER_BLOCK = registerBlocks("fire_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ICE_ETHER_BLOCK = registerBlocks("ice_ether_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f,0.5f).requiresTool()));
//    public static final Block WATER_ETHER_BLOCK = registerBlocks("water_ether_block",
//            new Block(FabricBlockSettings.create().strength(0.2f,0.2f)));

    public static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(FirstMod.MOD_ID,name),block);
    }
//    private static Item registerBlockItems(String name, Block block){
//        return Registry.register(Registries.ITEM,new Identifier(FirstMod.MOD_ID,name),
//                new BlockItem(block,new FabricItemSettings()));
//    }
    public static void registerBlockItems(String id,Block block){
        Registry.register(Registries.ITEM,new Identifier(FirstMod.MOD_ID,id),
                new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlocks(){

    }
}