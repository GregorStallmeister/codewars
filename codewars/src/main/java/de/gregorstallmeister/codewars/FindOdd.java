package de.gregorstallmeister.codewars;

import java.util.Arrays;
import java.util.HashMap;

public class FindOdd {
    public static int findItFirst(int[] a) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int n: a) {
            if (! hashMap.containsKey(n))
                hashMap.put(n, 1);
            else
                hashMap.replace(n, hashMap.get(n) + 1);
        }

        for (int n: hashMap.keySet()) {
            if (hashMap.get(n) % 2 != 0)
                return n;
        }

        throw new RuntimeException("Given array does not meet the requirements given for the task!");
    }

    public static int findItSecond(int[] a) {
        int odd = 0;

        for (int n : a) {
            odd ^= n; // number with even occurrence: every even occ will kick out the number after it was "stored" at odd occ
                     // => the only number with uneven occ will remain!
        }

        return odd;
    }

    public static int findIt(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
    }
}
