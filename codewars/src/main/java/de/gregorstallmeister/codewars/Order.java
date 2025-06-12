package de.gregorstallmeister.codewars;

public class Order {
    public static String order(String words) {
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
}
