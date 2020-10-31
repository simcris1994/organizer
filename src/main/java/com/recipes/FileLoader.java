package com.recipes;

import java.io.InputStream;

public class FileLoader {
    private static final String TAGS = "tags.json";
    private static final String LINKS = "links.json";
    private static final String RECIPES = "recipes.json";

    public InputStream getTags() {
        return getInputStream(TAGS);
    }

    public InputStream getLinks() {
        return getInputStream(LINKS);
    }

    public InputStream getRecipes() {
        return getInputStream(RECIPES);
    }

    private InputStream getInputStream(String file) {
        return this.getClass().getClassLoader().getResourceAsStream(file);
    }
}
