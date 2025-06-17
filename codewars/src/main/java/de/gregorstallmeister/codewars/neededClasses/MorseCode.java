package de.gregorstallmeister.codewars.neededClasses;

public class MorseCode {
    public static String get(String charCode) {
        switch (charCode) {
            case "-..": return "D";
            case ".": return "E";
            case "....": return "H";
            case ".---": return "J";
            case "..-": return "U";
            case "-.--": return "Y";
            default: return "@notKnown@";
        }
    }
}
