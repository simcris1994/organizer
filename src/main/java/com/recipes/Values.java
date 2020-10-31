package com.recipes;

import java.util.Arrays;
import java.util.List;

public class Values {
    private List<String> values;

    public Values(List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("[\n");
        for (String value : values) {
            text.append(value);
            text.append("\n");
        }
        text.append("]");
        return text.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Values) {
            Values otherValues = (Values) obj;
            return Arrays.equals(this.values.toArray(), otherValues.values.toArray());
        }
        return false;
    }
}