package com.tutorial.rama.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ReverseStringOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) {
			return 1;
		} else if(o1.length() < o2.length()) {
			return -1;
		}
		return 0;
	}
}

class SortBasedOnSecondLetter implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		try {
			if(o1.charAt(1) > o2.charAt(1)) {
				return 1;
			} else if(o1.charAt(1) < o2.charAt(1)) {
				return -1;
			}
		} catch (Exception e) {
			System.out.println(" Letter not found");
		}
		return 0;
	}
}

public class ComparatorTutorial {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		
		animals.add("lion");
		animals.add("tiger");
		animals.add("zebra");
		animals.add("cheeta");
		animals.add("bison");
		animals.add("ape");
		animals.add("Chimpanzee");
		
		Collections.sort(animals, new SortBasedOnSecondLetter());
		
		System.out.println(animals);
		
/*		
 *     Random Brainstorm - Find the int array contains duplicates or not
 * 
 
 
 		int[] arr = new int[]{3,5,6,1,2,1};
		Set<Integer> findDuplicates = new HashSet<>();
		for(int num: arr) {
			findDuplicates.add(num);
		}
		
		System.out.println(findDuplicates.size());
		
		System.out.println(arr.length);
		
		if(findDuplicates.size() != arr.length) {
			System.out.println("Contains Duplicate");
		} else {
			System.out.println("Does not contain duplicate");
		}
		
		
		
		*/

	}

}
