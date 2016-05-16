package com.tutorial.rama;

public class GenericMethodImplementation {

	public static void main(String[] args) {
		
		Integer[] intRay = {9, 8, 7, 6};
		Character[] charRay = {'r', 'a', 'm', 'a'};
		String[] stringRay = {"eraser", "pencil", "scale", "tin", "book"};
		
		
		printMe(intRay);
		printMe(charRay);
		printMe(stringRay);
	}
	
	// Simple Generic Methods
	public static <T> void printMe(T[] args) {
		for(T t: args)
			System.out.printf("%s ", t);
		System.out.println();
	}

}
