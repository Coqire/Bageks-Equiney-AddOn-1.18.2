package com.coqire.bageksequineyaddon.item;

import com.alaharranhonor.swem.forge.items.tack.*;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;

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
    public static List<RegistryObject<HalterItem>> FLYMASKS;

    //  LAYOUT   public static final RegistryObject<Item> _ = ITEMS.register("_",
    //            () -> new Item("_", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    public static final RegistryObject<Item> SUNBURST = ITEMS.register("sunburst",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> SUNBURST_SHARD = ITEMS.register("sunburst_shard",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium = ITEMS.register("equium",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_shard = ITEMS.register("equium_shard",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite = ITEMS.register("coralarite",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_shard = ITEMS.register("coralarite_shard",
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
    public static final RegistryObject<HalterItem> halter_8 = ITEMS.register("halter_8",
            () -> new HalterItem("halter_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_9 = ITEMS.register("halter_9",
            () -> new HalterItem("halter_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_10 = ITEMS.register("halter_10",
            () -> new HalterItem("halter_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_11 = ITEMS.register("halter_11",
            () -> new HalterItem("halter_11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_12 = ITEMS.register("halter_12",
            () -> new HalterItem("halter_12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_13 = ITEMS.register("halter_13",
            () -> new HalterItem("halter_13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_14 = ITEMS.register("halter_14",
            () -> new HalterItem("halter_14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_15 = ITEMS.register("halter_15",
            () -> new HalterItem("halter_15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
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
    public static final RegistryObject<HalterItem> halter_emma = ITEMS.register("halter_emma",
            () -> new HalterItem("halter_emma", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_emma = ITEMS.register("halter_fluffy_emma",
            () -> new HalterItem("halter_fluffy_emma", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_reese = ITEMS.register("halter_reese",
            () -> new HalterItem("halter_reese", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_reese = ITEMS.register("halter_fluffy_reese",
            () -> new HalterItem("halter_fluffy_reese", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


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

    // Saddles
    public static final RegistryObject<EnglishSaddleItem> english_saddle_xc_black = ITEMS.register("english_saddle_xc_black",
            () -> new EnglishSaddleItem("english_saddle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Bridles
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_black = ITEMS.register("english_bridle_xc_black",
            () -> new EnglishBridleItem("english_bridle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_fluffy_black = ITEMS.register("english_bridle_xc_fluffy_black",
            () -> new EnglishBridleItem("english_bridle_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Saddle Pads
    public static final RegistryObject<EnglishBlanketItem> english_blanket_1 = ITEMS.register("english_blanket_1",
            () -> new EnglishBlanketItem("english_blanket_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_2 = ITEMS.register("english_blanket_2",
            () -> new EnglishBlanketItem("english_blanket_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_3 = ITEMS.register("english_blanket_3",
            () -> new EnglishBlanketItem("english_blanket_3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_4 = ITEMS.register("english_blanket_4",
            () -> new EnglishBlanketItem("english_blanket_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_5 = ITEMS.register("english_blanket_5",
            () -> new EnglishBlanketItem("english_blanket_5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_6 = ITEMS.register("english_blanket_6",
            () -> new EnglishBlanketItem("english_blanket_6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_8 = ITEMS.register("english_blanket_8",
            () -> new EnglishBlanketItem("english_blanket_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_7 = ITEMS.register("english_blanket_7",
            () -> new EnglishBlanketItem("english_blanket_7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_9 = ITEMS.register("english_blanket_9",
            () -> new EnglishBlanketItem("english_blanket_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_10 = ITEMS.register("english_blanket_10",
            () -> new EnglishBlanketItem("english_blanket_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_11 = ITEMS.register("english_blanket_11",
            () -> new EnglishBlanketItem("english_blanket_11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_12 = ITEMS.register("english_blanket_12",
            () -> new EnglishBlanketItem("english_blanket_12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_13 = ITEMS.register("english_blanket_13",
            () -> new EnglishBlanketItem("english_blanket_13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_14 = ITEMS.register("english_blanket_14",
            () -> new EnglishBlanketItem("english_blanket_14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_15 = ITEMS.register("english_blanket_15",
            () -> new EnglishBlanketItem("english_blanket_15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


    //Leg wraps
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_1 = ITEMS.register("english_leg_wraps_1",
        () -> new EnglishLegWraps("english_leg_wraps_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_2 = ITEMS.register("english_leg_wraps_2",
            () -> new EnglishLegWraps("english_leg_wraps_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_3 = ITEMS.register("english_leg_wraps_3",
            () -> new EnglishLegWraps("english_leg_wraps_3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_4 = ITEMS.register("english_leg_wraps_4",
            () -> new EnglishLegWraps("english_leg_wraps_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_5 = ITEMS.register("english_leg_wraps_5",
            () -> new EnglishLegWraps("english_leg_wraps_5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_6 = ITEMS.register("english_leg_wraps_6",
            () -> new EnglishLegWraps("english_leg_wraps_6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_8 = ITEMS.register("english_leg_wraps_8",
            () -> new EnglishLegWraps("english_leg_wraps_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_7 = ITEMS.register("english_leg_wraps_7",
            () -> new EnglishLegWraps("english_leg_wraps_7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_9 = ITEMS.register("english_leg_wraps_9",
            () -> new EnglishLegWraps("english_leg_wraps_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_10 = ITEMS.register("english_leg_wraps_10",
            () -> new EnglishLegWraps("english_leg_wraps_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_11 = ITEMS.register("english_leg_wraps_11",
            () -> new EnglishLegWraps("english_leg_wraps_11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_12 = ITEMS.register("english_leg_wraps_12",
            () -> new EnglishLegWraps("english_leg_wraps_12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_13 = ITEMS.register("english_leg_wraps_13",
            () -> new EnglishLegWraps("english_leg_wraps_13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_14 = ITEMS.register("english_leg_wraps_14",
            () -> new EnglishLegWraps("english_leg_wraps_14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_15 = ITEMS.register("english_leg_wraps_15",
            () -> new EnglishLegWraps("english_leg_wraps_15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

// Protective Boots
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_protective_1 = ITEMS.register("english_leg_wraps_protective_1",
            () -> new EnglishLegWraps("english_leg_wraps_protective_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_protective_4 = ITEMS.register("english_leg_wraps_protective_4",
            () -> new EnglishLegWraps("english_leg_wraps_protective_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_protective_8 = ITEMS.register("english_leg_wraps_protective_8",
            () -> new EnglishLegWraps("english_leg_wraps_protective_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_protective_9 = ITEMS.register("english_leg_wraps_protective_9",
            () -> new EnglishLegWraps("english_leg_wraps_protective_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_protective_10 = ITEMS.register("english_leg_wraps_protective_10",
            () -> new EnglishLegWraps("english_leg_wraps_protective_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Flymasks
    public static final RegistryObject<HalterItem> flymask_1 = ITEMS.register("flymask_1",
            () -> new HalterItem("flymask_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_4 = ITEMS.register("flymask_4",
            () -> new HalterItem("flymask_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_8 = ITEMS.register("flymask_8",
            () -> new HalterItem("flymask_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_9 = ITEMS.register("flymask_9",
            () -> new HalterItem("flymask_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_10 = ITEMS.register("flymask_10",
            () -> new HalterItem("flymask_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


public static final RegistryObject<Item> pasture_blanket_1 = ITEMS.register("pasture_blanket_1",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_2 = ITEMS.register("pasture_blanket_2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_3 = ITEMS.register("pasture_blanket_3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_4 = ITEMS.register("pasture_blanket_4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_5 = ITEMS.register("pasture_blanket_5",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_6 = ITEMS.register("pasture_blanket_6",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_7 = ITEMS.register("pasture_blanket_7",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_8 = ITEMS.register("pasture_blanket_8",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_9 = ITEMS.register("pasture_blanket_9",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_10 = ITEMS.register("pasture_blanket_10",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_11 = ITEMS.register("pasture_blanket_11",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_12 = ITEMS.register("pasture_blanket_12",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_13 = ITEMS.register("pasture_blanket_13",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_14 = ITEMS.register("pasture_blanket_14",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_15 = ITEMS.register("pasture_blanket_15",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> PASTURE_BLANKET_P1 = ITEMS.register("pasture_blanket_p1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> PASTURE_BLANKET_P2 = ITEMS.register("pasture_blanket_p2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> PASTURE_BLANKET_P3 = ITEMS.register("pasture_blanket_p3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> PASTURE_BLANKET_P4 = ITEMS.register("pasture_blanket_p4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> PASTURE_BLANKET_P5 = ITEMS.register("pasture_blanket_p5",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
