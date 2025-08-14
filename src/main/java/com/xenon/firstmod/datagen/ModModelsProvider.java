package com.xenon.firstmod.datagen;

import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WATER_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST,Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_ETHER_DIAMOND,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER_DIAMOND,Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_ETHER_DIAMOND,Models.GENERATED);
    }
}
