package com.recipes;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReceipeRepo {

    public static Recipes read() throws FileNotFoundException {
        Gson gson = new Gson();
        String filename = "./resources/recipes.json";
        JsonReader reader = new JsonReader(new FileReader(filename));
        return gson.fromJson(reader, Recipes.class);
    }

}
