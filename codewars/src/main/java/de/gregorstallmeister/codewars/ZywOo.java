package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.Collections;

public class ZywOo {

    public static String warnTheSheepFirst(String[] array) {
        int i = 0;

        for (i = 0; i < array.length; i++) {
            if (array[i].matches("wolf"))
                break;
        }

        if (array.length - 1 - i == 0)
            return "Pls go away and stop eating my sheep";

        return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
    }

    public static String warnTheSheepSecond(String[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].equals("wolf"))
                return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
        }
        return "Pls go away and stop eating my sheep";
    }

    public static String warnTheSheep(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }
}
