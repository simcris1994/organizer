package com.recipes;

import java.io.InputStream;

public class FileLoader {
    public InputStream getInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("recipes.json");
    }
}
