package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.MultiplesOf3Or5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/514b92a657cdc65150000006

public class MultiplesOf3Or5Test {

    @Test
    public void test10First() {
        assertEquals(23, new MultiplesOf3Or5().solutionFirst(10));
    }

    @Test
    public void test1000First() {
        assertEquals(233168, new MultiplesOf3Or5().solutionFirst(1000));
    }

    @Test
    public void test10() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }

    @Test
    public void test1000() {
        assertEquals(233168, new MultiplesOf3Or5().solution(1000));
    }

}
