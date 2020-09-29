package com.recipes;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private String url;
    private Set<String> tags;

    public Item(String url) {
        this.url = url;
        this.tags = new HashSet<>();
    }

    public String getUrl() {
        return url;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        tag = tag.trim().toLowerCase();
        tags.add(tag);
    }

    public void setTags(Set<String> tags) {
        tags.forEach(this::addTag);
    }

    @Override
    public String toString() {
        return String.format("item: { url: %s, tags = %s }", url, tags);
    }
}
