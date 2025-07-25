package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        StringBuilder resBuilder = new StringBuilder();
        resBuilder.append("[");

        for (long num = m; num <= n; num++) {
            List<Long> divisors = new ArrayList<>();

            for (long div = 1; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    divisors.add(div);
                    divisors.add(num / div);
                }
            }

            long sumSquaredDivs = 0;
            for (long div : divisors) {
                sumSquaredDivs += div * div;
            }

            if (Math.floor(Math.sqrt(sumSquaredDivs)) == Math.sqrt(sumSquaredDivs)) {
                resBuilder.append("[");
                resBuilder.append(num);
                resBuilder.append(", ");
                resBuilder.append(sumSquaredDivs);
                resBuilder.append("]");
                resBuilder.append(", ");
            }
        }

        return resBuilder.toString();
    }
}
