package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.PangramChecker;
import org.junit.Test;

import static org.junit.Assert.*;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

public class PangramCheckerTest {
    @Test
    public void test1First() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.checkFirst(pangram1));
    }
    @Test
    public void test2First() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.checkFirst(pangram2));
    }

    @Test
    public void test1Second() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.checkSecond(pangram1));
    }
    @Test
    public void test2Second() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.checkSecond(pangram2));
    }

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.check(pangram2));
    }
}
