package com.tutorial.rama;

public class Lesson16Part2AbstractMethodImplementation extends Lesson16Part1AbstractMethod {
	private double salary; // Annual salary

	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return "rama";
	}


}
