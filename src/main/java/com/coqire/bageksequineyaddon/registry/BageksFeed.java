package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.entities.horse.needs.FeedBlock;
import com.alaharranhonor.swem.forge.entities.horse.needs.FeedItem;
import com.alaharranhonor.swem.forge.entities.horse.needs.SpecialFeedItem;
import com.coqire.bageksequineyaddon.BageksEquineyAddOn;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class BageksFeed {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddOn.Mod_ID);


    private static final Map<ResourceLocation, FeedItem> ALL_FEEDS = new HashMap();


   // public static final FeedItem BLUE_DONUT_TREAT;
   // public static final FeedItem PINK_DONUT_TREAT;
   // public static final FeedItem YELLOW_DONUT_TREAT;
    public static final FeedItem CAKE;


    public static FeedItem registerItemFeed(FeedItem feed) {
        ALL_FEEDS.put(feed.id(), feed);
        return feed;
    }

    public static FeedItem fromItem(ItemStack stack) {
        Iterator var1 = ALL_FEEDS.values().iterator();

        FeedItem feed;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            feed = (FeedItem)var1.next();
        } while(!feed.ingredient().test(stack));

        return feed;
    }

    static {
       // WHEAT = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{Items.WHEAT}), FeedItem.Category.GRASS_FEED).points(0).max(1).build("wheat"));


        CAKE = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{Items.CAKE}), FeedItem.Category.TREATS).points(0).max(1));

//        BLUE_DONUT_TREAT = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{(ItemLike) ModItems.BLUE_DONUT_TREAT.get()}), FeedItem.Category.TREATS).points(3).max(2));
//       PINK_DONUT_TREAT = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{(ItemLike) ModItems.PINK_DONUT_TREAT.get()}), FeedItem.Category.TREATS).points(3).max(2));
//       YELLOW_DONUT_TREAT = registerItemFeed(FeedItem.builder(Ingredient.of(new ItemLike[]{(ItemLike) ModItems.YELLOW_DONUT_TREAT.get()}), FeedItem.Category.TREATS).points(3).max(2));

    }



    private static FeedItem registerItemFeed(FeedItem.Builder builder) {
        return null;
    }

    public static void init(IEventBus eventBus) {
    }
}
