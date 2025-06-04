package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.BitCounting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

public class BitCountingTest {
    @Test
    public void testGameFirst() {
        assertEquals(5, BitCounting.countBitsFirst(1234));
        assertEquals(1, BitCounting.countBitsFirst(4));
        assertEquals(3, BitCounting.countBitsFirst(7));
        assertEquals(2, BitCounting.countBitsFirst(9));
        assertEquals(2, BitCounting.countBitsFirst(10));
    }

    @Test
    public void testGameSecond() {
        assertEquals(5, BitCounting.countBitsSecond(1234));
        assertEquals(1, BitCounting.countBitsSecond(4));
        assertEquals(3, BitCounting.countBitsSecond(7));
        assertEquals(2, BitCounting.countBitsSecond(9));
        assertEquals(2, BitCounting.countBitsSecond(10));
    }

    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}
