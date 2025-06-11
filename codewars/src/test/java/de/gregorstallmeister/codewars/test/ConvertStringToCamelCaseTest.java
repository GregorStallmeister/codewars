package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.ConvertStringToCamelCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

public class ConvertStringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
}
