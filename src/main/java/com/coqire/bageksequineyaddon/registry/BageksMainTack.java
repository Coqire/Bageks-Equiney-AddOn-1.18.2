package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.BageksEquineyAddOn;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BageksMainTack {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // ENGLISH SADDLES
    public static final RegistryObject<EnglishSaddleItem> english_saddle_xc_black = ITEMS.register("english_saddle_xc_black",
            () -> new EnglishSaddleItem("english_saddle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishSaddleItem> english_saddle_xc_brown = ITEMS.register("english_saddle_xc_brown",
            () -> new EnglishSaddleItem("english_saddle_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));

    // ENGLISH BRIDLES
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_black = ITEMS.register("english_bridle_xc_black",
            () -> new EnglishBridleItem("english_bridle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_fluffy_black = ITEMS.register("english_bridle_xc_fluffy_black",
            () -> new EnglishBridleItem("english_bridle_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_brown = ITEMS.register("english_bridle_xc_brown",
            () -> new EnglishBridleItem("english_bridle_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_fluffy_brown = ITEMS.register("english_bridle_xc_fluffy_brown",
            () -> new EnglishBridleItem("english_bridle_xc_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));

    // ENGLISH GIRTHS
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_black = ITEMS.register("english_girth_strap_xc_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_fluffy_black = ITEMS.register("english_girth_strap_xc_fluffy_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_brown = ITEMS.register("english_girth_strap_xc_brown",
            () -> new EnglishGirthStrap("english_girth_strap_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_fluffy_brown = ITEMS.register("english_girth_strap_xc_fluffy_brown",
            () -> new EnglishGirthStrap("english_girth_strap_xc_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_anatomic_black = ITEMS.register("english_girth_strap_anatomic_black",
            () -> new EnglishGirthStrap("english_girth_strap_anatomic_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_anatomic_brown = ITEMS.register("english_girth_strap_anatomic_brown",
            () -> new EnglishGirthStrap("english_girth_strap_anatomic_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_anatomic_fluffy_black = ITEMS.register("english_girth_strap_anatomic_fluffy_black",
            () -> new EnglishGirthStrap("english_girth_strap_anatomic_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_anatomic_fluffy_brown = ITEMS.register("english_girth_strap_anatomic_fluffy_brown",
            () -> new EnglishGirthStrap("english_girth_strap_anatomic_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_fluffy_brown = ITEMS.register("english_girth_strap_fluffy_brown",
            () -> new EnglishGirthStrap("english_girth_strap_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_fluffy_black = ITEMS.register("english_girth_strap_fluffy_black",
            () -> new EnglishGirthStrap("english_girth_strap_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));

    // ENGLISH BREAST COLLARS
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_xc_black = ITEMS.register("english_breast_collar_xc_black",
            () -> new EnglishBreastCollar("english_breast_collar_xc_black", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_xc_fluffy_black = ITEMS.register("english_breast_collar_xc_fluffy_black",
            () -> new EnglishBreastCollar("english_breast_collar_xc_fluffy_black", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_freemotion_black = ITEMS.register("english_breast_collar_freemotion_black",
            () -> new EnglishBreastCollar("english_breast_collar_freemotion_black", new Item.Properties().
                    tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_xc_brown = ITEMS.register("english_breast_collar_xc_brown",
            () -> new EnglishBreastCollar ("english_breast_collar_xc_brown", new Item.Properties().
                    tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_xc_fluffy_brown = ITEMS.register("english_breast_collar_xc_fluffy_brown",
            () -> new EnglishBreastCollar("english_breast_collar_xc_fluffy_brown", new Item.Properties().
                    tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> english_breast_collar_freemotion_brown = ITEMS.register("english_breast_collar_freemotion_brown",
            () -> new EnglishBreastCollar("english_breast_collar_freemotion_brown", new Item.Properties().
                    tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_ENGLISH_BLACK = ITEMS.register("english_breast_collar_english_black",
            () -> new EnglishBreastCollar("english_breast_collar_english_black", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_ENGLISH_BROWN = ITEMS.register("english_breast_collar_english_brown",
            () -> new EnglishBreastCollar("english_breast_collar_english_brown", new Item.Properties().
                    tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));


    // TRAVEL BOOTS
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_travel_bagek_1 = ITEMS.register("english_leg_wraps_travel_bagek_1",
            () -> new EnglishLegWraps("english_leg_wraps_travel_bagek_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_travel_bagek_4 = ITEMS.register("english_leg_wraps_travel_bagek_4",
            () -> new EnglishLegWraps("english_leg_wraps_travel_bagek_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_travel_bagek_8 = ITEMS.register("english_leg_wraps_travel_bagek_8",
            () -> new EnglishLegWraps("english_leg_wraps_travel_bagek_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_travel_bagek_9 = ITEMS.register("english_leg_wraps_travel_bagek_9",
            () -> new EnglishLegWraps("english_leg_wraps_travel_bagek_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_travel_bagek_10 = ITEMS.register("english_leg_wraps_travel_bagek_10",
            () -> new EnglishLegWraps("english_leg_wraps_travel_bagek_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16)));

}
