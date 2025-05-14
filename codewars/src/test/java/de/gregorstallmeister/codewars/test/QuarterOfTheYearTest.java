package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.QuarterOfTheYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuarterOfTheYearTest {

    @Test
    public void exampleTestsFirst() {
        assertEquals(1, QuarterOfTheYear.quarterOfFirst(3));
        assertEquals(2, QuarterOfTheYear.quarterOfFirst(5));
        assertEquals(3, QuarterOfTheYear.quarterOfFirst(8));
        assertEquals(4, QuarterOfTheYear.quarterOfFirst(11));
    }

    @Test
    public void exampleTests() {
        assertEquals(1, QuarterOfTheYear.quarterOf(3));
        assertEquals(2, QuarterOfTheYear.quarterOf(5));
        assertEquals(3, QuarterOfTheYear.quarterOf(8));
        assertEquals(4, QuarterOfTheYear.quarterOf(11));
    }
}
