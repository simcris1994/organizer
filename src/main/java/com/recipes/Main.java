package com.recipes;

import com.recipes.logic.Fetcher;
import com.recipes.logic.Indexer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Indexer.index();

        System.out.println("type keywords on one line, separated by comma");

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        List<String> tags = Arrays.stream(text.split(",")).map(String::trim).collect(Collectors.toList());

        Set<String> urls = Fetcher.fetch(tags);

        for (String url : urls) {
            System.out.println(url);
        }
    }
}
