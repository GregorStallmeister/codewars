package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.HowDoICompare;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/55d8618adfda93c89600012e/train/java

public class HowDoICompareTest {

    @Test
    public void testFirst() throws Exception {
        for (Object[] t: tests)
            assertEquals(t[1], HowDoICompare.whatIsFirst((Integer)t[0]));
    }

    @Test
    public void testSecond() throws Exception {
        for (Object[] t: tests)
            assertEquals(t[1], HowDoICompare.whatIsSecond((Integer)t[0]));
    }

    @Test
    public void test() throws Exception {
        for (Object[] t: tests)
            assertEquals(t[1], HowDoICompare.whatIs((Integer)t[0]));
    }

    static final Object[][] tests = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
