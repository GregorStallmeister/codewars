package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.CreatePhoneNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

public class CreatePhoneNumberTest {
    @Test
    public void testsFirst() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumberFirst(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testsSecond() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumberSecond(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
