package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWordsSecond(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if ( i > 0)
                stringBuilder.append(" ");

            stringBuilder.append( words[i].length() < 5 ? words[i] : new StringBuilder(words[i]).reverse().toString());
        }

        return stringBuilder.toString();
    }

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() < 5 ? word : new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
