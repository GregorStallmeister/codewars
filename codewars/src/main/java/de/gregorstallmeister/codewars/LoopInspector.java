package de.gregorstallmeister.codewars;


import de.gregorstallmeister.codewars.neededClasses.Node;

import java.util.ArrayList;

public class LoopInspector {
    // Rank 71
    public int loopSize(Node node) {
        ArrayList<Node> nodes = new ArrayList<>();
        Node currNode = node;
        nodes.add(currNode);

        while (!nodes.contains(currNode.getNext())) {
            nodes.add(currNode.getNext());
            currNode = currNode.getNext();
        }

        for (int i = nodes.size() - 2; i > -1; i--) {
            if (currNode.getNext() == nodes.get(i)) {
                return nodes.size() - i;
            }
        }

        return 1;
    }
}
