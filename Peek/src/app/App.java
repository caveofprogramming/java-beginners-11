package app;

import java.util.List;
import java.util.stream.Collectors;

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
		return name;
	}

}

public class App {

	public static void main(String[] args) {
		var names = List.of("Olivia", "Emma", "Charlotte", "Sophia", "Aria", "Ava", "Chloe", "Zoey", "Abigail", "Amilia");
		
		// @formatter:off
		var list = names
			.stream()
			//.peek(s -> System.out.println(s + ": " + s.getClass()))
			.map(Person::new)
			.peek(s -> System.out.println(s + ": " + s.getClass()))
			.collect(Collectors.toList());
		
		System.out.println(list);
		
		// @formatter:on
	}

}
