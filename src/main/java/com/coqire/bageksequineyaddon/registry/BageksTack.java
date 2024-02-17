package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.items.tack.*;
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
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS;


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        HALTERS = new ArrayList();
        PASTURE_BLANKETS = new ArrayList();
        ENGLISH_BLANKETS = new ArrayList();
        ENGLISH_LEG_WRAPS = new ArrayList();
        ENGLISH_SADDLES = new ArrayList();
        ENGLISH_BREAST_COLLARS = new ArrayList();
        ENGLISH_BRIDLES = new ArrayList();
        ENGLISH_GIRTH_STRAPS = new ArrayList();
        FLYMASKS = new ArrayList<>();

    }
}