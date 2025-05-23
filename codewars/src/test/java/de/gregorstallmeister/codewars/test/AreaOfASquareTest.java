package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.AreaOfASquare;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java

public class AreaOfASquareTest {

    private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        assertEquals(1.62, AreaOfASquare.squareArea(2),DELTA);
        assertEquals(0, AreaOfASquare.squareArea(0),DELTA);
        assertEquals(80, AreaOfASquare.squareArea(14.05),DELTA);
    }
}
