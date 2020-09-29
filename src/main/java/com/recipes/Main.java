package com.recipes;

public class Main {

    public static void main(String[] args) {
        Recipes recipes = new RecipeRepo().read();
        System.out.println(recipes);
    }
}
