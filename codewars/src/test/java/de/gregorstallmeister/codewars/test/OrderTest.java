package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.*;

import de.gregorstallmeister.codewars.Order;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

public class OrderTest {
    @Test
    public void test1First() {
        assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2First() {
        assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3First() {
        assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
    }

    @Test
    public void test1Second() {
        assertThat(Order.orderSecond("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2Second() {
        assertThat(Order.orderSecond("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3Second() {
        assertThat("Empty input should return empty string", Order.orderSecond(""), equalTo(""));
    }

    @Test
    public void test1() {
        assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
    }
}
