package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.DRoot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

public class DRootTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
}
