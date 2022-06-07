package com.kasalaashif;

public class Main
{
    public static void main(String[] args)
    {
        Stack stack = new StackUsingLinkedList();
        stack.push("Ashif");
        stack.push("Ashraf");
        stack.push("Chanu");
        stack.push("Ammu");
        System.out.println(stack.size());
        stack.traverseStack();
        stack.pop();
        stack.traverseStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}
