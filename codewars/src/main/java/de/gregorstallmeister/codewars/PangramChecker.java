package de.gregorstallmeister.codewars;

public class PangramChecker {
    public boolean checkFirst(String sentence) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char letter : letters) {
            if (sentence.toLowerCase().indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkSecond(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.toLowerCase().indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean check(String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
