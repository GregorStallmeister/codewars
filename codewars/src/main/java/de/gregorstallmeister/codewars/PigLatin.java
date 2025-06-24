package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigItFirst(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word.matches("[A-Za-z]+") ? word.substring(1) + word.charAt(0) + "ay" : word)
                .collect(Collectors.joining(" "));
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
