package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.WhoLikesIt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

public class WhoLikesItTest {
    @Test
    public void staticTestsFirst() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesItFirst());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesItFirst("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesItFirst("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesItFirst("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesItFirst("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
