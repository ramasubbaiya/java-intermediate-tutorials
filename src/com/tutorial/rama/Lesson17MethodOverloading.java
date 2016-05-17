package com.tutorial.rama;

public class Lesson17MethodOverloading {

	public void show() {
		System.out.println("show method empty paramter");
	}

	public void show(int x) {
		System.out.println("show method with an interger : " + x);
	}

	public static void main(String[] args) {
		Lesson17MethodOverloading obj = new Lesson17MethodOverloading();
		obj.show();
		obj.show(10);
	}

	/* Refer Lesson 11: Generic Methods */
}
