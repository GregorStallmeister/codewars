package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;

import de.gregorstallmeister.codewars.PrimeDecomp;
import org.junit.*;

// https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

public class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        assertEquals(
                "(2**5)(3)",
                PrimeDecomp.factors(96));

        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(7775460));

        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)(103)",
                PrimeDecomp.factors(800872380));
    }
}
