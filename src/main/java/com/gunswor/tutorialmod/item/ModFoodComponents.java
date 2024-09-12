package com.gunswor.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent SWEET_NOODLE_SAUCE = new FoodComponent.Builder().nutrition(20).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.5f).build();

}
