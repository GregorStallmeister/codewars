package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class MergingSortedIntegerArraysWithoutDuplicates {
    public static int[] mergeArraysFirst(int[] first, int[] second) {
        List<Integer> workList = new ArrayList<>();
        for (int j : first) {
            workList.add(j);
        }
        for (int k: second) {
            workList.add(k);
        }
        List<Integer> workListWithoutDuplicates = new ArrayList<>(new HashSet<>(workList));
        int[] returnArray = workListWithoutDuplicates.stream().mapToInt(i -> i).toArray();
        Arrays.sort(returnArray);
        return returnArray;
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second))
                .distinct()
                .sorted()
                .toArray();
    }
}
