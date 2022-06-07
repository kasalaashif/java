package com.kasalaashif.StackArray;

public class StackArray<dataType>
{
    private dataType[] data;
    private int noOfElements;

    StackArray()
    {
        data = (dataType[]) new Object[1];
    }


    public void pop() {
        if(this.noOfElements == 0)
        {
            System.out.println("Nothing to Pop");
            return;
        }
        else
        {
            System.out.println(this.data[--this.noOfElements]);
            if(this.noOfElements == this.data.length/4)
            {
                resize(this.data.length/2);
            }
        }

    }

    private void resize(int size) {
        dataType[] dataCopy = (dataType[]) new Object[size];
        for(int i=0; i < this.noOfElements; i++)
        {
            dataCopy[i] = this.data[i];
        }
        this.data = dataCopy;
    }


    public void push(dataType data) {
        if(this.noOfElements == this.data.length)
        {
            resize(2*this.data.length);
        }
        this.data[this.noOfElements++] = data;
    }

    public dataType peek() {
        return this.data[this.noOfElements];
    }

    public int size() {
        return this.noOfElements;
    }

    public boolean isEmpty() {
        return this.noOfElements ==0;
    }

    public void traverseStack()
    {
            traverseStackHelper(this.noOfElements);
    }

    private void traverseStackHelper(int noOfElements) {
        if(noOfElements == 0)
        {
            System.out.println();
            return;
        }
        else
        {
            System.out.print(this.data[--noOfElements] + "--> ");
            traverseStackHelper(noOfElements);
        }
    }
}
