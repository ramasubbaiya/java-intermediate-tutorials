package com.tutorial.rama;

public class Lesson18Part2MethodOverriding extends Lesson18Part1MethodOverriding{
	public void show() {
		System.out.println("Show method in Child class");
	}
	
	public static void main(String[] args) {
		//Parent Class
		Lesson18Part1MethodOverriding objPart1 = new Lesson18Part1MethodOverriding();
		objPart1.show();
		//Child Class
		Lesson18Part2MethodOverriding objPart2 = new Lesson18Part2MethodOverriding();
		objPart2.show();
		
		/*Output
		 	Show method in Parent class
			Show method in Child class
		 */
	}
}
