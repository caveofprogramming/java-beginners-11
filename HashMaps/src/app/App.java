package app;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> people = new HashMap<>();
		
		people.put(0, "Mary");
		people.put(1, "Mary");
		people.put(3, "Joe");
		people.put(4, "Fred");
		people.put(4, "Zoltan");
		people.put(10, "Sue");
		
		System.out.println(people.get(4));
		
		String person = people.get(10);
		System.out.println(person);
		
		System.out.println();
		
		people.forEach((k,v)->{
			System.out.println(k + ": " + v);
		});
	}

}
