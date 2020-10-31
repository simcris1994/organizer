package com.recipes.repo;

import com.recipes.io.FileLoader;
import com.recipes.serialization.JsonInterface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class Repo {

    public static <T> T read(Class<T> clazz) throws FileNotFoundException {
        Reader reader = FileLoader.getReader(clazz);
        return JsonInterface.read(clazz, reader);
    }

    public static <T> void write(Class<T> clazz, Object object) throws IOException {
        JsonInterface.write(object, FileLoader.getWriter(clazz));
    }

}
