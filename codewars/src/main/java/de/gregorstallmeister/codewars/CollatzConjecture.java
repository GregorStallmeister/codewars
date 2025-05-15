package de.gregorstallmeister.codewars;

public class CollatzConjecture {

    public static int hotpoFirst(int n) {
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

    public static int hotpo(int n) {
        int i = 0;

        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : (n * 3) +1;
            i++;
        }

        return i;
    }
}
