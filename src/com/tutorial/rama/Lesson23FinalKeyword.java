package com.tutorial.rama;

//This file has errors for illustration purpose only
public class Lesson23FinalKeyword {

	public static void main(String[] args) {
		
		//Once its assigned it cannot be changed
		final int a = 5;
		
		//The below line gives an error as the int a is already assigned
		a = 6;
		
		//So now it is unassigned
		final int b;
		//It can be assigned after this
		b = 10;
		//The variable is already assigned, so it gives an error
		b = 12;
		
		System.out.println("Final int variable a : "+a);
		System.out.println("Final int variable b : "+b);
		
	}

}

class A {
	public final void show() {
		System.out.println("Hay, I am from A");
	}
}

final class B extends A {
	
	//Below line gives an error as it cannot override the method of its super class
	public void show() {
		System.out.println("Hay, I am from B");
	}
}

//Below class gives an error as it cannot inherit a class(final)
class C extends B {
	
}