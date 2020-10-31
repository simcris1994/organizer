package com.recipes.logic;

import com.recipes.io.UrlReader;
import com.recipes.model.Item;
import com.recipes.model.Links;
import com.recipes.model.Recipes;
import com.recipes.model.Tags;
import com.recipes.repo.Repo;

import java.io.IOException;
import java.util.List;

public class Indexer {
    public static void index() throws IOException {
        Links links = Repo.read(Links.class);
        Tags tags = Repo.read(Tags.class);
        Recipes recipes = new Recipes();

        for (String url : links.getValues()) {
            Item recipe = new Item(url);
            List<String> words = UrlReader.read(url);

            tags.getValues().stream().filter(words::contains).forEach(recipe::addTag);

            recipes.addRecipe(recipe);
        }

        Repo.write(Recipes.class, recipes);
    }
}
