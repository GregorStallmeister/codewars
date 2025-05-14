package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.MultipleOfIndex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java

public class MultipleOfIndexTest {

    @Test
    void basicTestsFirst() {
        assertArrayEquals(new int[]{-6, 32, 25}, MultipleOfIndex.multipleOfIndexFirst(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, MultipleOfIndex.multipleOfIndexFirst(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, MultipleOfIndex.multipleOfIndexFirst(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, MultipleOfIndex.multipleOfIndexFirst(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));
        assertArrayEquals(new int[]{38, -44, -99}, MultipleOfIndex.multipleOfIndexFirst(new int[]{28,38,-44,-99,-13,-54,77,-51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, MultipleOfIndex.multipleOfIndexFirst(new int[]{-1,-49,-1,67,8,-60,39,35}));
        assertArrayEquals(new int[]{0, 2, 6}, MultipleOfIndex.multipleOfIndexFirst(new int[]{0, 2, 3, 6, 9}));
    }

    @Test
    void basicTestsSecond() {
        assertArrayEquals(new int[]{-6, 32, 25}, MultipleOfIndex.multipleOfIndexSecond(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, MultipleOfIndex.multipleOfIndexSecond(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, MultipleOfIndex.multipleOfIndexSecond(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, MultipleOfIndex.multipleOfIndexSecond(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));
        assertArrayEquals(new int[]{38, -44, -99}, MultipleOfIndex.multipleOfIndexSecond(new int[]{28,38,-44,-99,-13,-54,77,-51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, MultipleOfIndex.multipleOfIndexSecond(new int[]{-1,-49,-1,67,8,-60,39,35}));
        assertArrayEquals(new int[]{0, 2, 6}, MultipleOfIndex.multipleOfIndexSecond(new int[]{0, 2, 3, 6, 9}));
    }

    @Test
    void basicTestsThird() {
        assertArrayEquals(new int[]{-6, 32, 25}, MultipleOfIndex.multipleOfIndexThird(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, MultipleOfIndex.multipleOfIndexThird(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, MultipleOfIndex.multipleOfIndexThird(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, MultipleOfIndex.multipleOfIndexThird(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));
        assertArrayEquals(new int[]{38, -44, -99}, MultipleOfIndex.multipleOfIndexThird(new int[]{28,38,-44,-99,-13,-54,77,-51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, MultipleOfIndex.multipleOfIndexThird(new int[]{-1,-49,-1,67,8,-60,39,35}));
        assertArrayEquals(new int[]{0, 2, 6}, MultipleOfIndex.multipleOfIndexThird(new int[]{0, 2, 3, 6, 9}));
    }

    @Test
    void basicTests() {
        assertArrayEquals(new int[]{-6, 32, 25}, MultipleOfIndex.multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, MultipleOfIndex.multipleOfIndex(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, MultipleOfIndex.multipleOfIndex(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, MultipleOfIndex.multipleOfIndex(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));
        assertArrayEquals(new int[]{38, -44, -99}, MultipleOfIndex.multipleOfIndex(new int[]{28,38,-44,-99,-13,-54,77,-51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, MultipleOfIndex.multipleOfIndex(new int[]{-1,-49,-1,67,8,-60,39,35}));
        assertArrayEquals(new int[]{0, 2, 6}, MultipleOfIndex.multipleOfIndex(new int[]{0, 2, 3, 6, 9}));
    }
}
