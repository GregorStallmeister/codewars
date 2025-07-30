package de.gregorstallmeister.codewars.neededClasses;

public class Node {

    public static Node createChain(int lnDang, int lnLoop) {
        Node startNode = new Node();
        Node currNode = startNode;

        for (int i = 0; i < lnDang; i++) {
            Node newNode = new Node();
            currNode.setNext(newNode);
            currNode = newNode;
        }

        Node firstInLoop = currNode;

        for (int j = 0; j < lnLoop; j++) {
            Node newNode = new Node();
            currNode.setNext(newNode);
            currNode = newNode;
        }

        currNode.setNext(firstInLoop);

        return startNode;
    }

    private Node nextNode;

    public Node getNext() {
        return nextNode;
    }

    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }
}
