package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.HalterItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.alaharranhonor.swem.forge.items.tack.WesternBreastCollarItem;
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
    public static final RegistryObject<HalterItem> halter_bagek_staff_1 = ITEMS.register("halter_bagek_staff_1",
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

    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_1 = ITEMS.register("quartersheet_breastcollar_bagek_1",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_1",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_8 = ITEMS.register("quartersheet_breastcollar_bagek_8",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_8",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_9 = ITEMS.register("quartersheet_breastcollar_bagek_9",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_9",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_14 = ITEMS.register("quartersheet_breastcollar_bagek_14",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_14",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_P3 = ITEMS.register("quartersheet_breastcollar_bagek_p3",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_p3",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));
    public static final RegistryObject<WesternBreastCollarItem> QUARTERSHEET_BREASTCOLLAR_BAGEK_P5 = ITEMS.register("quartersheet_breastcollar_bagek_p5",
            () -> new WesternBreastCollarItem("quartersheet_breastcollar_bagek_p5",
                    new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_ZEBRA_BAGEK = ITEMS.register("pasture_blanket_zebra_bagek",
            () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "pasture_blanket_zebra_bagek", new Item.Properties().tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB)));

}
