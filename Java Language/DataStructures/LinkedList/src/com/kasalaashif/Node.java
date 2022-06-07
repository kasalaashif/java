package com.kasalaashif;

public class Node<dataType extends Comparable<dataType>> {
    private dataType data;
    private Node nextNode;

    Node(dataType data)
    {
        this.data=data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public dataType getData() {
        return data;
    }

    public void setData(dataType data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
