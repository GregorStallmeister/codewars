package de.gregorstallmeister.codewars;

public class StringIncrementer {
    public static String incrementString(String str) {
        if (str.matches("^[\\d]+$"))
            return String.valueOf(Integer.parseInt(str) + 1);

        if (!str.matches(".*[\\d]+"))
            return str + "1";


        int pos = str.length() - 1;
        while (str.substring(pos).matches("^[\\d]+$")) {
            pos--;
        }
        pos++;

        String partText = str.substring(0, pos);
        String partDigits = str.substring(pos);

        if (partDigits.length() > 18) {
            return "toDo";
        }

        String digitsNew = String.valueOf(Long.parseLong(partDigits) + 1);
        while (digitsNew.length() < partDigits.length()) {
            digitsNew = "0" + digitsNew;
        }
        return partText + digitsNew;
    }
}
