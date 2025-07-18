package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.Greed;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

// https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java

public class GreedTest {
    @Test
    public void shouldBeWorthless() {
        assertEquals(0, Greed.greedy(new int[]{2, 3, 4, 6, 2}));
    }

    @Test
    public void shouldValueTriplets() {
        assertEquals(400, Greed.greedy(new int[]{4, 4, 4, 3, 3}));
    }

    @Test
    public void shouldValueMixedSets() {
        assertEquals(450, Greed.greedy(new int[]{2, 4, 4, 5, 4}));
    }

    @Test
    public void shouldValueOnesAndFive() {
        assertEquals(250, Greed.greedy(new int[]{5, 1, 3, 4, 1}));
    }

    @Test
    public void shouldValueTripletAndAdditionalOne() {
        assertEquals(1100, Greed.greedy(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    public void shouldValueTripletAndFive() {
        assertEquals(450, Greed.greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
