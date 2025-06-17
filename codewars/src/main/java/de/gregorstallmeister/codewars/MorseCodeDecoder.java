package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.MorseCode;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        StringBuilder resBuilder = new StringBuilder();
        String[] words = morseCode.trim().split(" {3}");

        for (String word: words) {
            String[] charCodes = word.split(" ");

            for (String charCode: charCodes) {
                resBuilder.append(MorseCode.get(charCode));
            }

            resBuilder.append(" ");
        }

        return resBuilder.toString().trim();
    }
}
