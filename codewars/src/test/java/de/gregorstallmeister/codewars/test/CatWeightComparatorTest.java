package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.CatWeightComparator;
import de.gregorstallmeister.codewars.CatWeightComparatorSecond;
import de.gregorstallmeister.codewars.CatWeightComparatorFirst;
import de.gregorstallmeister.codewars.neededClasses.Cat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

// https://www.codewars.com/kata/54abfb827207c6355e00035b

public class CatWeightComparatorTest {
    @Test
    public void testSimpleCaseFirst()
    {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new CatWeightComparatorFirst());

        assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
        assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
    }

    @Test
    public void testSimpleCaseSecond()
    {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new CatWeightComparatorSecond());

        assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
        assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
    }

    @Test
    public void testSimpleCase()
    {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new CatWeightComparator());

        assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
        assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
    }
}
