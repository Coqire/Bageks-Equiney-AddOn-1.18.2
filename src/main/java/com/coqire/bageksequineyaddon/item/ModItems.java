package com.coqire.bageksequineyaddon.item;

import com.alaharranhonor.swem.forge.items.tack.*;

import com.coqire.bageksequineyaddon.BageksEquineyAddOn;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

    public static List<RegistryObject<HalterItem>> HALTERS;
    public static List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static List<RegistryObject<LegWrapsItem>> ENGLISH_LEG_WRAPS;
    public static List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES;
    public static List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS;
    public static List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES;
    public static List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS;

    //  LAYOUT   public static final RegistryObject<Item> _ = ITEMS.register("_",
    //            () -> new Item("_", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    public static final RegistryObject<Item> SUNBURST = ITEMS.register("sunburst",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    // Haters
    public static final RegistryObject<HalterItem> HALTER_1 = ITEMS.register("halter_1",
            () -> new HalterItem("halter_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_2 = ITEMS.register("halter_2",
            () -> new HalterItem("halter_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_3 = ITEMS.register("halter_3",
            () -> new HalterItem("halter_3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_4 = ITEMS.register("halter_4",
            () -> new HalterItem("halter_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_5 = ITEMS.register("halter_5",
            () -> new HalterItem("halter_5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_6 = ITEMS.register("halter_6",
            () -> new HalterItem("halter_6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_7 = ITEMS.register("halter_7",
            () -> new HalterItem("halter_7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_red = ITEMS.register("halter_fluffy_red",
            () -> new HalterItem("halter_fluffy_red", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_orange = ITEMS.register("halter_fluffy_orange",
            () -> new HalterItem("halter_fluffy_orange", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_yellow = ITEMS.register("halter_fluffy_yellow",
            () -> new HalterItem("halter_fluffy_yellow", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_lime = ITEMS.register("halter_fluffy_lime",
            () -> new HalterItem("halter_fluffy_lime", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_green = ITEMS.register("halter_fluffy_green",
            () -> new HalterItem("halter_fluffy_green", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_cyan = ITEMS.register("halter_fluffy_cyan",
            () -> new HalterItem("halter_fluffy_cyan", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_light_blue = ITEMS.register("halter_fluffy_light_blue",
            () -> new HalterItem("halter_fluffy_light_blue", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_blue = ITEMS.register("halter_fluffy_blue",
            () -> new HalterItem("halter_fluffy_blue", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_purple = ITEMS.register("halter_fluffy_purple",
            () -> new HalterItem("halter_fluffy_purple", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_magetna = ITEMS.register("halter_fluffy_magenta",
            () -> new HalterItem("halter_fluffy_magenta", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_pink = ITEMS.register("halter_fluffy_pink",
            () -> new HalterItem("halter_fluffy_pink", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_white = ITEMS.register("halter_fluffy_white",
            () -> new HalterItem("halter_fluffy_white", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_brown = ITEMS.register("halter_fluffy_brown",
            () -> new HalterItem("halter_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_light_gray = ITEMS.register("halter_fluffy_light_gray",
            () -> new HalterItem("halter_fluffy_light_gray", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_gray = ITEMS.register("halter_fluffy_gray",
            () -> new HalterItem("halter_fluffy_gray", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_black = ITEMS.register("halter_fluffy_black",
            () -> new HalterItem("halter_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_anna = ITEMS.register("halter_anna",
            () -> new HalterItem("halter_anna", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_ANNA = ITEMS.register("halter_fluffy_anna",
            () -> new HalterItem("halter_fluffy_anna", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_savv = ITEMS.register("halter_savv",
            () -> new HalterItem("halter_savv", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_SAVV = ITEMS.register("halter_fluffy_savv",
            () -> new HalterItem("halter_fluffy_savv", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // BreastCollars
     public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_black = ITEMS.register("english_breast_collar_xc_black",
             () -> new BreastCollarItem("english_breast_collar_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_fluffy_black = ITEMS.register("english_breast_collar_xc_fluffy_black",
            () -> new BreastCollarItem("english_breast_collar_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Girth Straps
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_black = ITEMS.register("english_girth_strap_xc_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_fluffy_black = ITEMS.register("english_girth_strap_xc_fluffy_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
