package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingDuplicates {
    public static int duplicateCountFirst(String text) {
        Map<String, Integer> characterIntegerMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            String k = String.valueOf(c).toUpperCase();
            if (characterIntegerMap.containsKey(k)) {
                characterIntegerMap.replace(k, characterIntegerMap.get(k) + 1);
            } else {
                characterIntegerMap.put(k, 1);
            }
        }

        return (int) characterIntegerMap.keySet()
                .stream()
                .filter(k -> characterIntegerMap.get(k) > 1)
                .count();
    }

    public static int duplicateCountSecond(String text) {
        Map<Character, Long> characterIntegerMap
                = text.codePoints()
                .map(Character::toUpperCase)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(identity(), counting()));

        return (int) characterIntegerMap.values()
                .stream()
                .filter(v -> v > 1)
                .count();
    }

    public static int duplicateCount(String text) {
        String workingText = text.toUpperCase();

        return (int) Arrays.stream(workingText.split(""))
                .filter(c -> workingText.indexOf(c) != workingText.lastIndexOf(c))
                .distinct()
                .count();
    }
}
