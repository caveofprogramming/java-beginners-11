package application;

import java.util.ArrayList;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		
		var people = new ArrayList<Person>();
		
		people.add(new Person("Joe"));
		people.add(new Person("Pip"));
		people.add(new Person("Estella"));
		people.add(new Person("Biddy"));
		
		people.set(1, new Person("Phillip"));
		
		people.forEach(System.out::println);
		
		System.out.println();

	}

}
