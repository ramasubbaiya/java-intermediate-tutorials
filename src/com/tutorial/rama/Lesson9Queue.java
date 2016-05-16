package com.tutorial.rama;

import java.util.*;

public class Lesson9Queue {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.offer("first");
		queue.offer("second");
		queue.offer("third");
		
		System.out.printf("%s ", queue);
		System.out.println();
		// Output
		// [first, second, third] 
		
		//Head of the queue 
		System.out.printf("%s ", queue.peek());
		System.out.println();
		// Output
		// first
		
		//Remove the head of the queue, here it removes first element
		queue.poll();
		
		//Print the queue after removal
		System.out.printf("%s ", queue);
		// Output
		// [second, third] 
	}

}
