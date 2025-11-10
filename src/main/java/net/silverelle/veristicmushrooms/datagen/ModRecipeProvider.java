package net.silverelle.veristicmushrooms.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.silverelle.veristicmushrooms.Item.ModItems;
import net.silverelle.veristicmushrooms.VeristicMushrooms;
import net.silverelle.veristicmushrooms.block.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MYCOLOGYBOOK.get(), 1)
                .requires(ModItems.RAW_BAYBOLETE.get())
                .requires(Items.BOOK)
                .unlockedBy(getHasName(ModItems.RAW_BAYBOLETE.get()), has(ModItems.RAW_BAYBOLETE.get()))
                .save(pRecipeOutput);

        List<ItemLike> RAW_BROWNBUTTON = List.of(ModItems.RAW_BROWNBUTTON.get());
        oreSmelting(pRecipeOutput, RAW_BROWNBUTTON, RecipeCategory.MISC, ModItems.COOKED_BROWNBUTTON.get(), 0.25f, 200, "mushroom");
        oreBlasting(pRecipeOutput, RAW_BROWNBUTTON, RecipeCategory.MISC, ModItems.COOKED_BROWNBUTTON.get(), 0.25f, 100, "mushroom");
        List<ItemLike> RAW_BAYBOLETE = List.of(ModItems.RAW_BAYBOLETE.get(), ModBlocks.BAYBOLETE_BLOCK.get());
        oreSmelting(pRecipeOutput, RAW_BAYBOLETE, RecipeCategory.MISC, ModItems.COOKED_BAYBOLETE.get(), 0.25f, 200, "mushroom");
        oreBlasting(pRecipeOutput, RAW_BAYBOLETE, RecipeCategory.MISC, ModItems.COOKED_BAYBOLETE.get(), 0.25f, 100, "mushroom");
        List<ItemLike> RAW_CHANTERELLE = List.of(ModItems.RAW_CHANTERELLE.get());
        oreSmelting(pRecipeOutput, RAW_CHANTERELLE, RecipeCategory.MISC, ModItems.COOKED_CHANTERELLE.get(), 0.25f, 200, "mushroom");
        oreBlasting(pRecipeOutput, RAW_CHANTERELLE, RecipeCategory.MISC, ModItems.COOKED_CHANTERELLE.get(), 0.25f, 100, "mushroom");
        List<ItemLike> RAW_DEATHCAP = List.of(ModItems.RAW_DEATHCAP.get());
        oreSmelting(pRecipeOutput, RAW_DEATHCAP, RecipeCategory.MISC, ModItems.COOKED_DEATHCAP.get(), 0.25f, 200, "mushroom");
        oreBlasting(pRecipeOutput, RAW_DEATHCAP, RecipeCategory.MISC, ModItems.COOKED_DEATHCAP.get(), 0.25f, 100, "mushroom");


    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, VeristicMushrooms.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
