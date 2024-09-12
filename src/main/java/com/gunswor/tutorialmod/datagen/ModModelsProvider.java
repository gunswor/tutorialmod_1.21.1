package com.gunswor.tutorialmod.datagen;

import com.gunswor.tutorialmod.block.ModBlocks;
import com.gunswor.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_NOODLE_SAUCE, Models.GENERATED);
    }
}
