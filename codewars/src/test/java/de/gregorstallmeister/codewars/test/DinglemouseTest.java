package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.Dinglemouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/596c55fc7bd5476bf60000d5/train/java

public class DinglemouseTest {

    @Test
    void test() {
        assertEquals(123, Dinglemouse.INST.plus100(23));
        // Err... was that right?
    }
}
