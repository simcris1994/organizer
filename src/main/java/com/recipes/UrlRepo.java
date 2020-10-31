package com.recipes;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.io.Reader;

public class UrlRepo {

    private FileLoader fileLoader;

    public UrlRepo() {
        this.fileLoader = new FileLoader();
    }

    public Values read() {
        Reader reader = new InputStreamReader(fileLoader.getLinks());
        return new Gson().fromJson(reader, Values.class);
    }

}
