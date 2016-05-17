package com.tutorial.rama;

import java.util.*;

public class Lesson14Part1Threads implements Runnable {

	//Loading and watching - power of threads
	
	String name;
	int time;
	Random random = new Random();
	
	public Lesson14Part1Threads(String name) {
		this.name = name;
		this.time = random.nextInt(9999);
	}

	public void run() {
		try {
			System.out.printf("%S is sleeping for %d\n", name , time);
			Thread.sleep(time);
			System.out.printf("%S is done\n", name);
		} catch(Exception e) {}
	}

	//Refer Class Lesson14ThreadsCall
}
