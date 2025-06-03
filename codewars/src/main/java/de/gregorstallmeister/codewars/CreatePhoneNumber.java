package de.gregorstallmeister.codewars;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
    public static String createPhoneNumberFirst(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumberSecond(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNum = "(xxx) xxx-xxxx";

        for (int n : numbers) {
            phoneNum = phoneNum.replaceFirst("x", Integer.toString(n));
        }

        return phoneNum;
    }
}
