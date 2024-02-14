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
    public static final RegistryObject<HalterItem> HALTER_1 = ITEMS.register("halter_1",
            () -> new HalterItem("halter_1", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_2 = ITEMS.register("halter_2",
            () -> new HalterItem("halter_2", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_3 = ITEMS.register("halter_3",
            () -> new HalterItem("halter_3", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_4 = ITEMS.register("halter_4",
            () -> new HalterItem("halter_4", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_5 = ITEMS.register("halter_5",
            () -> new HalterItem("halter_5", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_6 = ITEMS.register("halter_6",
            () -> new HalterItem("halter_6", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_7 = ITEMS.register("halter_7",
            () -> new HalterItem("halter_7", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_red = ITEMS.register("halter_fluffy_red",
            () -> new HalterItem("halter_fluffy_red", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_orange = ITEMS.register("halter_fluffy_orange",
            () -> new HalterItem("halter_fluffy_orange", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_yellow = ITEMS.register("halter_fluffy_yellow",
            () -> new HalterItem("halter_fluffy_yellow", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_lime = ITEMS.register("halter_fluffy_lime",
            () -> new HalterItem("halter_fluffy_lime", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_green = ITEMS.register("halter_fluffy_green",
            () -> new HalterItem("halter_fluffy_green", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_cyan = ITEMS.register("halter_fluffy_cyan",
            () -> new HalterItem("halter_fluffy_cyan", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_light_blue = ITEMS.register("halter_fluffy_light_blue",
            () -> new HalterItem("halter_fluffy_light_blue", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_blue = ITEMS.register("halter_fluffy_blue",
            () -> new HalterItem("halter_fluffy_blue", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_purple = ITEMS.register("halter_fluffy_purple",
            () -> new HalterItem("halter_fluffy_purple", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_magetna = ITEMS.register("halter_fluffy_magenta",
            () -> new HalterItem("halter_fluffy_magenta", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_pink = ITEMS.register("halter_fluffy_pink",
            () -> new HalterItem("halter_fluffy_pink", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_white = ITEMS.register("halter_fluffy_white",
            () -> new HalterItem("halter_fluffy_white", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_brown = ITEMS.register("halter_fluffy_brown",
            () -> new HalterItem("halter_fluffy_brown", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_light_gray = ITEMS.register("halter_fluffy_light_gray",
            () -> new HalterItem("halter_fluffy_light_gray", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_gray = ITEMS.register("halter_fluffy_gray",
            () -> new HalterItem("halter_fluffy_gray", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_black = ITEMS.register("halter_fluffy_black",
            () -> new HalterItem("halter_fluffy_black", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_anna = ITEMS.register("halter_anna",
            () -> new HalterItem("halter_anna", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_ANNA = ITEMS.register("halter_fluffy_anna",
            () -> new HalterItem("halter_fluffy_anna", new Item.Properties().tab(ModCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
