package com.coqire.bageksequineyaddon.world.feature;

import com.coqire.bageksequineyaddon.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SUNBURST_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SUNBURST_ORE.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SUNBURST_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SUNBURST_ORE = FeatureUtils.register("sunburst_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SUNBURST_ORES, 5));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_EQUIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EQUIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_EQUIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EQUIUM_ORE = FeatureUtils.register("equium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_EQUIUM_ORES, 5));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CORLARITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CORALARITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CORALARITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CORALARITE_ORE = FeatureUtils.register("corlarite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CORLARITE_ORES, 5));
}
