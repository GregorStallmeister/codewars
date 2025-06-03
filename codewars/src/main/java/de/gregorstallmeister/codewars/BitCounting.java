package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.BitSet;

public class BitCounting {
    public static int countBits(int n) {
        int ones = 0;

        for (char b: Integer.toBinaryString(n).toCharArray()) {
            if (b == '1') {
                ones++;
            }
        }

        return ones;
    }
}
