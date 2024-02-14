package com.coqire.bageksequineyaddon.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BageksAddonCreativeModeTab {
    public static final CreativeModeTab BAGEKSADDON_TAB = new CreativeModeTab("bageksaddontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BAGUETTE.get());
        }
    };
}
