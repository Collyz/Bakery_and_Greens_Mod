package net.collywobbles.greensmod.item.custom;

import net.minecraft.world.food.FoodProperties;
public class BaguetteItem{
    public static final FoodProperties BAGUETTE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.6f)
            .alwaysEat()
            .build();
}
