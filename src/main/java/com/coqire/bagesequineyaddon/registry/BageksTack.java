package com.coqire.bagesequineyaddon.registry;


import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bagesequineyaddon.item.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class BageksTack {
    public static final DeferredRegister<Item> ITEMS;
    public static final List<RegistryObject<HalterItem>> HALTERS;


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        HALTERS = new ArrayList();

    }
}