package com.xenon.firstmod.datagen;

import com.xenon.firstmod.FirstMod;
import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.item.ModItems;
import com.xenon.firstmod.tag.ModBlockTags;
import com.xenon.firstmod.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.WATER_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.WATER_ETHER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.FIRE_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRE_ETHER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);
        //ShapedRecipeJsonBuilder
        //ShapelessRecipeJsonBuilder
        //offerSmelting
        //offerBlasting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.TEST,1)
                .input(ModItems.FIRE_COAL)
                .input(ModItemTags.ORE_BLOCK)
                .criterion(hasItem(ModItems.FIRE_COAL),conditionsFromTag(ModItemTags.ORE_BLOCK))
                .offerTo(exporter, new Identifier(FirstMod.MOD_ID,"ore_block_test"));

    }
}
