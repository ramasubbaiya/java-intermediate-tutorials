package com.tutorial.rama.Collections;

import java.util.LinkedList;

public class LinkedListTutorial {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();

		// Adding list
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		// Retrieving single value
		System.out.println(numbers.get(0));

		// Looping through array
		System.out.println("\nIterate through arrays : Method 1");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("\nIterate through arrays : Method 2");
		for (int number : numbers) {
			System.out.println(number);
		}

		numbers.remove(numbers.size() - 1);

		numbers.remove(0);
	}

}
