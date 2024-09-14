package com.gunswor.tutorialmod.datagen;

import com.gunswor.tutorialmod.block.ModBlocks;
import com.gunswor.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AQUAMARINE, "Aquamarine");
        translationBuilder.add(ModItems.SWEET_NOODLE_SAUCE, "Sweet noodle sauce");
        translationBuilder.add(ModItems.ANTHRACITE, "Anthracite");
        translationBuilder.add(ModBlocks.AQUAMARINE_BLOCK, "Aquamarine Block");
        translationBuilder.add(ModBlocks.AQUAMARINE_ORE, "Aquamarine Ore");
        translationBuilder.add("item.tutorialmod_group", "Tutorial Group");
    }
}
