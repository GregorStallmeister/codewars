package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.DuplicateEncoder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

public class DuplicateEncoderTest {
    @Test
    public void testFirst() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encodeFirst("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encodeFirst("   ()(   "));
    }

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
