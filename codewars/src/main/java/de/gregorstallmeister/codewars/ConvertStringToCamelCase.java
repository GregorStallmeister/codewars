package de.gregorstallmeister.codewars;

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s) {
        String[] words = s.split("[_-]");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            stringBuilder.append(words[i].substring(0, 1).toUpperCase());
            stringBuilder.append(words[i].substring(1));
        }

        return stringBuilder.toString();
    }
}
