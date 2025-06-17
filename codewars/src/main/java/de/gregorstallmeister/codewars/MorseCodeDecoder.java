package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.MorseCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decodeFirst(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        StringBuilder resBuilder = new StringBuilder();
        String[] words = morseCode.trim().split(" {3}");

        for (String word : words) {
            String[] charCodes = word.split(" ");

            for (String charCode : charCodes) {
                resBuilder.append(MorseCode.get(charCode));
            }

            resBuilder.append(" ");
        }

        return resBuilder.toString().trim();
    }

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        return Arrays.stream(morseCode.split(" {3}"))
                .map(word -> (Arrays.stream(word.split(" "))
                        .map(MorseCode::get)
                        .collect(Collectors.joining())))
                .collect(Collectors.joining(" "));
    }
}
