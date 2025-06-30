package de.gregorstallmeister.codewars;

public class ProdFib {
    public static long[] productFibFirst(long prod) {
        long fib1 = 0;
        long fib2 = 1;

        while (true) {
            long prodActual = fib1 * fib2;
            if (prodActual == prod)
                return new long[] {fib1, fib2, 1};
            if (prodActual > prod)
                return new long[] {fib1, fib2, 0};

            long fibTemp = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibTemp;
        }
    }

    public static long[] productFib(long prod) {
        long fib1 = 0;
        long fib2 = 1;
        long prodActual = fib1 * fib2;

        while (prodActual < prod) {
            long fibTemp = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibTemp;

            prodActual = fib1 * fib2;
        }

        return new long[] {fib1, fib2, prodActual == prod ? 1 : 0};
    }
}
