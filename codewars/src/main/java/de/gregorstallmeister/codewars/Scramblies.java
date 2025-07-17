package de.gregorstallmeister.codewars;

public class Scramblies {

    // Rank 80
    public static boolean scramble(String str1, String str2) {
        // using StringBuilder instead of modifying str1 in the loop reduces testing time from about 17 secs to 723 milli-secs!
        StringBuilder stringBuilder = new StringBuilder(str1);
        for (String letter : str2.split("")) {
            int pos = stringBuilder.indexOf(letter);

            if (pos == -1)
                return false;

            stringBuilder.deleteCharAt(pos);
        }

        return true;
    }
}
