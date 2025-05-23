package de.gregorstallmeister.codewars;

import java.util.stream.IntStream;

public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += i % 2 == 0 ? arr[i] : arr[i] * arr[i];
        }

        return sum;
    }

    public static int alternateSqSumStream(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> i % 2 == 0 ? arr[i] : arr[i] * arr[i])
                .sum();
    }
}
