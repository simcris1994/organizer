package com.recipes.io;

import com.recipes.model.Links;
import com.recipes.model.Recipes;
import com.recipes.model.Tags;

import java.io.*;

public class FileLoader {
    private static final String PATH = "src/resources/";
    private static final String TAGS = PATH + "tags.json";
    private static final String LINKS = PATH + "links.json";
    private static final String INDEXED = PATH + "indexed.json";

    public static <T> InputStreamReader getReader(Class<T> clazz) throws FileNotFoundException {
        return new InputStreamReader(new FileInputStream(getFile(clazz)));
    }

    public static <T> Writer getWriter(Class<T> clazz) throws IOException {
        return new FileWriter(getFile(clazz));
    }

    private static <T> String getFile(Class<T> clazz) {
        if (Recipes.class == clazz) {
            return INDEXED;
        } else if (Tags.class == clazz) {
            return TAGS;
        } else if (Links.class == clazz) {
            return LINKS;
        } else {
            throw new IllegalArgumentException("invalid class");
        }
    }
}
