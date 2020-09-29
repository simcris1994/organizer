package com.recipes;

public class Main {

    public static void main(String[] args) {
        Recipes recipes = new ReceipeRepo().read();
        System.out.println(recipes);
    }
}
