package de.gregorstallmeister.codewars.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.gregorstallmeister.codewars.NarcissisticNumber;
import org.junit.jupiter.api.Test;

// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java

class NarcissisticNumberTest {
    @Test
    void exampleTestsFirst() {
        assertTrue(NarcissisticNumber.isNarcissisticFirst(153), "153 is narcissistic");
        assertTrue(NarcissisticNumber.isNarcissisticFirst(1634), "1634 is narcissistic");
        assertFalse(NarcissisticNumber.isNarcissisticFirst(112), "112 is not narcissistic");
    }

    @Test
    void exampleTests() {
        assertTrue(NarcissisticNumber.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NarcissisticNumber.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NarcissisticNumber.isNarcissistic(112), "112 is not narcissistic");
    }
}
