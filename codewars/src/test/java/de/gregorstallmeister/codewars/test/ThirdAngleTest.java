package de.gregorstallmeister.codewars.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import de.gregorstallmeister.codewars.ThirdAngle;

// https://www.codewars.com/kata/5a023c426975981341000014/train/java

public class ThirdAngleTest {
    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45,12));
        assertEquals(70, ThirdAngle.otherAngle(50,60));
    }
}
