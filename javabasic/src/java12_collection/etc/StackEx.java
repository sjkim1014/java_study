package java12_collection.etc;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack stack = new Stack();		
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		System.out.println(stack);
		System.out.println("Å©±â : "+stack.size());
		
		System.out.println("\n-------");
		System.out.println("pop : "+stack.pop());
		System.out.println(stack);
		
		System.out.println("\n-------");
		System.out.println("peek : "+stack.peek());
		System.out.println(stack);
	}
}
