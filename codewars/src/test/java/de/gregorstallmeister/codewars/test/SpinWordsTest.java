package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.SpinWordsFirst;
import de.gregorstallmeister.codewars.SpinWords;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

public class SpinWordsTest {
    @Test
    public void testFirst() {
        assertEquals("emocleW", new SpinWordsFirst().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWordsFirst().spinWords("Hey fellow warriors"));
    }

    @Test
    public void testSecond() {
        assertEquals("emocleW", new SpinWords().spinWordsSecond("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWordsSecond("Hey fellow warriors"));
    }

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}
