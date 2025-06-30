package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;
import org.junit.Test;

import de.gregorstallmeister.codewars.ProdFib;

// https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/java

public class ProdFibTest {
    @Test
    public void test1First() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProdFib.productFibFirst(4895));
    }
    @Test
    public void test2First() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProdFib.productFibFirst(5895));
    }

    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProdFib.productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProdFib.productFib(5895));
    }
}
