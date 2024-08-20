package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.entities.horse.needs.FeedItem;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import com.coqire.bageksequineyaddon.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;

import static com.alaharranhonor.swem.forge.entities.horse.needs.Feeds.registerItemFeed;

public class BageksTack {
    public static final DeferredRegister<Item> ITEMS;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_BAGEK;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAP_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> TRAVEL_BOOTS_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;


    public static final Ingredient FOOD_ITEMS;
    public Set<ResourceLocation> eatenSpecialFeeds = new HashSet();


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        HALTER_BAGEK = new ArrayList();
        HALTER_FLUFFY_BAGEK = new ArrayList<>();
        PASTURE_BLANKET_BAGEK = new ArrayList();
        ENGLISH_BLANKET_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
        ENGLISH_SADDLE_BAGEK = new ArrayList();
        ENGLISH_BREAST_COLLAR_BAGEK = new ArrayList();
        ENGLISH_BRIDLE_BAGEK = new ArrayList();
        ENGLISH_GIRTH_STRAP_BAGEK = new ArrayList();
        FLYMASK_BAGEK = new ArrayList<>();
        QUARTERSHEET_BAGEK = new ArrayList<>();
        WESTERN_BLANKET_BAGEK = new ArrayList();
        WESTERN_BREAST_COLLAR_BAGEK = new ArrayList();
        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
        TRAVEL_BOOTS_BAGEK = new ArrayList();
        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        ENGLISH_SADDLE_XC_BAGEK = new ArrayList();
        ENGLISH_BRIDLE_XC_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();

        int var1 = 20;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            int counter = rContext.var2;
            HALTER_BAGEK.add(ITEMS.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            FLYMASK_BAGEK.add(ITEMS.register("flymask_bagek_" + counter, () ->
                    new HalterItem("flymask_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_BLANKET_BAGEK.add(ITEMS.register("english_blanket_bagek_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_LEG_WRAPS_BAGEK.add(ITEMS.register("english_leg_wraps_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            PASTURE_BLANKET_BAGEK.add(ITEMS.register("pasture_blanket_bagek_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            QUARTERSHEET_BAGEK.add(ITEMS.register("quartersheet_bagek_" + counter, () ->
                    new EnglishBreastCollar("quartersheet_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            HALTER_FLUFFY_BAGEK.add(ITEMS.register("halter_fluffy_bagek_" + counter, () ->
                    new HalterItem("halter_fluffy_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_LEG_WRAPS_BAGEK.add(ITEMS.register("western_leg_wraps_bagek_" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_BLANKET_BAGEK.add(ITEMS.register("western_blanket_bagek_" + counter, () ->
                    new WesternBlanketItem("western_blanket_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            WESTERN_BREAST_COLLAR_BAGEK.add(ITEMS.register("western_breast_collar_bagek_" + counter, () ->
                    new WesternBreastCollarItem("western_breast_collar_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            TRAVEL_BOOTS_BAGEK.add(ITEMS.register("english_leg_wraps_travel_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_travel_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(ITEMS.register("english_leg_wraps_english_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_english_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            ENGLISH_BLANKET_ENGLISH_BAGEK.add(ITEMS.register("english_blanket_english_bagek_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_english_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            PASTURE_BLANKET_BAGEK_FLYSHEET.add(ITEMS.register("pasture_blanket_bagek_flysheet_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_flysheet_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_BRIDLE_XC_BAGEK.add(ITEMS.register("english_bridle_xc_bagek_" + counter, () ->
                    new EnglishBridleItem("english_bridle_xc_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_SADDLE_XC_BAGEK.add(ITEMS.register("english_saddle_xc_bagek_" + counter, () ->
                    new EnglishSaddleItem("english_saddle_xc_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(ITEMS.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(ITEMS.register("english_leg_wraps_tendon_bagek_f" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_f" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));


            ++rContext.var2;

        }

    }

    private static final Map<ResourceLocation, FeedItem> ALL_FEEDS = new HashMap();

   public static final FeedItem CAKE;

    public void addSpecialFeedToList(ResourceLocation id) {
        this.eatenSpecialFeeds.add(id);
    }

    public static FeedItem registerItemFeed(FeedItem feed) {
        ALL_FEEDS.put(feed.id(), feed);
        return feed;
    }

    static{

        FOOD_ITEMS = Ingredient.of(new ItemLike[]{Items.CAKE});

        CAKE = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{Items.CAKE}), FeedItem.Category.TREATS).points(3).max(7).onEaten((horse, limited) -> {
            if (!limited) {
                horse.progressionManager.getAffinityLeveling().addXP(1.0F);
            }
        }));
    }

    private static FeedItem registerItemFeed(FeedItem.Builder builder) {
        return null;
    }
}