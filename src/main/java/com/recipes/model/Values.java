package com.recipes.model;

import java.util.Set;

public abstract class Values {
    private Set<String> values;

    public Values(Set<String> values) {
        this.values = values;
    }

    public Set<String> getValues() {
        return values;
    }
}
