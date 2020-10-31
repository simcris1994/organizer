package com.recipes;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.collections.Sets;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RecipeRepoTest {

    @Mock
    private FileLoader fileLoader;

    @InjectMocks
    private RecipeRepo recipeRepo;

    @Test
    public void testRead() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("testRecipes.json");
        when(fileLoader.getRecipes()).thenReturn(inputStream);

        Item item1 = new Item("A", Sets.newSet("chicken", "broccoli"));
        Item item2 = new Item("B", Sets.newSet("potato", "cheese"));
        List<Item> items = Arrays.asList(item1, item2);
        Recipes expected = new Recipes(items);

        Recipes actual = recipeRepo.read();

        assertEquals(expected, actual);
    }

}
