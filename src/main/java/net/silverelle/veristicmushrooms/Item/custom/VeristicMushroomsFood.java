package net.silverelle.veristicmushrooms.Item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VeristicMushroomsFood {

    // RAW MUSHROOMS
    public static final FoodProperties RAW_BROWNBUTTON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties RAW_BAYBOLETE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.3F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)
            .effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.5F)
            .build();
    public static final FoodProperties RAW_DEATHCAP = new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0F)
            .effect(new MobEffectInstance(MobEffects.HARM, -1, 100), 1.0F).build();



    // COOKED MUSHROOMS
    public static final FoodProperties COOKED_BROWNBUTTON = new FoodProperties.Builder().nutrition(5).saturationModifier(0.4F).build();
    public static final FoodProperties COOKED_BAYBOLETE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.4F).build();
    public static final FoodProperties COOKED_DEATHCAP = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0F)
            .build();
}
