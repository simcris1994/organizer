package com.recipes;

import java.util.List;

public class Recipes {
    private List<Item> recipes;

    public Recipes(List<Item> recipes) {
        this.recipes = recipes;
    }

    public List<Item> getRecipes() {
        return recipes;
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
}
