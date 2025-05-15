package de.gregorstallmeister.codewars;

public class CollatzConjecture {

    public static int hotpo(int n) {
        int result = n;
        int iterations = 0;

        while (result != 1) {
            if (result % 2 == 0)
                result = result / 2;
            else
                result = (result * 3) + 1;

            iterations++;
        }

        return iterations;
    }
}
