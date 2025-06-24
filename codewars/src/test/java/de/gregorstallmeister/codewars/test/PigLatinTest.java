package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.PigLatin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
