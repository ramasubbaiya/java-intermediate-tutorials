package com.tutorial.rama.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorial {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		testSet("Hash Set", hashSet);
		testSet("Sorted Set", treeSet);

	}

	private static void testSet(String setType, Set<String> set) {
		set.add("dog");
		set.add("eagle");
		set.add("zebra");
		set.add("mouse");
		set.add("bear");
		
		System.out.println("\nSet Type : " + setType);
		
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println(" Is Apple in the list : " + set.contains("apple"));
		System.out.println(" Is Bear in the list : " + set.contains("bear"));
	}
	
	/*Hints : 
	 * 
	 * Set doesn't have get() method :/
	 * 
	 * */
		

}
