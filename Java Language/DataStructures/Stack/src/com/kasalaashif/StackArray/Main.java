package com.kasalaashif.StackArray;

public class Main
{
    public static void main(String[] args)
    {
        StackArray stack = new StackArray();
        stack.push("Ashif");
        stack.push("Ashraf");
        stack.push("Chanu");
        stack.push("Ammu");
        stack.traverseStack();
        stack.pop();
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Stack Empty or Not: " + stack.isEmpty());
        System.out.println("Top Most element in the stack: " + stack.peek());
        stack.traverseStack();
    }
}