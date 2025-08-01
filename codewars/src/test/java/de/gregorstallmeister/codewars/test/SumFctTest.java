package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;
import java.math.BigInteger;

// https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java

import de.gregorstallmeister.codewars.SumFct;
import org.junit.Test;

public class SumFctTest {
    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
    }
}
