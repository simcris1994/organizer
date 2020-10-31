package com.recipes;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.io.Reader;

public class TagRepo {

    private FileLoader fileLoader;

    public TagRepo() {
        this.fileLoader = new FileLoader();
    }

    public Values read() {
        Reader reader = new InputStreamReader(fileLoader.getTags());
        return new Gson().fromJson(reader, Values.class);
    }

}
