package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.ZywOo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java

public class ZywOoTest {
    @Test
    public void testSomethingFirst() {
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"wolf"}));
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheepFirst(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheepFirst(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheepFirst(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheepFirst(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheepFirst(new String[]{"sheep", "sheep", "wolf"}));
    }

    @Test
    public void testSomethingSecond() {
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"wolf"}));
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheepSecond(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheepSecond(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheepSecond(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheepSecond(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheepSecond(new String[]{"sheep", "sheep", "wolf"}));
    }

    @Test
    public void testSomething() {
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"wolf"}));
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}
