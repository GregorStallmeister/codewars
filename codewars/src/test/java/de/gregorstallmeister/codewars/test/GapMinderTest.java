package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.GapMinder;
import org.junit.*;

public class GapMinderTest {
    @Test
    public void testABC() {
        Assert.assertEquals("All carriages are present, so method should find 0 missing", 0, GapMinder.countMissingCarriages("ABC"));
    }

    @Test
    public void testABD() {
        Assert.assertEquals("Carriage C is missing, so method should find 1 missing", 1, GapMinder.countMissingCarriages("ABD"));
    }

    @Test
    public void testBCF() {
        Assert.assertEquals("Carriages A, D, and E are missing, so method should find 3 missing", 3, GapMinder.countMissingCarriages("BCF"));
    }
}
