package de.gregorstallmeister.codewars.test;

import static org.junit.Assert.assertEquals;

import de.gregorstallmeister.codewars.GhostCode;
import org.junit.Test;

// https://www.codewars.com/kata/570184a95594a091150000a0

public class GhostCodeTest {
    @Test
    public void exampleTests() {
        String result= GhostCode.helloName("Javatlacati");
        //                    message                                     expected               actual
        assertEquals("Hello my name is Javatlacati is not "+result,"Hello my name is Javatlacati",result);
    }
}
