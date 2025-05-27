package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {
    public static String createAcronymFirst(String lastName, String firstName) {
        StringBuilder stringBuilder = new StringBuilder();
        lastName = lastName.toUpperCase().replace('-', ' ');
        firstName = firstName.toUpperCase().replace('-', ' ');

        stringBuilder.append(firstName.charAt(0));
        int idx = firstName.indexOf(" ");
        if (idx != -1) {
            stringBuilder.append(firstName.charAt(idx + 1));
        }

        if (lastName.startsWith("VON ")) {
            stringBuilder.append('v');
            lastName = lastName.substring(4);
        }

        stringBuilder.append(lastName.charAt(0));
        idx = lastName.indexOf(" ");
        if (idx != -1) {
            stringBuilder.append(lastName.charAt(idx + 1));
        }

        return stringBuilder.toString();
    }

    public static String createAcronymSecond(String lastName, String firstName) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] nameParts = (firstName + " " + lastName).replace('-', ' ').split(" ");

        for (String namePart : nameParts) {
            if (namePart.equalsIgnoreCase("von"))
                stringBuilder.append('v');
            else
                stringBuilder.append(namePart.substring(0, 1).toUpperCase());
        }

        return stringBuilder.toString();
    }

    public static String createAcronym(String lastName, String firstName) {
        return Arrays.stream((firstName + " " + lastName).split("[ -]"))
                .map(n -> n.matches("(?i:von)") ? n.toLowerCase() : n.toUpperCase())
                .map(n -> n.substring(0, 1))
                .collect(Collectors.joining());
    }
}
