package de.gregorstallmeister.codewars;

public class Rot13 {
    public static String rot13(String str) {
        final String alphaLowerCase = "abcdefghijklmnopqrstuvwxyz";
        final String alphaLowerCaseCiphered = "nopqrstuvwxyzabcdefghijklm";
        final String alphaUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String alphaUpperCaseCiphered = "NOPQRSTUVWXYZABCDEFGHIJKLM";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int jL = alphaLowerCase.indexOf(str.charAt(i));
            if (jL > -1) {
                result.append(alphaLowerCaseCiphered.charAt(jL));
                continue;
            }

            int jU = alphaUpperCase.indexOf(str.charAt(i));
            if (jU > -1) {
                result.append(alphaUpperCaseCiphered.charAt(jU));
                continue;
            }

            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
