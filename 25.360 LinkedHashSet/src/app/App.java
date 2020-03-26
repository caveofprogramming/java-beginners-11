package app;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("cherry");
		fruits.add("banana");
		
		for(var fruit: fruits) {
			System.out.println(fruit);
		}
		
		System.out.println(fruits.contains("cherry"));
	}

}
