package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.tack.HalterItem;
import com.coqire.bageksequineyaddon.BageksEquineyAddOn;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BageksOriginalTack {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // FLUFFY HALTERS
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

}
