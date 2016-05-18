package com.tutorial.rama;

// This is child class of Lesson20Part1Polymorphism
// Sorry for the confusing class names 
public class Lesson20Part2Polymorphism extends Lesson20Part1Polymorphism {
	public void shape() {
		System.out.println("This is a sub-poly shape");
	}

	public void color() {
		System.out.println("This is a sub-poly color");
	}

	public static void main(String[] args) {
		// ParentClass object = new ChildClass();
		Lesson20Part1Polymorphism poly = new Lesson20Part2Polymorphism();
		poly.shape();
		poly.color();
	}

	/* Output 
	  	This is a sub-poly shape 
	 	This is a sub-poly color
	 */

}
