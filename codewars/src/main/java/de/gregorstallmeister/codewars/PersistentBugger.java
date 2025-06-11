package de.gregorstallmeister.codewars;

public class PersistentBugger {
    public static int roundsTemp = 0;

    public static int persistence(long n) {
        String digits = String.valueOf(n);

        if (digits.length() == 1) {
            int roundsRun = roundsTemp;
            roundsTemp = 0;
            return roundsRun;
        }

        long result = 1;
        for (String digit: digits.split("")) {
            result *= Long.parseLong(digit);
        }

        roundsTemp++;
        return persistence(result);
    }
}
