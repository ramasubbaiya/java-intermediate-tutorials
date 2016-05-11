package com.tutorial.rama;

public class Lesson1Recursion {
	public static void main(String[] args) {
		System.out.println(factorial(5));	
	}
	
	public static long factorial(long n) {
		if(n <= 1) 
			return 1;
		else 
			return n * factorial(n-1);
	}
	
	/*	Sample Output	
	 * factorial(5) 
			   factorial(4) 
			      factorial(3) 
			         factorial(2) 
			            factorial(1) 
			               return 1 
			            return 2*1 = 2 
			         return 3*2 = 6 
			      return 4*6 = 24 
			   return 5*24 = 120    */	
}
