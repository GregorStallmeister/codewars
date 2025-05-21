package de.gregorstallmeister.codewars;

import java.util.function.ToDoubleBiFunction;
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

    public static final ToDoubleFunction<Triangle> fSecond = triangle -> {
        triangle.setArea(0.5 * triangle.base * triangle.height);
        return triangle.getArea();
    };

    public static ToDoubleBiFunction<Integer, Integer> d = (x, y) -> (x * y) * 0.5;
    public static final ToDoubleFunction<Triangle> f = triangle -> {
        triangle.setArea(d.applyAsDouble(triangle.base, triangle.height));
        return triangle.getArea();
    };
}
