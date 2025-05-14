package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.assertEquals;

import de.gregorstallmeister.codewars.GrassHopper;
import org.junit.Test;

// https://www.codewars.com/kata/55cb854deb36f11f130000e1/train/java

public class GrassHopperTest {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }
}
