package de.gregorstallmeister.codewars;

import java.util.function.IntUnaryOperator;

public class AdderFactory {
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static IntUnaryOperator createWithoutIjTipp(int addTo) {
        IntUnaryOperator f = arg -> arg + addTo;
        f.applyAsInt(42);
        return f;
    }

    public static IntUnaryOperator create(int addTo) {
        return arg -> arg + addTo;
    }
}
