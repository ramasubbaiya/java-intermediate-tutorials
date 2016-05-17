package com.tutorial.rama;

public class Lesson19ConstructorOverloading {
	int i;
	
	public Lesson19ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	
	public Lesson19ConstructorOverloading(int i) {
		this.i = i;
		System.out.println("Constructor parameter" + i);
	}

}
