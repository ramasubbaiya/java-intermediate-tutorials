package com.tutorial.rama;

public class Lesson21Part2Encapsulation {

	public static void main(String args[]) {
		Lesson21Part1Encapsulation encap = new Lesson21Part1Encapsulation();
		encap.setName("Rama");
		encap.setAge(21);
		encap.setIdNum("100r");

		System.out.print("Name : " + encap.getName() + "\nAge : " + encap.getAge() + "\nID : " + encap.getIdNum());
	}
}
