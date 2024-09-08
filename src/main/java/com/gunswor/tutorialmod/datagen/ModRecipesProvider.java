package com.gunswor.tutorialmod.datagen;

import com.gunswor.tutorialmod.block.ModBlocks;
import com.gunswor.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> AQUAMARINE = List.of(ModBlocks.AQUAMARINE_ORE);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.AQUAMARINE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK);
        offerSmelting(exporter, AQUAMARINE, RecipeCategory.MISC, ModItems.AQUAMARINE,
                0.7f, 200, "aquamarine");
        offerBlasting(exporter, AQUAMARINE, RecipeCategory.MISC, ModItems.AQUAMARINE,
                0.7f, 100, "aquamarine");
    }
}
