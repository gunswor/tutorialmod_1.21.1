package com.gunswor.tutorialmod.item;

import com.gunswor.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new Item.Settings()));
    public static final Item SWEET_NOODLE_SAUCE = registerItem("sweet_noodle_sauce", new Item(new Item.Settings().food(ModFoodComponents.SWEET_NOODLE_SAUCE)));
    public static final Item ANTHRACITE = registerItem("anthracite", new Item(new Item.Settings()));
    private static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), item);
    }
    public static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(AQUAMARINE);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
        TutorialMod.LOGGER.info("Registring Items");
    }
}
