package com.recipes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UrlReader {

    public static List<String> read(String href) throws IOException {
        URL url = new URL(href);

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        List<String> lines = new ArrayList<>();

        String line;
        while ((line = in.readLine()) != null) {
            lines.add(line);
        }

        in.close();

        return lines
                .stream()
                .map(l -> Arrays.asList(l.split(" ")))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
