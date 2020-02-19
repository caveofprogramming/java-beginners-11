package application;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}

public class App {

	public static void main(String[] args) {
		
		var people = new ArrayList<Person>();
		
		people.add(new Person("Joe"));
		people.add(new Person("Pip"));
		people.add(new Person("Estella"));
		people.add(new Person("Biddy"));
		
		Collections.sort(people);
		
		people.forEach(System.out::println);

	}

}
