package com.gunswor.tutorialmod;

import com.gunswor.tutorialmod.block.ModBlocks;
import com.gunswor.tutorialmod.item.ModItemGroups;
import com.gunswor.tutorialmod.item.ModItems;
import com.gunswor.tutorialmod.mixin.GrassColorsMixin;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// 调用各类的初始化方法
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroup();
		ModBlocks.registerModBlocks();

//		int[] colorMap = GrassColorsMixin.getColorMap();
//		LOGGER.info("Grass color map length: {}", colorMap.length);
//		GrassColorsMixin.setColorMap(ColorMap);
//		LOGGER.info("Grass color map length after setting: {}", GrassColorsMixin.getColorMap().length);


//		FuelRegistry.INSTANCE.add(ModItems.ANTHRACITE, 2000);

		LOGGER.info("Hello Fabric world!");
	}
}