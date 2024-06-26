package com.coqire.bageksequineyaddon;

import com.coqire.bageksequineyaddon.block.ModBlocks;
import com.coqire.bageksequineyaddon.item.ModItems;
import com.coqire.bageksequineyaddon.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BageksEquineyAddOn.Mod_ID)
public class BageksEquineyAddOn {
    public static final String Mod_ID = "bageksequineyaddon";

    private static final Logger LOGGER = LogUtils.getLogger();

    public BageksEquineyAddOn() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        BageksTack.init(eventBus);
        BageksPastelTack.init(eventBus);
        BageksMainTack.init(eventBus);
        BageksOneOffTack.init(eventBus);
        BageksOriginalTack.init(eventBus);
        BageksFeed.init(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}