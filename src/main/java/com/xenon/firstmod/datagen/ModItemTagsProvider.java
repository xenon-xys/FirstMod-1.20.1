package com.xenon.firstmod.datagen;

import com.xenon.firstmod.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture){
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup){
        getOrCreateTagBuilder(ModItemTags.ORE_BLOCK)
                .forceAddTag(ItemTags.COAL_ORES)
                .forceAddTag(ItemTags.IRON_ORES)
                .forceAddTag(ItemTags.COPPER_ORES)
                .forceAddTag(ItemTags.DIAMOND_ORES)
                .forceAddTag(ItemTags.EMERALD_ORES)
                .forceAddTag(ItemTags.GOLD_ORES)
                .forceAddTag(ItemTags.REDSTONE_ORES)
                .forceAddTag(ItemTags.LAPIS_ORES);
    }
}
