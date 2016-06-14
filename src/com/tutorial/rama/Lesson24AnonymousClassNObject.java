package com.tutorial.rama;

public class Lesson24AnonymousClassNObject {

	public static void main(String[] args) {
		//This is called anonymous object
		//Because it doesn't have object reference and for each anonymous object it creates a new instance
		new Anonymous().i = 5;
		new Anonymous().display();
		
		//This is called Anonymous class
		Sydney sydney = new Sydney() {
			public void place() {
				System.out.println("Sydney is a place");
			}
		};
		
	}

}

interface Sydney {
	void place();
}

class Anonymous {
	int i;
	public void display() {
		System.out.println("value of i " + i);
	}
}