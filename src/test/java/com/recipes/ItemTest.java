package com.recipes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.collections.Sets;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ItemTest {

    @Test
    public void testAddingDoubleTag() {
        Item item = new Item("url");

        item.addTag("chicken");
        item.addTag("rice");
        item.addTag("chicken");

        assertEquals(Sets.newSet("chicken", "rice"), item.getTags());
    }

    @Test
    public void testSetTagsWithDuplicates() {
        Item item = new Item("url");

        item.setTags(Sets.newSet("chicken", "rice", " CHICKEN"));

        assertEquals(Sets.newSet("chicken", "rice"), item.getTags());
    }

}