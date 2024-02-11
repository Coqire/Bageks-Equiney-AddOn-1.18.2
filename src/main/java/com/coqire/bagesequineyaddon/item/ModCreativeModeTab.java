package com.coqire.bagesequineyaddon.item;

import com.coqire.bagesequineyaddon.BageksEquineyAddOn;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BAGEKSADDON_TAB = new CreativeModeTab("bageksaddontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BAGUETTE.get());
        }
    };
}
