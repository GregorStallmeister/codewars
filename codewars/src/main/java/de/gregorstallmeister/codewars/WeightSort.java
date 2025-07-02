package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeightFirst(String weights) {
        return Arrays.stream(weights.trim().split("[ ]+")).sorted(WeightSort::sortFirst)
                .collect(Collectors.joining(" "));
    }

    public static String orderWeight(String weights) {
        return Arrays.stream(weights.trim().split("[ ]+")).sorted(WeightSort::sort)
                .collect(Collectors.joining(" "));
    }

    private static int sortFirst(String weightA, String weightB) {
        int cS1 = countCrossSum(weightA);
        int cS2 = countCrossSum(weightB);

        if (cS1 < cS2)
            return -1;

        if (cS1 > cS2)
            return 1;

        Object[] alphaSorted = Arrays.stream(new String[] {weightA, weightB})
                .sorted()
                .toArray();

        if (alphaSorted[0].equals(weightA))
            return -1;

        return 1;
    }

    private static int sort(String weightA, String weightB) {
        int cS1 = countCrossSum(weightA);
        int cS2 = countCrossSum(weightB);

        if (cS1 < cS2)
            return -1;

        if (cS1 > cS2)
            return 1;

        return weightA.compareTo(weightB);
    }

    private static int countCrossSum(String weight) {
        return Arrays.stream(weight.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
