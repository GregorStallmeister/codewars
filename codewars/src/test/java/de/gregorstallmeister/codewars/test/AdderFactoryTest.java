package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.AdderFactory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/54a6d39a478d8e07e4000b69/train/java

public class AdderFactoryTest {
    @Test
    public void testMakeFunctionWithoutIjTipp() throws Exception {
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                5, AdderFactory.createWithoutIjTipp(1).applyAsInt(4));
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                6, AdderFactory.createWithoutIjTipp(2).applyAsInt(4));
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                17, AdderFactory.createWithoutIjTipp(12).applyAsInt(5));
    }

    @Test
    public void testMakeFunction() throws Exception {
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                5, AdderFactory.create(1).applyAsInt(4));
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                6, AdderFactory.create(2).applyAsInt(4));
        assertEquals("Created add 1 function; gave it 4; did not get 5 back",
                17, AdderFactory.create(12).applyAsInt(5));
    }
}
