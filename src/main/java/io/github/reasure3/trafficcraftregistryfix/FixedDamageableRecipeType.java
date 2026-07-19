package io.github.reasure3.trafficcraftregistryfix;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public final class FixedDamageableRecipeType implements RecipeType<Recipe<?>> {
    public FixedDamageableRecipeType() {
    }

    @Override
    public String toString() {
        return "trafficcraft_damageable_recipe_type";
    }
}
