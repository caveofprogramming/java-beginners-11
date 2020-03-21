package app;

import java.util.List;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person: " + name;
	}

}

public class App {

	public static void main(String[] args) {
		var names = List.of("Olivia", "Emma", "Charlotte", "Sophia", "Aria", "Ava", "Chloe", "Zoey", "Abigail", "Amilia");
		
		// @formatter:off
		names
			.stream()
			.map(Person::new)
			.forEach(System.out::println);
		
		// @formatter:on
	}

}
