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

    public static final RegistryObject<HalterItem> halter_fluffy_bagek_red = ITEMS.register("halter_fluffy_bagek_red",
            () -> new HalterItem("halter_fluffy_bagek_red", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_orange = ITEMS.register("halter_fluffy_bagek_orange",
            () -> new HalterItem("halter_fluffy_bagek_orange", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_yellow = ITEMS.register("halter_fluffy_bagek_yellow",
            () -> new HalterItem("halter_fluffy_bagek_yellow", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_lime = ITEMS.register("halter_fluffy_bagek_lime",
            () -> new HalterItem("halter_fluffy_bagek_lime", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_green = ITEMS.register("halter_fluffy_bagek_green",
            () -> new HalterItem("halter_fluffy_bagek_green", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_cyan = ITEMS.register("halter_fluffy_bagek_cyan",
            () -> new HalterItem("halter_fluffy_bagek_cyan", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_light_blue = ITEMS.register("halter_fluffy_bagek_light_blue",
            () -> new HalterItem("halter_fluffy_bagek_light_blue", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_blue = ITEMS.register("halter_fluffy_bagek_blue",
            () -> new HalterItem("halter_fluffy_bagek_blue", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_purple = ITEMS.register("halter_fluffy_bagek_purple",
            () -> new HalterItem("halter_fluffy_bagek_purple", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_magetna = ITEMS.register("halter_fluffy_bagek_magenta",
            () -> new HalterItem("halter_fluffy_bagek_magenta", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_pink = ITEMS.register("halter_fluffy_bagek_pink",
            () -> new HalterItem("halter_fluffy_bagek_pink", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_white = ITEMS.register("halter_fluffy_bagek_white",
            () -> new HalterItem("halter_fluffy_bagek_white", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_brown = ITEMS.register("halter_fluffy_bagek_brown",
            () -> new HalterItem("halter_fluffy_bagek_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_light_gray = ITEMS.register("halter_fluffy_bagek_light_gray",
            () -> new HalterItem("halter_fluffy_bagek_light_gray", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_gray = ITEMS.register("halter_fluffy_bagek_gray",
            () -> new HalterItem("halter_fluffy_bagek_gray", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_black = ITEMS.register("halter_fluffy_bagek_black",
            () -> new HalterItem("halter_fluffy_bagek_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_bagek_anna = ITEMS.register("halter_bagek_anna",
            () -> new HalterItem("halter_bagek_anna", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_fluffy_bagek_ANNA = ITEMS.register("halter_fluffy_bagek_anna",
            () -> new HalterItem("halter_fluffy_bagek_anna", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_bagek_savv = ITEMS.register("halter_bagek_savv",
            () -> new HalterItem("halter_bagek_savv", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_fluffy_bagek_SAVV = ITEMS.register("halter_fluffy_bagek_savv",
            () -> new HalterItem("halter_fluffy_bagek_savv", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_bagek_emma = ITEMS.register("halter_bagek_emma",
            () -> new HalterItem("halter_bagek_emma", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_emma = ITEMS.register("halter_fluffy_bagek_emma",
            () -> new HalterItem("halter_fluffy_bagek_emma", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // BreastCollars
     public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_black = ITEMS.register("english_breast_collar_xc_black",
             () -> new BreastCollarItem("english_breast_collar_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_fluffy_black = ITEMS.register("english_breast_collar_xc_fluffy_black",
            () -> new BreastCollarItem("english_breast_collar_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_freemotion_black = ITEMS.register("english_breast_collar_freemotion_black",
            () -> new BreastCollarItem("english_breast_collar_freemotion_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_brown = ITEMS.register("english_breast_collar_xc_brown",
            () -> new BreastCollarItem("english_breast_collar_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_xc_fluffy_brown = ITEMS.register("english_breast_collar_xc_fluffy_brown",
            () -> new BreastCollarItem("english_breast_collar_xc_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<BreastCollarItem> english_breast_collar_freemotion_brown = ITEMS.register("english_breast_collar_freemotion_brown",
            () -> new BreastCollarItem("english_breast_collar_freemotion_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Girth Straps
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_black = ITEMS.register("english_girth_strap_xc_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_fluffy_black = ITEMS.register("english_girth_strap_xc_fluffy_black",
            () -> new EnglishGirthStrap("english_girth_strap_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_brown = ITEMS.register("english_girth_strap_xc_brown",
            () -> new EnglishGirthStrap("english_girth_strap_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishGirthStrap> english_girth_strap_xc_fluffy_brown = ITEMS.register("english_girth_strap_xc_fluffy_brown",
            () -> new EnglishGirthStrap("english_girth_strap_xc_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Saddles
    public static final RegistryObject<EnglishSaddleItem> english_saddle_xc_black = ITEMS.register("english_saddle_xc_black",
            () -> new EnglishSaddleItem("english_saddle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishSaddleItem> english_saddle_xc_brown = ITEMS.register("english_saddle_xc_brown",
            () -> new EnglishSaddleItem("english_saddle_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // Bridles
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_black = ITEMS.register("english_bridle_xc_black",
            () -> new EnglishBridleItem("english_bridle_xc_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_fluffy_black = ITEMS.register("english_bridle_xc_fluffy_black",
            () -> new EnglishBridleItem("english_bridle_xc_fluffy_black", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_brown = ITEMS.register("english_bridle_xc_brown",
            () -> new EnglishBridleItem("english_bridle_xc_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishBridleItem> english_bridle_xc_fluffy_brown = ITEMS.register("english_bridle_xc_fluffy_brown",
            () -> new EnglishBridleItem("english_bridle_xc_fluffy_brown", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


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
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_p1 = ITEMS.register("english_leg_wraps_p1",
            () -> new EnglishLegWraps("english_leg_wraps_p1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_p2 = ITEMS.register("english_leg_wraps_p2",
            () -> new EnglishLegWraps("english_leg_wraps_p2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_p3 = ITEMS.register("english_leg_wraps_p3",
            () -> new EnglishLegWraps("english_leg_wraps_p3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_p4 = ITEMS.register("english_leg_wraps_p4",
            () -> new EnglishLegWraps("english_leg_wraps_p4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<EnglishLegWraps> english_leg_wraps_p5 = ITEMS.register("english_leg_wraps_p5",
            () -> new EnglishLegWraps("english_leg_wraps_p5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

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
    public static final RegistryObject<Item> pasture_blanket_flysheet_b1 = ITEMS.register("pasture_blanket_flysheet_b1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_b1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_b4 = ITEMS.register("pasture_blanket_flysheet_b4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_b4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_b8 = ITEMS.register("pasture_blanket_flysheet_b8",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_b8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_b9 = ITEMS.register("pasture_blanket_flysheet_b9",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_b9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_b10 = ITEMS.register("pasture_blanket_flysheet_b10",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_b10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned1 = ITEMS.register("pasture_blanket_patterned1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned2 = ITEMS.register("pasture_blanket_patterned2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned3 = ITEMS.register("pasture_blanket_patterned3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

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
