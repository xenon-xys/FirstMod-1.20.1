package com.xenon.firstmod.item;

import com.xenon.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST = registerItem("test",new Item(new FabricItemSettings()));
    public static final Item WATER_ETHER = registerItem("water_ether",new Item(new FabricItemSettings()));
    public static final Item FIRE_ETHER = registerItem("fire_ether",new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TEST);
    }
    private static void addItemsToItemGroup1(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(WATER_ETHER);
        fabricItemGroupEntries.add(FIRE_ETHER);
    }

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(FirstMod.MOD_ID,name),item);

    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup1);
    }
}