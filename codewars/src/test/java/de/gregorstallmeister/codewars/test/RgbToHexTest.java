package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.RgbToHex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/513e08acc600c94f01000001/train/java

public class RgbToHexTest {

    @Test
    public void sampleTestsFirst() {
        assertEquals("For input: (0, 0, 0)", "000000", RgbToHex.rgbFirst(0, 0, 0));
        assertEquals("For input: (1, 2, 3)", "010203", RgbToHex.rgbFirst(1, 2, 3));
        assertEquals("For input: (255, 255, 255)", "FFFFFF", RgbToHex.rgbFirst(255, 255, 255));
        assertEquals("For input: (254, 253, 252)", "FEFDFC", RgbToHex.rgbFirst(254, 253, 252));
        assertEquals("For input: (-20, 275, 125)", "00FF7D", RgbToHex.rgbFirst(-20, 275, 125));
    }

    @Test
    public void sampleTests() {
        assertEquals("For input: (0, 0, 0)", "000000", RgbToHex.rgb(0, 0, 0));
        assertEquals("For input: (1, 2, 3)", "010203", RgbToHex.rgb(1, 2, 3));
        assertEquals("For input: (255, 255, 255)", "FFFFFF", RgbToHex.rgb(255, 255, 255));
        assertEquals("For input: (254, 253, 252)", "FEFDFC", RgbToHex.rgb(254, 253, 252));
        assertEquals("For input: (-20, 275, 125)", "00FF7D", RgbToHex.rgb(-20, 275, 125));
    }
}
