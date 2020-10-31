package com.recipes;

import java.io.IOException;
import java.util.List;

public class Indexer {
    public static void index() throws IOException {
        Values links = new UrlRepo().read();
        Values tags = new TagRepo().read();
        Recipes recipes = new Recipes();

        for (String url : links.getValues()) {
            Item recipe = new Item(url);
            List<String> words = UrlReader.read(url);

            for (String tag : tags.getValues()) {
                if (words.contains(tag)) {
                    recipe.addTag(tag);
                }
            }

            recipes.addRecipe(recipe);
        }

        new RecipeRepo().write(recipes);
    }
}
