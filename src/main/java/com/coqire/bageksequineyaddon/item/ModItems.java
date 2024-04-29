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
