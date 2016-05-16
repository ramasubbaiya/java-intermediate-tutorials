package com.tutorial.rama;

public class Lesson11GenericMethods {

	public static void main(String[] args) {
		// Generic Method: you can eliminate overload methods
		
		Integer[] intRay = {9, 8, 7, 6};
		Character[] charRay = {'r', 'a', 'm', 'a'};
		
		printMe(intRay);
		printMe(charRay);
		
		// Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
	}

	private static void printMe(Character[] charRay) {
		for(Character c: charRay)
			System.out.printf("%s ", c);
		System.out.println();
	}

	private static void printMe(Integer[] intRay) {
		for(Integer i: intRay)
			System.out.printf("%s ", i);
		System.out.println();
	}
	
	// generic method printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }
   
   /*Output
    	9 8 7 6 
		r a m a 
		Array integerArray contains:
		1 2 3 4 5 
		
		Array doubleArray contains:
		1.1 2.2 3.3 4.4 
		
		Array characterArray contains:
		H E L L O 
    */

}
