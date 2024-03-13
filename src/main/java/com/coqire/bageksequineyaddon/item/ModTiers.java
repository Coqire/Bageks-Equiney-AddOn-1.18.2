package com.coqire.bageksequineyaddon.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier SUNBURST = new ForgeTier(2,300,6.0f
            ,2.0f,14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SUNBURST.get()));
    public static final ForgeTier EQUIUM = new ForgeTier(3,1400,8.0f
            ,2.0f,10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.equium.get()));
    public static final ForgeTier CORALARITE = new ForgeTier(3,800,7.0f
            ,2.0f,12, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.coralarite.get()));
}
