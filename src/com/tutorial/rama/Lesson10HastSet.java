package com.tutorial.rama;

import java.util.*;

public class Lesson10HastSet {

	public static void main(String[] args) {
		
		String[] things = {"eraser", "pencil", "scale", "tin", "pencil", "book"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		// Output
		// [eraser, pencil, scale, tin, pencil, book] 
		
		//To REMOVE DUPLICATES from the list, use HashSet
		// i.e, It has removed "pencil" from the list
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
		System.out.println();
		// Output
		// [eraser, book, tin, scale, pencil] 
		
	}

}
