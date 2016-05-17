package com.tutorial.rama;

public class Lesson15Part2AbstractDemo {

	public static void main(String[] args) {
		/* Following is not allowed and would raise error */
		// Cannot instantiate the type(abstract)

		// Lesson15Part1AbstractClass e = new Lesson15Part1AbstractClass("George
		// W.", "Houston, TX", 43);
		// e.mailCheck();
		
		System.out.println("\n Call mailCheck using Employee reference--");

		Lesson15Part3AbstractClassExtended s = new Lesson15Part3AbstractClassExtended("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Lesson15Part1AbstractClass e = new Lesson15Part3AbstractClassExtended("John Adams", "Boston, MA", 2, 2400.00);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();

		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}

}
