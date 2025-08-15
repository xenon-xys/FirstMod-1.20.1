package com.xenon.firstmod.datagen;

import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.item.ModItemGroups;
import com.xenon.firstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TEST,"Test");
        translationBuilder.add(ModItems.WATER_ETHER,"Water Ether");
        translationBuilder.add(ModItems.FIRE_ETHER,"Fire Ether");
        translationBuilder.add(ModItems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(ModItems.WATER_ETHER_DIAMOND,"Water Ether Diamond");
        translationBuilder.add(ModItems.FIRE_ETHER_DIAMOND,"Fire Ether Diamond");
        translationBuilder.add(ModItems.ICE_ETHER_DIAMOND,"Ice Ether Diamond");
        translationBuilder.add(ModItems.DIAMOND_APPLE,"Diamond Apple");
        translationBuilder.add(ModItems.FIRE_COAL,"Fire Coal");

        translationBuilder.add(ModBlocks.WATER_ETHER_BLOCK,"Water Ether Block");
        translationBuilder.add(ModBlocks.FIRE_ETHER_BLOCK,"Fire Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");

        translationBuilder.add(ModItemGroups.ETHER_GROUP,"Ether Group");
        translationBuilder.add(ModItemGroups.MOD_FOOD_GROUP,"Mod Food Group");
    }
}
