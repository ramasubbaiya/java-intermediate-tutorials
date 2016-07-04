package com.tutorial.rama.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSpeedTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		doSpeedTest("Array-List", arrayList);
		doSpeedTest("Linked-List", linkedList);
	}

	private static void doSpeedTest(String listType, List<Integer> list) {
		
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*		
		 * Try adding at the start
		 *
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		*/
		
		/*		
		 * Try adding at the end
		 *  
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size()-1, i);
		}*/
		
		/* 
		 * Try adding at the middle/elsewhere
		 * 
		for (int i = 0; i < 1E5; i++) {
			list.add(7000, i);
		}*/
		
		long end = System.currentTimeMillis();
		
		long timeTaken = (end - start);
		
		System.out.println(listType + " took " + timeTaken + "ms to finish the operation");
		
	}
}

	/* 	Array-List  :  Best for retrieving data
					   Adding at the near-end/end of the array
				
		Linked-List :  Best for inserting and deleting the data
					   Not good for retrieving the data
	*
	*/