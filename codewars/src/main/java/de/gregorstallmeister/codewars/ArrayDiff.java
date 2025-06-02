package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDiff {
    public static int[] arrayDiffFirst(int[] a, int[] b) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : a) {
            arrayList.add(i);
        }

        for (int j : b) {
            while (arrayList.contains(j)) {
                arrayList.remove(Integer.valueOf(j));
            }
        }

        int[] res = new int[arrayList.size()];
        for (int k = 0; k < arrayList.size(); k++) {
            res[k] = arrayList.get(k);
        }

        return res;
    }

    public static int[] arrayDiffSecond(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(i -> i).toArray();
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }
}
