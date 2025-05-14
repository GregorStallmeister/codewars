package de.gregorstallmeister.codewars;

import java.util.Map;

public class HowDoICompare {
    public static String whatIsFirst(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String)p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {1764, "everything squared"},
    };

    static final Map<Integer, String> SPECIAL_NUMBERS = Map.ofEntries(
            Map.entry(42, "everything"),
            Map.entry(42 * 42, "everything squared")
    );

    public static String whatIsSecond(Integer x) {
        return SPECIAL_NUMBERS.getOrDefault(x, "nothing");
    }

    public static String whatIs(Integer x) {
        return Map.of(42, "everything", 42 * 42, "everything squared").getOrDefault(x, "nothing");
    }
}
