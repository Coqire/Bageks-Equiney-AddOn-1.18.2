package com.coqire.bageksequineyaddon.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> SUNBURST_ORE_PLACED = PlacementUtils.register("sunburst_ore_placed",
            ModConfiguredFeatures.SUNBURST_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> EQUIUM_ORE_PLACED = PlacementUtils.register("equium_ore_placed",
            ModConfiguredFeatures.EQUIUM_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> CORALARITE_ORE_PLACED = PlacementUtils.register("coralarite_ore_placed",
            ModConfiguredFeatures.CORALARITE_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100))));
}
