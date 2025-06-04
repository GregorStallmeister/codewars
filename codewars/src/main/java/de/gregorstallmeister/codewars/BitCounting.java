package de.gregorstallmeister.codewars;


public class BitCounting {
    public static int countBitsFirst(int n) {
        int ones = 0;

        for (char b: Integer.toBinaryString(n).toCharArray()) {
            if (b == '1') {
                ones++;
            }
        }

        return ones;
    }

    public static int countBitsSecond(int n) {
        return Integer.bitCount(n);
    }

    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n)
                .chars()
                .filter(c -> c == '1')
                .count();
    }
}
