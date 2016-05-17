package com.tutorial.rama;

public class Lesson14ThreadsCall {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Lesson14Threads("one"));
		Thread thread2 = new Thread(new Lesson14Threads("two"));
		Thread thread3 = new Thread(new Lesson14Threads("three"));
		Thread thread4 = new Thread(new Lesson14Threads("four"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
