package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.FunctionalProgramming;
import de.gregorstallmeister.codewars.Student;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// https://www.codewars.com/kata/54a6b43e478d8ee14c000a5d/train/java

public class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
    }
}
