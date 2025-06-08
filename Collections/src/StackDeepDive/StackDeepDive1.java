package StackDeepDive;

import java.util.Stack;

public class StackDeepDive1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//Crud Creation
		stack.push("Ashif");
		stack.push("Ashraf");
		stack.push("Ashika");
		stack.push("Ammaji");
		
		System.out.println(stack);
		
		// cRud Read Operations
		for(String name : stack)
			System.out.println(name);
		
		System.out.println("Iterating over Stack");
		for(int i = stack.size() - 1; i >=0; i--) {
			System.out.println(stack.get(i));
		}
		
		
		//pop, IsEmpty, peek, Size
		
		String topElement = stack.pop();
		System.out.println(stack);
		System.out.println(topElement);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());


		
		

	}

}
