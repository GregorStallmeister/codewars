package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;

import de.gregorstallmeister.codewars.WeightSort;
import org.junit.Test;

// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java

public class WeightSortTest {
    @Test
    public void BasicTestsFirst() {
        System.out.println("****** Basic Tests ******");
        assertEquals("2000 103 123 4444 99", WeightSort.orderWeightFirst("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeightFirst("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
