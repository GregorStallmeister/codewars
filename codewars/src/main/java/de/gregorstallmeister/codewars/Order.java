package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String orderFirst(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        String[] wordsOrdered = new String[wordsArray.length];

        for (int i = 0; i < wordsArray.length; i++) {
            for (String word : wordsArray) {
                if (word.contains(String.valueOf(i + 1))) {
                    wordsOrdered[i] = word;
                    break;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(wordsOrdered[0]);
        for (int i = 1; i < wordsOrdered.length; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(wordsOrdered[i]);
        }

        return stringBuilder.toString();
    }

    public static String orderSecond(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            for (String word : wordsArray) {
                if (word.contains(String.valueOf(i + 1))) {
                    stringBuilder.append(word);
                    stringBuilder.append(" ");
                    break;
                }
            }
        }

        return stringBuilder.toString().trim();
    }

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(w -> Integer.valueOf(w.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b)
                .get();
    }
}
