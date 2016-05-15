package com.tutorial.rama;

import java.util.*;

public class Lesson7CollectionFrequencyDisjoint {

	public static void main(String[] args) {
		String[] things = {"scale", "eraser", "pencil", "scale"};
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(things));
		
		String[] moreThings = {"tin", "can", "book"};
		LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(moreThings));
		
		//Frequency displays the no.of occurrence of the item in the collection 
		System.out.println("No. of scale in the list : " + Collections.frequency(list1, "scale"));
		//Output 
		//No. of scale in the list : 2
		
		//Disjoint compares two collection(list) - for common elements
		System.out.println("No common elements : " + Collections.disjoint(list1, list2));
		//Output 
		//No common elements : true

	}

}
