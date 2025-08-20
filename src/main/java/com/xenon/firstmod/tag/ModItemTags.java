package com.xenon.firstmod.tag;

import com.xenon.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    //public static final TagKey<Item> SUGAR_INGREDIENTS = of("sugar_ingredients");
    public static final TagKey<Item> ORE_BLOCK = of("ore_block");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(FirstMod.MOD_ID,id));
    }
}