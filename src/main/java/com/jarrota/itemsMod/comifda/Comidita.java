package com.jarrota.itemsMod.comifda;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class Comidita {
    public  static final FoodComponent TOMATE = new FoodComponent.Builder().hunger(1).saturationModifier(12)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,200), 0.05f).build();
}
