package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.NameMe;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

// https://www.codewars.com/kata/547c71fdc5b2b38db1000098/train/java

public class NameMeTest {

    @Test
    public void testNameMeOne() throws Exception {
        NameMe nameMe = new NameMe("John", "Doe");

        assertEquals("Verifying First name. Object returned should contain the firstname: John",
                "John",
                nameMe.getFirstName());

        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
                "Doe",
                nameMe.getLastName());

        assertNotEquals("Verifying full name. Object returned should contain full name: John Doe",
                "JohnDoe",
                nameMe.getFullName());

        assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.getFullName());
    }
}
