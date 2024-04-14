package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class BageksTack {
    public static final DeferredRegister<Item> ITEMS;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK_PASTEL;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_BAGEK;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAP_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        HALTER_BAGEK = new ArrayList();
        HALTER_BAGEK_PASTEL = new ArrayList();
        HALTER_FLUFFY_BAGEK = new ArrayList<>();
        PASTURE_BLANKET_BAGEK = new ArrayList();
        ENGLISH_BLANKET_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
        ENGLISH_SADDLE_BAGEK = new ArrayList();
        ENGLISH_BREAST_COLLAR_BAGEK = new ArrayList();
        ENGLISH_BRIDLE_BAGEK = new ArrayList();
        ENGLISH_GIRTH_STRAP_BAGEK = new ArrayList();
        FLYMASK_BAGEK = new ArrayList<>();

        int var1 = 15;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            int counter = rContext.var2;
            HALTER_BAGEK.add(ITEMS.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));


            HALTER_BAGEK_PASTEL.add(ITEMS.register("halter_bagek_p" + counter, () ->
                    new HalterItem("halter_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            FLYMASK_BAGEK.add(ITEMS.register("flymask_bagek_" + counter, () ->
                    new HalterItem("flymask_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));


            ++rContext.var2;

        }

    }
}