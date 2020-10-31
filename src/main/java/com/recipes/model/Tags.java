package com.recipes.model;

import java.util.Arrays;
import java.util.Set;

public class Tags extends Values {

    public Tags(Set<String> values) {
        super(values);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("[\n");
        for (String value : this.getValues()) {
            text.append(value);
            text.append("\n");
        }
        text.append("]");
        return text.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tags) {
            Tags otherTags = (Tags) obj;
            return Arrays.equals(this.getValues().toArray(), otherTags.getValues().toArray());
        }
        return false;
    }
}