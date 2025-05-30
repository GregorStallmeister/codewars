package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.Collections;

import de.gregorstallmeister.codewars.EightiesKids3;
import org.junit.Test;

// https://www.codewars.com/kata/5662292ee7e2da24e900012f

public class EightiesKids3Test {
    @Test
    public void testPunkyFirst() {
        String[] socks = new String[] { "pink", "argyle", "argyle" };
        String[] chosenSocks = EightiesKids3.getSocksFirst("Punky", socks);
        assertNotNull(chosenSocks);
        assertEquals(2, chosenSocks.length);
        assertNotEquals(chosenSocks[0], chosenSocks[1]);
        assertThat(Arrays.asList(socks), hasItems(chosenSocks));
    }

    @Test
    public void testHenryFirst() {
        String[] socks = new String[] { "red", "blue", "blue", "green" };
        String[] chosenSocks = EightiesKids3.getSocksFirst("Henry", socks);
        assertNotNull(chosenSocks);
        assertEquals(2, chosenSocks.length);
        assertEquals(chosenSocks[0], chosenSocks[1]);
        assertTrue(Collections.frequency(Arrays.asList(socks), chosenSocks[0]) >= 2);
    }

    @Test
    public void testNoSolutionFirst() {
        String[] socks = new String[] { "green" };
        assertArrayEquals(new String[0], EightiesKids3.getSocksFirst("Henry", socks));
    }
    @Test
    public void testPunky() {
        String[] socks = new String[] { "pink", "argyle", "argyle" };
        String[] chosenSocks = EightiesKids3.getSocks("Punky", socks);
        assertNotNull(chosenSocks);
        assertEquals(2, chosenSocks.length);
        assertNotEquals(chosenSocks[0], chosenSocks[1]);
        assertThat(Arrays.asList(socks), hasItems(chosenSocks));
    }

    @Test
    public void testHenry() {
        String[] socks = new String[] { "red", "blue", "blue", "green" };
        String[] chosenSocks = EightiesKids3.getSocks("Henry", socks);
        assertNotNull(chosenSocks);
        assertEquals(2, chosenSocks.length);
        assertEquals(chosenSocks[0], chosenSocks[1]);
        assertTrue(Collections.frequency(Arrays.asList(socks), chosenSocks[0]) >= 2);
    }

    @Test
    public void testNoSolution() {
        String[] socks = new String[] { "green" };
        assertArrayEquals(new String[0], EightiesKids3.getSocks("Henry", socks));
    }
}
