package de.gregorstallmeister.codewars;

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('n', 0);
        characterIntegerMap.put('s', 0);
        characterIntegerMap.put('e', 0);
        characterIntegerMap.put('w', 0);
        for (char w : walk) {
                characterIntegerMap.replace(w, characterIntegerMap.get(w) + 1);
        }

        return characterIntegerMap.get('n').equals(characterIntegerMap.get('s'))
                && characterIntegerMap.get('e').equals(characterIntegerMap.get('w'));
    }
}
