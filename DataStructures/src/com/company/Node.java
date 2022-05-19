package com.company;

public class Node {
    private String character;
    private Node[] children;
    private boolean leaf;
    Node(String character)
    {
        this.character = character;
        children  = new Node[Constant.ALPHABET_SIZE];
    }
    public Node getChild(int index)
    {
        return children[index];
    }
    public void setChild(int index, Node node)
    {
        children[index] = node;
    }

    public void setLeaf(boolean value) {
         this.leaf = value;
    }
    public boolean getLeaf()
    {
        return this.leaf;
    }
    public String toString()
    {
        return this.character;

    }
}
