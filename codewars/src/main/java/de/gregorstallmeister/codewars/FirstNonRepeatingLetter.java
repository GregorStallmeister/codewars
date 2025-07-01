package de.gregorstallmeister.codewars;

public class FirstNonRepeatingLetter {
    // Rank 22
    public static String firstNonRepeatingLetterFirst(String s){
        String sLower = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (sLower.indexOf(("" + c).toLowerCase()) == sLower.lastIndexOf(("" + c).toLowerCase()))
                return "" + c;
        }

        return "";
    }

    // new Rank 22
    public static String firstNonRepeatingLetter(String s){
        String sLower = s.toLowerCase();

        for (String charLetter : s.split("")) {
            if (sLower.indexOf(charLetter.toLowerCase()) == sLower.lastIndexOf(charLetter.toLowerCase()))
                return charLetter;
        }

        return "";
    }
}
