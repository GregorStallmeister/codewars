package de.gregorstallmeister.codewars;

public class StringIncrementer {
    // Rank 39
    public static String incrementString(String str) {
        if (!str.matches(".*[\\d]+"))
            return str + "1";

        int pos = str.length() - 1;
        while (pos > -1 && str.substring(pos).matches("^[\\d]+$")) {
            pos--;
        }
        pos++;

        String partText = str.substring(0, pos);
        String[] partDigits = str.substring(pos).split("");

        boolean carryFlag = true;
        for (int i = partDigits.length -1; i > -1; i--) {
            int digitNew = Integer.parseInt(partDigits[i]) + 1;
            if (digitNew == 10) {
                partDigits[i] = "0";
            }
            else {
                partDigits[i] = String.valueOf(digitNew);
                carryFlag = false;
                break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(partText);
        if (carryFlag) {
            stringBuilder.append("1");
        }
        for (String partDigit : partDigits) {
            stringBuilder.append(partDigit);
        }

        return stringBuilder.toString();
    }
}
