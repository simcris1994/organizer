package com.recipes.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipes {
    private List<Item> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public Recipes(List<Item> recipes) {
        this.recipes = recipes;
    }

    public List<Item> getRecipes() {
        return recipes;
    }

    public void addRecipe(Item recipe) {
        this.recipes.add(recipe);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("[\n");
        for (Item recipe : recipes) {
            text.append(recipe.toString());
            text.append("\n");
        }
        text.append("]");
        return text.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Recipes) {
            Recipes otherRecipes = (Recipes) obj;
            return Arrays.equals(this.recipes.toArray(), otherRecipes.recipes.toArray());
        }
        return false;
    }
}
