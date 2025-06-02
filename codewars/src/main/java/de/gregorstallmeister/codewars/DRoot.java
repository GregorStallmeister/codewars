package de.gregorstallmeister.codewars;

public class DRoot {
    public static int digital_root(int n) {

        return crossSum(n);
    }

    public static int crossSum (int n) {
        char[] digitsC = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char c: digitsC) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        if (sum > 9) {
            return crossSum(sum);
        }

        return sum;
    }
}
