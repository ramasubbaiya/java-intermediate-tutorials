package com.tutorial.rama;

import java.util.*;

public class Lesson5CollectionSorting {

	public static void main(String[] args) {
		String[] things = {"eraser", "pencil", "scale", "tin", "can", "book"};
		List<String> list = Arrays.asList(things);
		System.out.printf(" %s", list);
		System.out.println();
				
		// Sorting in Ascending order
		Collections.sort(list);
		System.out.printf(" %s", list);
		System.out.println();
		
		// Sorting in Descending order
		Collections.reverse(list);
		System.out.printf(" %s", list);
		System.out.println();

		//Replacing the items inside the list
		Collections.replaceAll(list, "tin", "big_box");
		System.out.printf(" %s", list);
		
		
		/*Sample Output
		 * 
		 *   [eraser, pencil, scale, tin, can, book]
		 *   [book, can, eraser, pencil, scale, tin]
		 *   [tin, scale, pencil, eraser, can, book]
		 *   [big_box, scale, pencil, eraser, can, book]
		 *   			 
		 * */
		
	}

}
