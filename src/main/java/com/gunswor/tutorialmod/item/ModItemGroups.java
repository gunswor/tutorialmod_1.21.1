package com.gunswor.tutorialmod.item;

import com.gunswor.tutorialmod.TutorialMod;
import com.gunswor.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "tutorial_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.tutorial_group"))
                .icon(()-> new ItemStack(ModItems.AQUAMARINE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.AQUAMARINE);
                    entries.add(ModItems.SWEET_NOODLE_SAUCE);
                    entries.add(ModItems.ANTHRACITE);
                    entries.add(ModBlocks.AQUAMARINE_BLOCK);
                    entries.add(ModBlocks.AQUAMARINE_ORE);
                }).build());
    public static void registerModItemGroup(){
        TutorialMod.LOGGER.info("Registering Item Group");
    }
}
