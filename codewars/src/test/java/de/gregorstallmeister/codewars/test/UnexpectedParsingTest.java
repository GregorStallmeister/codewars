package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.UnexpectedParsing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/54fdaa4a50f167b5c000005f/train/java

public class UnexpectedParsingTest {

    @Test
    public void testFirst() {
        assertEquals("busy", UnexpectedParsing.getStatusFirst(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatusFirst(false).get("status"));
    }

    @Test
    public void test() {
        assertEquals("busy", UnexpectedParsing.getStatus(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatus(false).get("status"));
    }
}
