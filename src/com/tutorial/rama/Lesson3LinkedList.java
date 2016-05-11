package com.tutorial.rama;

import java.util.*;

public class Lesson3LinkedList {

	public static void main(String[] args) {
		String[] things = {"eraser", "pencil", "scale", "tin", "can", "book"};
		List<String> list1 = new LinkedList<String>();
		//Add strings to list
		for(String thing:things)
			list1.add(thing);
		
		String[] moreThings = {"pencil", "sharpener", "colorpens"};
		List<String> list2 = new LinkedList<String>();
		//Add strings to list
		for(String thing:moreThings)
			list2.add(thing);
		
		printList(list1);
		removeFromList(list1, 1, 2);
		System.out.println();
		printList(list1);
		System.out.println();
		reverseList(list1);
		
		/*Sample Output:
		 * 
		 * eraser pencil scale tin can book
		 * eraser scale tin can book
		 * book can tin scale eraser
		 * 	 
		 * */
	}

	private static void reverseList(List<String> list) {
		// ListIterator has the size of list
		ListIterator<String> iterator = list.listIterator(list.size());
		// Reverse the list by iterating previous items
		while(iterator.hasPrevious())
			System.out.printf(" %s", iterator.previous());
	}

	private static void removeFromList(List<String> list, int from, int to) {
		//Take a portion of it and clear it
		list.subList(from, to).clear();
	}

	private static void printList(List<String> list1) {
		for(String s: list1)
		System.out.printf(" %s", s);
	}

}
