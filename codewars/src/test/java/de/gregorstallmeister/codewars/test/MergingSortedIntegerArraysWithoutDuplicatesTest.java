package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.MergingSortedIntegerArraysWithoutDuplicates;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

// https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java

public class MergingSortedIntegerArraysWithoutDuplicatesTest {
    @Test
    public void basicTestFirst() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergingSortedIntegerArraysWithoutDuplicates.mergeArraysFirst(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergingSortedIntegerArraysWithoutDuplicates.mergeArraysFirst(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }

    @Test
    public void basicTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergingSortedIntegerArraysWithoutDuplicates.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergingSortedIntegerArraysWithoutDuplicates.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}
