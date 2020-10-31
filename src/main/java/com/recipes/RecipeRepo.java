package com.recipes;

import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RecipeRepo {

    private static final String FILE = "src/resources/indexed.json";

    private FileLoader fileLoader;

    public RecipeRepo() {
        this.fileLoader = new FileLoader();
    }

    public Recipes read() {
        Reader reader = new InputStreamReader(fileLoader.getRecipes());
        return new Gson().fromJson(reader, Recipes.class);
    }

    public void write(Recipes recipes) throws IOException {
        try (Writer writer = new FileWriter(FILE)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(recipes, writer);
        }
    }

}
