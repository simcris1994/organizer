package com.recipes.model;

import java.util.Arrays;
import java.util.Set;

public class Links extends Values {
    public Links(Set<String> values) {
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
        if (obj instanceof Links) {
            Links otherLinks = (Links) obj;
            return Arrays.equals(this.getValues().toArray(), otherLinks.getValues().toArray());
        }
        return false;
    }
}
