package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.Rot13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/530e15517bc88ac656000716/train/java

public class Rot13Test {
    @Test
    void testRot13() {
        // assertEquals("expected", "actual");
        assertEquals("grfg", Rot13.rot13("test"), "Input: \"test\"");
        assertEquals("Grfg", Rot13.rot13("Test"), "Input: \"Test\"");
    }
}
