package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.PushAnObjectIntoArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

// https://www.codewars.com/kata/527b3cd0492b6b15250060af/train/java

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomethingFirst() {
        List<String> items = PushAnObjectIntoArray.pushFirstAttempt();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }

    @Test
    public void testSomething() {
        List<String> items = PushAnObjectIntoArray.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}
