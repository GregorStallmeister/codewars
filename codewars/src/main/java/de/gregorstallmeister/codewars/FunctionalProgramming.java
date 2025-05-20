package de.gregorstallmeister.codewars;

import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {
    public static final ToDoubleFunction<Triangle> fFirst = triangle -> {
        double area =  0.5 * triangle.base * triangle.height;
        triangle.setArea(area);
        return area;
    };
    //Make me a function.
    //Don't use Function. Find the appropriate function to turn an
    //arbitrary class into a double. Remember the import.

    public static final ToDoubleFunction<Triangle> f = triangle -> {
        triangle.setArea(0.5 * triangle.base * triangle.height);
        return triangle.getArea();
    };
}
