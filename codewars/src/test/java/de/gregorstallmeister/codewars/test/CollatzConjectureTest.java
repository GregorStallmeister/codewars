package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.CollatzConjecture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/577a6e90d48e51c55e000217/train/java

public class CollatzConjectureTest {

    @Test
    void sampleTests() {
        assertEquals(0, CollatzConjecture.hotpo(1));
        assertEquals(5, CollatzConjecture.hotpo(5));
        assertEquals(8, CollatzConjecture.hotpo(6));
        assertEquals(15, CollatzConjecture.hotpo(23));
    }
}
