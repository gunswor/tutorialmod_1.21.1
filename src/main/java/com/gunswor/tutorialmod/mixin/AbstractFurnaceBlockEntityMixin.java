package com.gunswor.tutorialmod.mixin;

import com.gunswor.tutorialmod.item.ModItems;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public class AbstractFurnaceBlockEntityMixin {
    @Shadow private static volatile @Nullable Map<Item, Integer> fuelTimes;

    @Inject(method = "createFuelTimeMap", at = @At("TAIL"))
    private static void addFuelTimes(CallbackInfoReturnable<Map<Item, Integer>> cir) {
        fuelTimes.put(ModItems.ANTHRACITE, 2000);
    }
}
