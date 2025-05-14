package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MultipleOfIndex {

    public static int[] multipleOfIndexFirst(int[] array) {
        ArrayList<Integer> matches = new ArrayList<>();

        if(array[0] == 0) {
            matches.add(0);
        }

        for (int i = 1; i < array.length; i++) {
            int rest = array[i] % i;
            if (rest == 0) {
                matches.add(array[i]);
            }
        }

        int[] returnArray = new  int[matches.size()];
        int j = 0;
        for (int match: matches) {
            returnArray[j] = match;
            j++;
        }

        return returnArray;
    }

    public static int[] multipleOfIndexSecond(int[] array) {
        ArrayList<Integer> matches = new ArrayList<>();

        if(array[0] == 0) {
            matches.add(0);
        }

        for (int i = 1; i < array.length; i++) {
            int rest = array[i] % i;
            if (rest == 0) {
                matches.add(array[i]);
            }
        }

        return matches.stream().mapToInt(x -> x).toArray();
    }

    public static int[] multipleOfIndexThird(int[] array) {
        return IntStream.range(0, array.length)
                .filter(i -> (i == 0 && array[i] == 0) || (i != 0 && array[i] % i == 0))
                .map(i -> array[i])
                .toArray();
    }

    public static int[] multipleOfIndex(int[] array) {
        IntPredicate isMultipleOfIndex = (i) -> {
            if (i == 0) {
                return array[i] == 0;
            }

            return array[i] % i == 0;
        };

        return IntStream.range(0, array.length)
                .filter(isMultipleOfIndex)
                .map(i -> array[i])
                .toArray();
    }
}
