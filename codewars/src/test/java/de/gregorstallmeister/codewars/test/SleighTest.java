package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.Sleigh;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/52adc142b2651f25a8000643/train/java

public class SleighTest {
    @Test
    public void test_authentication() {
        assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }
}
