package com.tutorial.rama;

public class Lesson14Part2ThreadsCall {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Lesson14Part1Threads("one"));
		Thread thread2 = new Thread(new Lesson14Part1Threads("two"));
		Thread thread3 = new Thread(new Lesson14Part1Threads("three"));
		Thread thread4 = new Thread(new Lesson14Part1Threads("four"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
