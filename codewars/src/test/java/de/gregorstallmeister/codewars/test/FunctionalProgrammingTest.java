package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.FunctionalProgramming;
import de.gregorstallmeister.codewars.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/54a6c6e7478d8ee02d000cd9/train/java

public class FunctionalProgrammingTest {
    @Test
    public void testAreaFirst() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.fFirst.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
    }

    @Test
    public void testArea() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
    }
}
