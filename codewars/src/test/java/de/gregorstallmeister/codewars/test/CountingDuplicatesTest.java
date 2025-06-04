package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.CountingDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

public class CountingDuplicatesTest {
    @Test
    public void abcdeReturnsZeroFirst() {
        assertEquals(0, CountingDuplicates.duplicateCountFirst("abcde"));
    }

    @Test
    public void abcdeaReturnsOneFirst() {
        assertEquals(1, CountingDuplicates.duplicateCountFirst("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOneFirst() {
        assertEquals(1, CountingDuplicates.duplicateCountFirst("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThreeFirst() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCountFirst(test));
    }

    @Test
    public void abcdeReturnsZeroSecond() {
        assertEquals(0, CountingDuplicates.duplicateCountSecond("abcde"));
    }

    @Test
    public void abcdeaReturnsOneSecond() {
        assertEquals(1, CountingDuplicates.duplicateCountSecond("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOneSecond() {
        assertEquals(1, CountingDuplicates.duplicateCountSecond("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThreeSecond() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCountSecond(test));
    }

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }
}
