package com.recipes;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            Recipes recipes = ReceipeRepo.read();
            System.out.println(recipes);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
}
