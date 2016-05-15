package com.tutorial.rama;

import java.util.*;

public class Lesson8StacksPushPop {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("item 1");
		stack.push("item 2");
		
		//Print the stack
		System.out.println(stack);
		// Output
		// [item 1, item 2]
		
		// Check the top of the stack
		System.out.println(stack.peek());
		// Output
		// item 2
		
		//Remove the object that is in th top of the stack 
		stack.pop();  
		System.out.println(stack);
		// Output
		// [item 1]
	}

}
