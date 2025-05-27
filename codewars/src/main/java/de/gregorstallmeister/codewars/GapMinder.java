package de.gregorstallmeister.codewars;

public class GapMinder {
    public static int countMissingCarriages(String train) {
        // Rank 12 in Best Practices!
        String cComplete = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int cCPos = 0;
        int missing = 0;

        for (char c : train.toCharArray()) {
            if (c == cComplete.charAt(cCPos)) {
                cCPos += 1;
            }
            else {
                while (c != cComplete.charAt(cCPos)) {
                    missing += 1;
                    cCPos += 1;
                }
                cCPos += 1;
            }
        }

        return missing;
    }
}
