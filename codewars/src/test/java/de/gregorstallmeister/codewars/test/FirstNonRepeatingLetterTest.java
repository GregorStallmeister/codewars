package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.FirstNonRepeatingLetter;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/train/java

public class FirstNonRepeatingLetterTest {
    @Test @DisplayName("Sample tests")
    void sampleTestsFirst() {
        assertEquals("a", FirstNonRepeatingLetter.firstNonRepeatingLetterFirst("a"), "For input \"a\"");
        assertEquals("t", FirstNonRepeatingLetter.firstNonRepeatingLetterFirst("streSS"), "For input \"streSS\"");
        assertEquals("-", FirstNonRepeatingLetter.firstNonRepeatingLetterFirst("moon-men"), "For input \"moon-men\"");
        assertEquals("", FirstNonRepeatingLetter.firstNonRepeatingLetterFirst("moonmoon"), "For input \"moonmoon\"");
    }

    @Test @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("a", FirstNonRepeatingLetter.firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", FirstNonRepeatingLetter.firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", FirstNonRepeatingLetter.firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("", FirstNonRepeatingLetter.firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
    }
}
