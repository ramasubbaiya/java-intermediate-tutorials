package com.tutorial.rama;

import java.util.Arrays;
import java.util.LinkedList;

public class Lesson4ListToArray {

	public static void main(String[] args) {
		String[] things = {"eraser", "pencil", "scale", "tin", "can", "book"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(things));
		
		list.add("box");
		list.addFirst("First_Apple_pie");
		list.addLast("Last_Apple_pie");
		
		//Convert back to an array
		//to convert object to string --use-- new String[list.size()]
		things = list.toArray(new String[list.size()]);
		
		for(String s: things) 
			System.out.printf(" %s", s);
		
		// Sample output:
		// First_Apple_pie eraser pencil scale tin can book box Last_Apple_pie
	}

}
