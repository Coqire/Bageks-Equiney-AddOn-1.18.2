package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;



public class BageksPastelTack {

    public static DeferredRegister<Item> ITEMS;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK_PASTEL;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK_PASTEL;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK_PASTEL;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK_PASTEL;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLAR_BAGEK_PASTEL;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK_PASTEL;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishLegWraps>> TRAVEL_BOOTS_BAGEK_PASTEL;

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.Keys.ITEMS, "bageksequineyaddon");

        HALTER_BAGEK_PASTEL = new ArrayList();
        ENGLISH_LEG_WRAPS_BAGEK_PASTEL = new ArrayList ();
        PASTURE_BLANKET_BAGEK_PASTEL = new ArrayList ();
        QUARTERSHEET_BAGEK_PASTEL = new ArrayList();
        ENGLISH_BLANKET_BAGEK_PASTEL = new ArrayList();
        HALTER_FLUFFY_BAGEK_PASTEL = new ArrayList();
        FLYMASK_BAGEK_PASTEL = new ArrayList();
        WESTERN_BREAST_COLLAR_BAGEK_PASTEL = new ArrayList();
        WESTERN_BLANKET_BAGEK_PASTEL = new ArrayList();
        WESTERN_LEG_WRAPS_BAGEK_PASTEL = new ArrayList();
        TRAVEL_BOOTS_BAGEK_PASTEL = new ArrayList();

        int var1 = 8;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            int counter = rContext.var2;
            HALTER_BAGEK_PASTEL.add(ITEMS.register("halter_bagek_p" + counter, () ->
                    new HalterItem("halter_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_LEG_WRAPS_BAGEK_PASTEL.add(ITEMS.register("english_leg_wraps_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            PASTURE_BLANKET_BAGEK_PASTEL.add(ITEMS.register("pasture_blanket_bagek_p" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            QUARTERSHEET_BAGEK_PASTEL.add(ITEMS.register("quartersheet_bagek_p" + counter, () ->
                    new EnglishBreastCollar("quartersheet_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_BLANKET_BAGEK_PASTEL.add(ITEMS.register("english_blanket_bagek_p" + counter, () ->
                    new EnglishBlanketItem("english_blanket_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            HALTER_FLUFFY_BAGEK_PASTEL.add(ITEMS.register("halter_fluffy_bagek_p" + counter, () ->
                    new HalterItem("halter_fluffy_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            FLYMASK_BAGEK_PASTEL.add(ITEMS.register("flymask_bagek_p" + counter, () ->
                    new HalterItem("flymask_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_LEG_WRAPS_BAGEK_PASTEL.add(ITEMS.register("western_leg_wraps_bagek_p" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_BLANKET_BAGEK_PASTEL.add(ITEMS.register("western_blanket_bagek_p" + counter, () ->
                    new WesternBlanketItem("western_blanket_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_BREAST_COLLAR_BAGEK_PASTEL.add(ITEMS.register("western_breast_collar_bagek_p" + counter, () ->
                    new WesternBreastCollarItem("western_breast_collar_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            TRAVEL_BOOTS_BAGEK_PASTEL.add(ITEMS.register("english_leg_wraps_travel_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_travel_bagek_p" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ++rContext.var2;

        }

    }
}
