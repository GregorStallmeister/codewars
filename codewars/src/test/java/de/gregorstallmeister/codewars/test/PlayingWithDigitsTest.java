package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;

import de.gregorstallmeister.codewars.PlayingWithDigits;
import org.junit.Test;

// https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java

public class PlayingWithDigitsTest {
    @Test
    public void Test1First() {
        assertEquals(1, PlayingWithDigits.digPowFirst(89, 1));
    }
    @Test
    public void Test2First() {
        assertEquals(-1, PlayingWithDigits.digPowFirst(92, 1));
    }
    @Test
    public void Test3First() {
        assertEquals(51, PlayingWithDigits.digPowFirst(46288, 3));
    }

    @Test
    public void Test1() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
}
