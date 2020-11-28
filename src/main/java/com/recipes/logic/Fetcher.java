package com.recipes.logic;

import com.recipes.model.Recipes;
import com.recipes.repo.Repo;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fetcher {

    public static Set<String> fetch(List<String> tags) throws FileNotFoundException {
        Recipes recipes = Repo.read(Recipes.class);

        Set<String> urls = new HashSet<>();

        recipes.getRecipes().stream().filter(r -> r.getTags().containsAll(tags)).forEach(r -> urls.add(r.getUrl()));

        return urls;
    }
}
