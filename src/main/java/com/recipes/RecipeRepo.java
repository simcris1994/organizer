package com.recipes;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;

public class RecipeRepo {

    private FileLoader fileLoader;

    public RecipeRepo() {
        this.fileLoader = new FileLoader();
    }

    public Recipes read() {
        Reader reader = new InputStreamReader(fileLoader.getInputStream());
        return new Gson().fromJson(reader, Recipes.class);
    }

}
