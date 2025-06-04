package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.FindOutlier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

public class FindOutlierTest {
    @Test
    void sampleTestsFirst() {
        assertEquals(3, FindOutlier.findFirst(new int[] {2, 6, 8, -10, 3}));
        assertEquals(206847684, FindOutlier.findFirst(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindOutlier.findFirst(new int[] {Integer.MAX_VALUE, 0, 1}));
    }

    @Test
    void sampleTests() {
        assertEquals(3, FindOutlier.find(new int[] {2, 6, 8, -10, 3}));
        assertEquals(206847684, FindOutlier.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindOutlier.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
}
