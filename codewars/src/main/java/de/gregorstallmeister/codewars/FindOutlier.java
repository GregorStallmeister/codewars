package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutlier {
    public static int findFirst(int[] integers) {
        List<Integer> evens = Arrays.stream(integers)
                .boxed()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> odds = Arrays.stream(integers)
                .boxed()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        if (evens.size() == 1) {
            return evens.get(0);
        }

        return odds.get(0);
    }

    public static int find(int[] integers) {
        int[] evens = Arrays.stream(integers)
                .filter(i -> i % 2 == 0)
                .toArray();

        return evens.length == 1
                ? evens[0]
                : Arrays.stream(integers)
                .filter(i -> i % 2 != 0)
                .toArray()[0];
    }
}
