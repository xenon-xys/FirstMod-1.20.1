package com.xenon.firstmod.datagen;

import com.xenon.firstmod.block.ModBlocks;
import com.xenon.firstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WATER_ETHER_BLOCK);
        addDrop(ModBlocks.FIRE_ETHER_BLOCK);
        addDrop(ModBlocks.ICE_ETHER_BLOCK,EtherBlockDrops(ModBlocks.ICE_ETHER_BLOCK, ModItems.ICE_ETHER,9.0f,9.0f));

    }

    public LootTable.Builder EtherBlockDrops(Block drop, Item item, float min,float max){
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                )
        );
    }
}
