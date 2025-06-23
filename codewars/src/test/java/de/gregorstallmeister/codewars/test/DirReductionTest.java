package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.DirReduction;
import org.junit.Test;
import static org.junit.Assert.*;

// https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{},
                DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}
