package com.coqire.bageksequineyaddon.item;

import com.alaharranhonor.swem.forge.items.tack.*;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;

import com.coqire.bageksequineyaddon.BageksEquineyAddOn;
import net.minecraft.world.item.*;
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
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).food(ModFoods.BAGUETTE)));
    public static final RegistryObject<Item> PINK_DONUT_TREAT = ITEMS.register("pink_donut_treat",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).food(ModFoods.PINK_DONUT_TREAT)));
    public static final RegistryObject<Item> BLUE_DONUT_TREAT = ITEMS.register("blue_donut_treat",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).food(ModFoods.BLUE_DONUT_TREAT)));
    public static final RegistryObject<Item> YELLOW_DONUT_TREAT = ITEMS.register("yellow_donut_treat",
            () -> new Item(new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).food(ModFoods.YELLOW_DONUT_TREAT)));

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
    public static final RegistryObject<HalterItem> HALTER_B1 = ITEMS.register("halter_b1",
            () -> new HalterItem("halter_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_B2 = ITEMS.register("halter_b2",
            () -> new HalterItem("halter_b2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_B3 = ITEMS.register("halter_b3",
            () -> new HalterItem("halter_b3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_B4 = ITEMS.register("halter_b4",
            () -> new HalterItem("halter_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b5 = ITEMS.register("halter_b5",
            () -> new HalterItem("halter_b5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_B6 = ITEMS.register("halter_b6",
            () -> new HalterItem("halter_b6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_B7 = ITEMS.register("halter_b7",
            () -> new HalterItem("halter_b7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_B8 = ITEMS.register("halter_b8",
            () -> new HalterItem("halter_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_B9 = ITEMS.register("halter_b9",
            () -> new HalterItem("halter_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_B10 = ITEMS.register("halter_b10",
            () -> new HalterItem("halter_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b11 = ITEMS.register("halter_b11",
            () -> new HalterItem("halter_b11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b12 = ITEMS.register("halter_b12",
            () -> new HalterItem("halter_b12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b13 = ITEMS.register("halter_b13",
            () -> new HalterItem("halter_b13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b14 = ITEMS.register("halter_b14",
            () -> new HalterItem("halter_b14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_b15 = ITEMS.register("halter_b15",
            () -> new HalterItem("halter_b15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
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
    public static final RegistryObject<HalterItem> halter_p1 = ITEMS.register("halter_p1",
            () -> new HalterItem("halter_p1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_p2 = ITEMS.register("halter_p2",
            () -> new HalterItem("halter_p2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_p3 = ITEMS.register("halter_p3",
            () -> new HalterItem("halter_p3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_p4 = ITEMS.register("halter_p4",
            () -> new HalterItem("halter_p4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_p5 = ITEMS.register("halter_p5",
            () -> new HalterItem("halter_p5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


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
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b1 = ITEMS.register("english_blanket_b1",
            () -> new EnglishBlanketItem("english_blanket_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b2 = ITEMS.register("english_blanket_b2",
            () -> new EnglishBlanketItem("english_blanket_b2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b3 = ITEMS.register("english_blanket_b3",
            () -> new EnglishBlanketItem("english_blanket_b3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b4 = ITEMS.register("english_blanket_b4",
            () -> new EnglishBlanketItem("english_blanket_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b5 = ITEMS.register("english_blanket_b5",
            () -> new EnglishBlanketItem("english_blanket_b5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b6 = ITEMS.register("english_blanket_b6",
            () -> new EnglishBlanketItem("english_blanket_b6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b8 = ITEMS.register("english_blanket_b8",
            () -> new EnglishBlanketItem("english_blanket_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b7 = ITEMS.register("english_blanket_b7",
            () -> new EnglishBlanketItem("english_blanket_b7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b9 = ITEMS.register("english_blanket_b9",
            () -> new EnglishBlanketItem("english_blanket_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b10 = ITEMS.register("english_blanket_b10",
            () -> new EnglishBlanketItem("english_blanket_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b11 = ITEMS.register("english_blanket_b11",
            () -> new EnglishBlanketItem("english_blanket_b11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b12 = ITEMS.register("english_blanket_b12",
            () -> new EnglishBlanketItem("english_blanket_b12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b13 = ITEMS.register("english_blanket_b13",
            () -> new EnglishBlanketItem("english_blanket_b13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b14 = ITEMS.register("english_blanket_b14",
            () -> new EnglishBlanketItem("english_blanket_b14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBlanketItem> english_blanket_b15 = ITEMS.register("english_blanket_b15",
            () -> new EnglishBlanketItem("english_blanket_b15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


    //Leg wraps
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b1 = ITEMS.register("english_leg_wraps_b1",
        () -> new EnglishLegWraps("english_leg_wraps_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b2 = ITEMS.register("english_leg_wraps_b2",
            () -> new EnglishLegWraps("english_leg_wraps_b2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b3 = ITEMS.register("english_leg_wraps_b3",
            () -> new EnglishLegWraps("english_leg_wraps_b3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b4 = ITEMS.register("english_leg_wraps_b4",
            () -> new EnglishLegWraps("english_leg_wraps_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b5 = ITEMS.register("english_leg_wraps_b5",
            () -> new EnglishLegWraps("english_leg_wraps_b5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b6 = ITEMS.register("english_leg_wraps_b6",
            () -> new EnglishLegWraps("english_leg_wraps_b6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b8 = ITEMS.register("english_leg_wraps_b8",
            () -> new EnglishLegWraps("english_leg_wraps_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b7 = ITEMS.register("english_leg_wraps_b7",
            () -> new EnglishLegWraps("english_leg_wraps_b7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b9 = ITEMS.register("english_leg_wraps_b9",
            () -> new EnglishLegWraps("english_leg_wraps_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b10 = ITEMS.register("english_leg_wraps_b10",
            () -> new EnglishLegWraps("english_leg_wraps_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b11 = ITEMS.register("english_leg_wraps_b11",
            () -> new EnglishLegWraps("english_leg_wraps_b11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b12 = ITEMS.register("english_leg_wraps_b12",
            () -> new EnglishLegWraps("english_leg_wraps_b12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b13 = ITEMS.register("english_leg_wraps_b13",
            () -> new EnglishLegWraps("english_leg_wraps_b13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b14 = ITEMS.register("english_leg_wraps_b14",
            () -> new EnglishLegWraps("english_leg_wraps_b14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_b15 = ITEMS.register("english_leg_wraps_b15",
            () -> new EnglishLegWraps("english_leg_wraps_b15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

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
    public static final RegistryObject<HalterItem> flymask_b1 = ITEMS.register("flymask_b1",
            () -> new HalterItem("flymask_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_b4 = ITEMS.register("flymask_b4",
            () -> new HalterItem("flymask_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_b8 = ITEMS.register("flymask_b8",
            () -> new HalterItem("flymask_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_b9 = ITEMS.register("flymask_b9",
            () -> new HalterItem("flymask_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> flymask_b10 = ITEMS.register("flymask_b10",
            () -> new HalterItem("flymask_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


public static final RegistryObject<Item> pasture_blanket_b1 = ITEMS.register("pasture_blanket_b1",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b2 = ITEMS.register("pasture_blanket_b2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b3 = ITEMS.register("pasture_blanket_b3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b4 = ITEMS.register("pasture_blanket_b4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b5 = ITEMS.register("pasture_blanket_b5",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b6 = ITEMS.register("pasture_blanket_b6",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b7 = ITEMS.register("pasture_blanket_b7",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b7", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b8 = ITEMS.register("pasture_blanket_b8",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b9 = ITEMS.register("pasture_blanket_b9",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b10 = ITEMS.register("pasture_blanket_b10",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b11 = ITEMS.register("pasture_blanket_b11",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b11", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b12 = ITEMS.register("pasture_blanket_b12",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b12", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b13 = ITEMS.register("pasture_blanket_b13",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b13", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b14 = ITEMS.register("pasture_blanket_b14",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b14", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_b15 = ITEMS.register("pasture_blanket_b15",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_b15", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_P1 = ITEMS.register("pasture_blanket_p1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_P2 = ITEMS.register("pasture_blanket_p2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_P3 = ITEMS.register("pasture_blanket_p3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_P4 = ITEMS.register("pasture_blanket_p4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_P5 = ITEMS.register("pasture_blanket_p5",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_p5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    // Weapons
    public static final RegistryObject<Item> SUNBURST_SWORD = ITEMS.register("sunburst_sword",
            () -> new SwordItem(ModTiers.SUNBURST,4,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> SUNBURST_PICKAXE = ITEMS.register("sunburst_pickaxe",
            () -> new PickaxeItem(ModTiers.SUNBURST,1,2f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> SUNBURST_AXE = ITEMS.register("sunburst_axe",
            () -> new AxeItem(ModTiers.SUNBURST,3,2f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> SUNBURST_SHOVEL = ITEMS.register("sunburst_shovel",
            () -> new ShovelItem(ModTiers.SUNBURST,1,1f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> SUNBURST_HOE = ITEMS.register("sunburst_hoe",
            () -> new HoeItem(ModTiers.SUNBURST,1,1f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_sword = ITEMS.register("equium_sword",
            () -> new SwordItem(ModTiers.SUNBURST,4,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_pickaxe = ITEMS.register("equium_pickaxe",
            () -> new PickaxeItem(ModTiers.SUNBURST,2,1f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_axe = ITEMS.register("equium_axe",
            () -> new AxeItem(ModTiers.SUNBURST,3,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_shovel = ITEMS.register("equium_shovel",
            () -> new ShovelItem(ModTiers.SUNBURST,1,1f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> equium_hoe = ITEMS.register("equium_hoe",
            () -> new HoeItem(ModTiers.SUNBURST,1,1f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_sword = ITEMS.register("coralarite_sword",
            () -> new SwordItem(ModTiers.SUNBURST,2,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_pickaxe = ITEMS.register("coralarite_pickaxe",
            () -> new PickaxeItem(ModTiers.SUNBURST,2,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_axe = ITEMS.register("coralarite_axe",
            () -> new AxeItem(ModTiers.SUNBURST,2,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_shovel = ITEMS.register("coralarite_shovel",
            () -> new ShovelItem(ModTiers.SUNBURST,2,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> coralarite_hoe = ITEMS.register("coralarite_hoe",
            () -> new HoeItem(ModTiers.SUNBURST,2,3f,
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
