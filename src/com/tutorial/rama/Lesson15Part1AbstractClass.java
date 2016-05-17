package com.tutorial.rama;

// Create a Abstract class Lesson15Part1AbstractClass 
// This is actually a class name Employee
public abstract class Lesson15Part1AbstractClass {
	private String name;
	private String address;
	private int number;

	public Lesson15Part1AbstractClass(String name, String address, int number)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}
}
