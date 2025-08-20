package com.xenon.firstmod.tag;

import com.xenon.firstmod.FirstMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> ETHER_BLOCK = of("ether_block");
    public static final TagKey<Block> ORE_BLOCK = of("ore_block");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(FirstMod.MOD_ID,id));
    }
}
