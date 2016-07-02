package com.tutorial.rama.Collections;

import java.util.ArrayList;

public class ArrayListTutorial {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Adding list
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		//Retrieving single value
		System.out.println(numbers.get(0));
		
		System.out.println("\nIterate through arrays : Method 1");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("\nIterate through arrays : Method 2");
		for(int number: numbers) {
			System.out.println(number);
		}
	}

}
