package app;

import java.util.ArrayList;
import java.util.List;

class Person implements Comparable<Person> {
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

		List<Person> people = new ArrayList<>(List.of(new Person("Mary"), new Person("Simon"), new Person("Joe")));
		
		people.sort(Person::compareTo);
		
		people.forEach(System.out::println);
		
		System.out.println();
		
		List<String> strings = new ArrayList<>(List.of("Apple", "orange", "banana", "Pear"));
		
		strings.sort(String::compareToIgnoreCase);
		
		strings.forEach(System.out::println);
		
		
	}

}
