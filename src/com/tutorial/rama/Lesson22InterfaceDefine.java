package com.tutorial.rama;

public class Lesson22InterfaceDefine implements Lesson22InterfaceDeclare {
	
	//Define the method that is implemented form interface
	public void show() {
		System.out.println("Defining show method");
	}
	
	public void display() {
		System.out.println("I am display method");
	}
	
	public static void main(String[] args) {
		// Interface obj = new ImplementedClass();
		Lesson22InterfaceDeclare inter = new Lesson22InterfaceDefine();
		inter.show();
		
		// Display method is not a object of Interface so it shows an error
		// inter.display();
	}

}
