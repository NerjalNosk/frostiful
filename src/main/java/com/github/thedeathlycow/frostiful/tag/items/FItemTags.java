package com.github.thedeathlycow.frostiful.tag.items;

import com.github.thedeathlycow.frostiful.init.Frostiful;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class FItemTags {

    public static final TagKey<Item> POWDER_SNOW_WALKABLE = register("powder_snow_walkable");

    private static TagKey<Item> register(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Frostiful.MODID, id));
    }

}
