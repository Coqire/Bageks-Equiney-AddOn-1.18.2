package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.HalterItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.coqire.bageksequineyaddon.BageksEquineyAddOn;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BageksOneOffTack {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

// STAFF ITEMS
    public static final RegistryObject<HalterItem> halter_bagek_staff_2 = ITEMS.register("halter_bagek_staff_2",
            () -> new HalterItem("halter_bagek_staff_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_fluffy_bagek_staff_2 = ITEMS.register("halter_fluffy_bagek_staff_2",
            () -> new HalterItem("halter_fluffy_bagek_staff_2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_bagek_staff_4 = ITEMS.register("halter_bagek_staff_4",
            () -> new HalterItem("halter_bagek_staff_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> HALTER_fluffy_bagek_staff_4 = ITEMS.register("halter_fluffy_bagek_staff_4",
            () -> new HalterItem("halter_fluffy_bagek_staff_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_bagek_emma = ITEMS.register("halter_bagek_emma",
            () -> new HalterItem("halter_bagek_staff_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));
    public static final RegistryObject<HalterItem> halter_fluffy_bagek_staff_1 = ITEMS.register("halter_fluffy_bagek_staff_1",
            () -> new HalterItem("halter_fluffy_bagek_staff_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(4)));

    // FLYSHEETS
    public static final RegistryObject<Item> pasture_blanket_flysheet_bagek_1 = ITEMS.register("pasture_blanket_flysheet_bagek_1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_bagek_1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_bagek_4 = ITEMS.register("pasture_blanket_flysheet_bagek_4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_bagek_4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_bagek_8 = ITEMS.register("pasture_blanket_flysheet_bagek_8",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_bagek_8", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_bagek_9 = ITEMS.register("pasture_blanket_flysheet_bagek_9",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_bagek_9", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_flysheet_bagek_10 = ITEMS.register("pasture_blanket_flysheet_bagek_10",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_flysheet_bagek_10", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    // PATTERNED PLAID BLANKETS
    public static final RegistryObject<Item> pasture_blanket_patterned1 = ITEMS.register("pasture_blanket_patterned1",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned1", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned2 = ITEMS.register("pasture_blanket_patterned2",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned2", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned3 = ITEMS.register("pasture_blanket_patterned3",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned3", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned4 = ITEMS.register("pasture_blanket_patterned4",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned4", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned5 = ITEMS.register("pasture_blanket_patterned5",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned5", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<Item> pasture_blanket_patterned6 = ITEMS.register("pasture_blanket_patterned6",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_patterned6", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

}
