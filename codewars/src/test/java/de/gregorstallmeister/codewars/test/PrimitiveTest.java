package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.Primitive;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/557810cf791bbfd5ff00008f/train/java

public class PrimitiveTest {

    Primitive p = new Primitive();

    @Test
    public void testTypes() {

        assertEquals("byte", p.determineType("2"));
        assertEquals("int", p.determineType("-803847"));
        assertEquals("none", p.determineType("9173654782928177561848183754729818437466"));
        assertEquals("short", p.determineType("3573"));
        assertEquals("long", p.determineType("-5745621829365"));
    }
}
