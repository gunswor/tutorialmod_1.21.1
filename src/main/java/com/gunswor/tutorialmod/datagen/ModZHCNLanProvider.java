package com.gunswor.tutorialmod.datagen;

import com.gunswor.tutorialmod.block.ModBlocks;
import com.gunswor.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AQUAMARINE, "蓝晶");
        translationBuilder.add(ModBlocks.AQUAMARINE_BLOCK, "蓝晶块");
        translationBuilder.add(ModBlocks.AQUAMARINE_ORE, "蓝晶矿");
        translationBuilder.add("item.tutorialmod_group", "教学组");
    }
}
