package com.kasalaashif;

public interface Stack<dataType>
{
    void pop();
    void push(dataType data);
    dataType peek();
    int size();
    boolean isEmpty();
    void traverseStack();
}
