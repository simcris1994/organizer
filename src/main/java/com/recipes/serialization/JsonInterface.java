package com.recipes.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JsonInterface {

    public static void write(Object object, Writer writer) throws IOException {
        try {
            Gson gson = new GsonBuilder().create();
            gson.toJson(object, writer);
        } finally {
            writer.close();
        }
    }

    public static <T> T read(Class<T> clazz, Reader reader) {
        return new Gson().fromJson(reader, clazz);
    }

}
