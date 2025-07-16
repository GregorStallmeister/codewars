package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.StringIncrementer;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

// https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java

public class StringIncrementerTest {
    private static void doTestFirst(String str, String expected) {
//        String actual = assertDoesNotThrow(() -> StringIncrementer.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        String actual = StringIncrementer.incrementStringFirst(str);
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }

    private static void doTest(String str, String expected) {
//        String actual = assertDoesNotThrow(() -> StringIncrementer.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        String actual = StringIncrementer.incrementString(str);
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }


    @Test
    public void exampleTests() {
        doTest("", "1");
        doTest("foo", "foo1");
        doTest("foobar000", "foobar001");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");

        doTest("1", "2");
        doTest("CN6hNDApuTFkWR?N]$ki*V5Q%b*pbF9&\"ryI877367582289887196622005331632", "CN6hNDApuTFkWR?N]$ki*V5Q%b*pbF9&\"ryI877367582289887196622005331633");
        doTest("009", "010");
        doTest("0000000000000000003267175195397088", "0000000000000000003267175195397089");
    }
}
