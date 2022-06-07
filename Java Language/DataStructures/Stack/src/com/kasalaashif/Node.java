package com.kasalaashif;

public class Node<dataType extends Comparable<dataType>>
{
    private dataType data;
    private Node nextNode;
    Node(dataType data)
    {
        this.data = data;
    }

    public dataType getData() {
        return data;
    }
    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setData(dataType data) {
        this.data = data;
    }

    public void setNextNode(Node node)
    {
        this.nextNode = node;
    }
}
