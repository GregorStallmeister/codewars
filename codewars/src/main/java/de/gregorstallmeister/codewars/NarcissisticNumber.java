package de.gregorstallmeister.codewars;

import java.util.Arrays;

public class NarcissisticNumber {
    public static boolean isNarcissisticFirst(int number) {
        String [] digits = String.valueOf(number).split("");
        double result = 0;

        for (String digit: digits) {
            result += Math.pow(Double.parseDouble(digit), digits.length);
        }

        return number == result;
    }

    public static boolean isNarcissistic(int number) {
        int length = String.valueOf(number).length();

        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(d -> Math.pow(d, length))
                .sum();
    }
}
