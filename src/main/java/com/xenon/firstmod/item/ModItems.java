package com.xenon.firstmod.item;

import com.xenon.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST = registerItem("test",new Item(new Item.Settings()));
    public static final Item WATER_ETHER = registerItem("water_ether",new Item(new FabricItemSettings()));
    public static final Item FIRE_ETHER = registerItem("fire_ether",new Item(new FabricItemSettings()));
    public static final Item ICE_ETHER = registerItem("ice_ether",new Item(new FabricItemSettings()));
    public static final Item WATER_ETHER_DIAMOND = registerItem("water_ether_diamond",new Item(new FabricItemSettings()));
    public static final Item FIRE_ETHER_DIAMOND = registerItem("fire_ether_diamond",new Item(new FabricItemSettings()));
    public static final Item ICE_ETHER_DIAMOND = registerItem("ice_ether_diamond",new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup1(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TEST);
    }
    private static void addItemsToItemGroup2(FabricItemGroupEntries fabricItemGroupEntries){ //use this
        fabricItemGroupEntries.add(WATER_ETHER);
        fabricItemGroupEntries.add(FIRE_ETHER);
        fabricItemGroupEntries.add(ICE_ETHER);
        fabricItemGroupEntries.add(WATER_ETHER_DIAMOND);
        fabricItemGroupEntries.add(FIRE_ETHER_DIAMOND);
        fabricItemGroupEntries.add(ICE_ETHER_DIAMOND);

    }

    private static Item registerItem(String name,Item item){
//        return Registry.register(Registries.ITEM,new Identifier(FirstMod.MOD_ID,name),item);//        简化的注册方法
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),new Identifier(FirstMod.MOD_ID,name)),item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup1);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup2); //use this
    }
}