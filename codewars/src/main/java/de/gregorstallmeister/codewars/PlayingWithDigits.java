package de.gregorstallmeister.codewars;

public class PlayingWithDigits {
    public static long digPowFirst(int n, int p) {
        double res = 0;

        for (char c: String.valueOf(n).toCharArray()) {
            res += Math.pow(Double.parseDouble("" + c), p);
            p++;
        }
        double k = res / n;

        if (Math.floor(k) == k)
        {
            return (long) k;
        }
        else {
            return -1;
        }
    }

    public static long digPow(int n, int p) {
        String nString = String.valueOf(n);
        long res = 0;

        for (int i = 0; i < nString.length(); i++, p++) {
            res += (long) Math.pow(Character.getNumericValue(nString.charAt(i)), p);
        }

        return res % n == 0 ? res / n: -1;
    }
}
