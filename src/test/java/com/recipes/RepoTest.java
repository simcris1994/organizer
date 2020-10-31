package com.recipes;

import com.recipes.io.FileLoader;
import com.recipes.model.Item;
import com.recipes.model.Recipes;
import com.recipes.repo.Repo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.collections.Sets;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepoTest {
    @Test
    public void testRead() throws FileNotFoundException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("testRecipes.json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        when(FileLoader.getReader(Recipes.class)).thenReturn(reader);

        Item item1 = new Item("A", Sets.newSet("chicken", "broccoli"));
        Item item2 = new Item("B", Sets.newSet("potato", "cheese"));
        List<Item> items = Arrays.asList(item1, item2);
        Recipes expected = new Recipes(items);

        Recipes actual = Repo.read(Recipes.class);

        assertEquals(expected, actual);
    }

}
