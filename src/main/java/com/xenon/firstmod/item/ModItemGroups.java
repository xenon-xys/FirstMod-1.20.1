package com.xenon.firstmod.item;

import com.xenon.firstmod.FirstMod;
import com.xenon.firstmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> ETHER_GROUP = register("ether_group");
    public static final RegistryKey<ItemGroup> MOD_FOOD_GROUP = register(("mod_food_group"));

    public static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP,new Identifier(id));
    }

    public static void registerGroups(){
        Registry.register(
                Registries.ITEM_GROUP,
                ETHER_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.ether_group"))
                        .icon(()->new ItemStack(ModItems.WATER_ETHER))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.WATER_ETHER);
                            entries.add(ModItems.FIRE_ETHER);
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(ModBlocks.WATER_ETHER_BLOCK);
                            entries.add(ModBlocks.FIRE_ETHER_BLOCK);
                            entries.add(ModBlocks.ICE_ETHER_BLOCK);
                            entries.add(ModItems.WATER_ETHER_DIAMOND);
                            entries.add(ModItems.FIRE_ETHER_DIAMOND);
                            entries.add(ModItems.ICE_ETHER_DIAMOND);
                            entries.add(ModItems.FIRE_COAL);
                        }).build());
        Registry.register(
                Registries.ITEM_GROUP,
                MOD_FOOD_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.mod_food_group"))
                        .icon(()->new ItemStack(ModItems.DIAMOND_APPLE))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.DIAMOND_APPLE);
                        }).build());
    }


//    public static final ItemGroup FIRST_GROUP = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(FirstMod.MOD_ID,"first_group"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.first_group")).
//                    icon(()->new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
//                        entries.add(ModItems.TEST);
//                    }).build());
    public static void registerModItemGroup(){

    }
}
