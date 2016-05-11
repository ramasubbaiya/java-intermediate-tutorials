package com.tutorial.rama;

import java.util.*;

public final class Lesson2Collections {

	public static void main(String[] args) {
		String[] words = {"first", "second", "third", "fourth"};
		List<String> list1 = new ArrayList<>();
		
		//Add array items to list
		for(String word:words){
			list1.add(word);
		}
		
		String[] moreWords = { "third", "fourth"};
		List<String> list2 = new ArrayList<>();
		//Add array items to list
		for(String word:moreWords){
			list2.add(word);
		}
		
		for(int i = 0; i < list1.size(); i++) {
			//To print the list items
			System.out.printf(" %s", list1.get(i));
			//  Expected Output : 
			//  first second third fourth
		}

		editList(list1, list2);
		System.out.println();
		
		//After removing from the list
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf(" %s", list1.get(i));
			//  Expected Output : 
			//  first second
		}
	}

	private static void editList(List<String> l1, List<String> l2) {
		// TODO Auto-generated method stub
		Iterator<String> iterator = l1.iterator(); 
		//Loop through item by item
		while(iterator.hasNext()) {
			if(l2.contains(iterator.next()))
				iterator.remove();
		}		
	}

}
