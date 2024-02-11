package com.coqire.bagesequineyaddon.registry;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.List;

import com.coqire.bagesequineyaddon.BageksEquineyAddOn;
import com.coqire.bagesequineyaddon.item.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

import static com.coqire.bagesequineyaddon.item.ModItems.ITEMS;

public class TackItems {

    public static List<RegistryObject<HalterItem>> HALTERS;
    public static final RegistryObject<Item> HALTER_BAGEK = ITEMS.register("halter_bagek",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

    }
}





