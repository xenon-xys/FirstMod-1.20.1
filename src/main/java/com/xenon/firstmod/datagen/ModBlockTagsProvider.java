package com.xenon.firstmod.datagen;

import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
        super(output,registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup){
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.WATER_ETHER_BLOCK)
                .add(ModBlocks.FIRE_ETHER_BLOCK)
                .add(ModBlocks.ICE_ETHER_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.WATER_ETHER_BLOCK)
                .add(ModBlocks.FIRE_ETHER_BLOCK)
                .add(ModBlocks.ICE_ETHER_BLOCK);

        getOrCreateTagBuilder(ModBlockTags.ETHER_BLOCK)
                .add(ModBlocks.WATER_ETHER_BLOCK)
                .add(ModBlocks.FIRE_ETHER_BLOCK)
                .add(ModBlocks.ICE_ETHER_BLOCK);

        getOrCreateTagBuilder(ModBlockTags.ORE_BLOCK)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES);
    }
}
