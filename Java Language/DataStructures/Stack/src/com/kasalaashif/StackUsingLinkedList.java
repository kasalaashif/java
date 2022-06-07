package com.kasalaashif;
public class StackUsingLinkedList<dataType extends Comparable<dataType>> implements Stack<dataType>
{
    private Node root;
    private int count;
    @Override
    public dataType peek()
    {
        return (dataType) this.root.getData();
    }

    @Override
    public int size()
    {
        return this.count;
    }

    @Override
    public void pop()
    {
        if(this.root == null)
        {
            return;
        }
        else
        {
            System.out.println("Top Most element is being removed:" + this.root.getData());
            this.root = this.root.getNextNode();
            this.count--;
        }

    }

    @Override
    public boolean isEmpty()
    {
        return this.root == null;
    }

    public void push(dataType data) {

        if(this.root==null)
        {
            Node newNode = new Node(data);
            this.root = newNode;
            this.count++;
        }
        else
        {
            Node newNode = new Node<>(data);
            newNode.setNextNode(this.root);
            this.root=newNode;
            this.count++;
        }
    }

    @Override
    public void traverseStack() {
        if(this.root == null)
        {
            System.out.println();
            return;
        }
        else
        {
            traverseStackHelper(this.root, this.count);
        }
    }

    private void traverseStackHelper(Node node, int count) {
        if(node == null)
        {
            System.out.println();
            return;
        }
        else
        {
            System.out.print(node.getData() + "-->");
            traverseStackHelper(node.getNextNode(), count--);
        }
    }
}
