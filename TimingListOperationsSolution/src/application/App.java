package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Create a method that accepts a List of Integer
 * 
 * Make the method add a large number of numbers to the list; e.g. 100,000 integers.
 * 
 * Add code in the method that times how long it takes to add the numbers.
 * Use System.currentTimeMillis() to get the time in milliseconds before and after adding the 
 * numbers to the list, to work out how long it took to add them.
 * 
 * Instead of adding items to the end of the list, try adding them to the start of the list.
 * You can do this with add(0, element).
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		timeOperations(arrayList, "ArrayList");
		timeOperations(linkedList, "LinkedList");
	}
	
	private static void timeOperations(List<Integer> list, String name) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100_000; i++) {
			list.add(0, i);
		}
		
		long duration = System.currentTimeMillis() - start;
		
		System.out.println(name + ": " + duration);
	}
	
	
}

