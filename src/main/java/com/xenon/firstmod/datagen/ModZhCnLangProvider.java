package com.xenon.firstmod.datagen;

import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.item.ModItemGroups;
import com.xenon.firstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TEST,"测试");
        translationBuilder.add(ModItems.WATER_ETHER,"水元素");
        translationBuilder.add(ModItems.FIRE_ETHER,"火元素");
        translationBuilder.add(ModItems.ICE_ETHER,"冰元素");
        translationBuilder.add(ModItems.WATER_ETHER_DIAMOND,"水元素钻石");
        translationBuilder.add(ModItems.FIRE_ETHER_DIAMOND,"火元素钻石");
        translationBuilder.add(ModItems.ICE_ETHER_DIAMOND,"冰元素钻石");

        translationBuilder.add(ModBlocks.WATER_ETHER_BLOCK,"水元素方块");
        translationBuilder.add(ModBlocks.FIRE_ETHER_BLOCK,"火元素方块");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"冰元素方块");

        translationBuilder.add(ModItemGroups.ETHER_GROUP,"元素");
    }
}
