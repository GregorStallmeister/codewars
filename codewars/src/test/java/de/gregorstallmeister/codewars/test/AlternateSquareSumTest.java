package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.AlternateSquareSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/559d7951ce5e0da654000073/train/java

public class AlternateSquareSumTest {

    @Test
    public void exampleTest() {
        assertEquals(379, AlternateSquareSum.alternateSqSum(new int[] {11, 12, 13, 14, 15}));
    }

    @Test
    public void exampleTestStream() {
        assertEquals(379, AlternateSquareSum.alternateSqSumStream(new int[] {11, 12, 13, 14, 15}));
    }

}
