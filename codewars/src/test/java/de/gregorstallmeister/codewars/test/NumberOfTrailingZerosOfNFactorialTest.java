package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.NumberOfTrailingZerosOfNFactorial;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

// https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

public class NumberOfTrailingZerosOfNFactorialTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(NumberOfTrailingZerosOfNFactorial.zeros(0), is(0));
        assertThat(NumberOfTrailingZerosOfNFactorial.zeros(6), is(1));
        assertThat(NumberOfTrailingZerosOfNFactorial.zeros(14), is(2));

        assertThat(NumberOfTrailingZerosOfNFactorial.zeros(15), is(3));
        assertThat(NumberOfTrailingZerosOfNFactorial.zeros(20), is(4));
    }
}
