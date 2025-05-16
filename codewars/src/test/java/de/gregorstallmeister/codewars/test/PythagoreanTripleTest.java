package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.PythagoreanTriple;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java

public class PythagoreanTripleTest{
    static int[] p1={3,4,5};
    static int[] p2={3,5,7};
    static int[] p3={13,12,5};
    static int[] p4={100,3,999};

    PythagoreanTriple pT = new PythagoreanTriple();

    @Test
    public void validTripleFirst() {
        assertEquals(1, pT.pythagoreanTripleFirst(p1));
    }

    @Test
    public void validTriple3First() {
        assertEquals(1, pT.pythagoreanTripleFirst(p3));
    }

    @Test
    public void invalidTripleFirst(){
        assertEquals(0,pT.pythagoreanTripleFirst(p2));
    }

    @Test
    public void invalidTriple4First(){
        assertEquals(0,pT.pythagoreanTripleFirst(p4));
    }

    @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
    }

    @Test
    public void validTriple3() {
        assertEquals(1, pT.pythagoreanTriple(p3));
    }

    @Test
    public void invalidTriple(){
        assertEquals(0,pT.pythagoreanTriple(p2));
    }

    @Test
    public void invalidTriple4(){
        assertEquals(0,pT.pythagoreanTriple(p4));
    }
}
