package com.coqire.bageksequineyaddon.world.gen;

import com.coqire.bageksequineyaddon.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.SUNBURST_ORE_PLACED);
        base.add(ModPlacedFeatures.EQUIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.CORALARITE_ORE_PLACED);
    }
}

