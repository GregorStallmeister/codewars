package de.gregorstallmeister.codewars;

public class SpinWordsFirst {

    public String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if ( i > 0)
                stringBuilder.append(" ");

            stringBuilder.append( words[i].length() < 5 ? words[i] : reverseWord(words[i]));
        }

        return stringBuilder.toString();
    }

    private String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(word.charAt(word.length() - 1 - i));
        }

        return stringBuilder.toString();
    }
}
