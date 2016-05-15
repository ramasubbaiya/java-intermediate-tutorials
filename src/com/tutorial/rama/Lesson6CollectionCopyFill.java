package com.tutorial.rama;

import java.util.*;

public class Lesson6CollectionCopyFill {

	public static void main(String[] args) {
		Character[] letter = {'a', 'b', 'c'};
		List<Character> l = Arrays.asList(letter);
		System.out.println("List is  : ");
		output(l);
		
		//For List copy - create a new character array
		Character[] newLetter = new Character[3];
		List<Character> newL = Arrays.asList(newLetter);
		
		//List copy
		Collections.copy(newL, l);
		System.out.println("Copied List is  : ");
		output(newL);
		
		//Fill Collections with something 
		Collections.fill(l, 'x');
		System.out.println("After filling the list : ");
		output(l);
	}

	private static void output(List<Character> l) {
		for(Character c: l)
			System.out.println(c);
	}
	
	/*	Output :
	 * 
		 List is  : 
			a
			b
			c
			Copied List is  : 
			a
			b
			c
			After filling the list : 
			x
			x
			x
	*/

}
