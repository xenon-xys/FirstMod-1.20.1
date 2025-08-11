package com.xenon.firstmod.item;

import com.xenon.firstmod.FirstMod;
import com.xenon.firstmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FIRST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID,"first_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.first_group")).
                    icon(()->new ItemStack(ModItems.WATER_ETHER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WATER_ETHER);
                        entries.add(ModItems.FIRE_ETHER);
                        entries.add(ModBlocks.WATER_ETHER_BLOCK);
                        entries.add(ModBlocks.FIRE_ETHER_BLOCK);
                    }).build());
    public static void registerModItemGroup(){

    }
}
