package com.recipes;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReceipeRepo {

    public Recipes read() {
        Gson gson = new Gson();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("recipes.json");
        Reader reader = new InputStreamReader(in);
        return gson.fromJson(reader, Recipes.class);
    }

}
