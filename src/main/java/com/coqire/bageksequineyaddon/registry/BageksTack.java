package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.entities.horse.needs.FeedItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
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
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK_PASTEL;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_BAGEK;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAP_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;
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
        HALTER_BAGEK_PASTEL = new ArrayList();
        HALTER_FLUFFY_BAGEK = new ArrayList<>();
        PASTURE_BLANKET_BAGEK = new ArrayList();
        ENGLISH_BLANKET_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
        ENGLISH_SADDLE_BAGEK = new ArrayList();
        ENGLISH_BREAST_COLLAR_BAGEK = new ArrayList();
        ENGLISH_BRIDLE_BAGEK = new ArrayList();
        ENGLISH_GIRTH_STRAP_BAGEK = new ArrayList();
        FLYMASK_BAGEK = new ArrayList<>();

        int var1 = 15;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            int counter = rContext.var2;
            HALTER_BAGEK.add(ITEMS.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(16))
            ));

            HALTER_BAGEK_PASTEL.add(ITEMS.register("halter_bagek_p" + counter, () ->
                    new HalterItem("halter_bagek_p" + counter, (new Item.Properties())
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