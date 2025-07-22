package de.gregorstallmeister.codewars;

import java.math.BigInteger;

public class SumFct {
    // Rank 39
    public static BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        BigInteger last = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ONE; ! i.equals(n.add(BigInteger.TWO)); i = i.add(BigInteger.ONE)) {
            sum = sum.add(current);

            BigInteger temp = current.add(last);
            last = current;
            current = temp;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}
