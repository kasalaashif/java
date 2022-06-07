package com.kasalaashif;

public class LinkedList<dataType extends Comparable<dataType>> implements List<dataType>{
    private Node root;
    private int count;

    @Override
    public void insert(dataType data) {
        if(this.root == null)
        {
            this.count++;
            Node newNode = new Node(data);
            this.root = newNode;
        }
        else
        {
            this.count++;
            Node newNode = new Node(data);
            newNode.setNextNode(this.root);
            this.root= newNode;
        }

    }

    @Override
    public void remove(dataType data)
    {
        if(this.root==null)
        {
            return;
        }
        else if (this.root.getData().compareTo(data) !=0)
        {
            removeHelper(data, this.root, this.root.getNextNode());
        }
        else {
            this.count--;
            this.root= this.root.getNextNode();
        }
    }

    private void removeHelper(dataType data, Node previousNode, Node presentNode)
    {
        if(presentNode.getData().compareTo(data) == 0)
        {
            this.count--;
            previousNode.setNextNode(presentNode.getNextNode());
            presentNode.setNextNode(null);
        }
        else
        {
            removeHelper(data, presentNode, presentNode.getNextNode());
        }
    }

    @Override
    public void traverse() {

        if(this.root ==null)
        {
            return;
        }
        else
        {
            traverseHelper(this.root);
        }

    }

    private void traverseHelper(Node node) {
        if(node == null)
        {
            System.out.println();
            return;
        }
        else
        {
            System.out.print(node.getData()+ "-->");
            traverseHelper(node.getNextNode());
        }
    }

    @Override
    public void size() {
        System.out.println(this.count);
    }
}
