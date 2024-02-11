package com.coqire.bagesequineyaddon.item;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.items.tack.*;

import com.coqire.bagesequineyaddon.BageksEquineyAddOn;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

    public static List<RegistryObject<HalterItem>> HALTERS;

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB)));

    public static final RegistryObject<Item> SUNBURST = ITEMS.register("sunburst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> HALTER_1 = ITEMS.register("halter_1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}