package de.gregorstallmeister.codewars;

public class QuarterOfTheYear {

    public static int quarterOfFirst(int month) {
        return switch (month) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> 0;
        };
    }

    public static int quarterOf(int month) {
        return (int)Math.ceil(month / 3.0);
    }
}
