package de.gregorstallmeister.codewars;

public class NumberOfTrailingZerosOfNFactorial {
    // below top 50
    public static int zeros(int n) {
        int numberOfTrailingZeros = 0;

        for (int i = 5; n/i > 0; i*=5) {
            numberOfTrailingZeros += n/i;
        }

        return numberOfTrailingZeros;
    }
}
