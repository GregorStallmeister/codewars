package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.LoopInspector;
import de.gregorstallmeister.codewars.neededClasses.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/train/java

public class LoopInspectorTest {
    @Test
    public void loop_size_of_3() {
        Node list = Node.createChain(1, 3);
        int result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 3, result);
    }

    @Test
    public void loop_size_of_29() {
        Node list = Node.createChain(21, 29);
        int result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 29, result);
    }

    @Test
    public void loop_size_of_1087() {
        Node list = Node.createChain(3904, 1087);
        int result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 1087, result);
    }
}
