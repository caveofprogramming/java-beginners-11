package application;

import java.util.ArrayList;
import java.util.List;

/*
 * Create a method that accepts a List of Number, or a list of any sub-type.
 * Number is the superclass of the number classes in Java.
 * 
 * Make the method add a large number of numbers to the list; e.g. 100,000 integers.
 * 
 * Add code in the method that times how long it takes to add the numbers.
 * Use System.currentTimeMillis() to get the time in milliseconds before and after adding the 
 * numbers to the list, to work out how long it took to add them.
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		timeOperations(numbers);
	
	}
	
	public static void timeOperations(List<Integer> numbers) {
		
		for(int i = 0; i < 100_000; i++) {
			numbers.add(i);
		}
	}

}
