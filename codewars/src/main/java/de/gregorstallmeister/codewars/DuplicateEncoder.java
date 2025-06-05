package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {
    public static String encodeFirst(String word) {
        String wordWorking = word.toUpperCase();

        // first handle all round brackets which are already in the word:
        List<Integer> idsOpeningBracket = new ArrayList<>();
        List<Integer> idsClosingBracket = new ArrayList<>();
        for (int i = 0; i < wordWorking.length(); i++) {
            if (wordWorking.charAt(i) == '(') {
                idsOpeningBracket.add(i);
            }
            if (wordWorking.charAt(i) == ')') {
                idsClosingBracket.add(i);
            }
        }

        if (idsOpeningBracket.size() > 1) {
            for (int i : idsOpeningBracket) {
                wordWorking = wordWorking.substring(0, i) + ")" + wordWorking.substring(i + 1);
            }
        }
        if (idsClosingBracket.size() == 1) {
            wordWorking = wordWorking.substring(0, idsClosingBracket.get(0)) + "(" + wordWorking.substring(idsClosingBracket.get(0) + 1);
        }

        // now handle all chars except round brackets:
        for (String c : wordWorking.split("")) {
            if (c.equals("(") || c.equals(")")) {
                continue;
            }

            if (wordWorking.indexOf(c) == wordWorking.lastIndexOf(c)) {
                wordWorking = wordWorking.replace(c, "(");
            } else {
                wordWorking = wordWorking.replace(c, ")");
            }
        }

        return wordWorking;
    }

    public static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)) ? "(" : ")");
        }

        return stringBuilder.toString();
    }
}
