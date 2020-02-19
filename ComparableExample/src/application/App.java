package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {
	private String name;
	private Integer age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ": " + age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person other) {
		
		int compareName = name.compareTo(other.name);
		
		if(compareName == 0) {
			return age.compareTo(other.age);
		}
		
		return compareName;
	}
}


public class App {

	public static void main(String[] args) {
		
		var people = new ArrayList<Person>();
		
		people.add(new Person("Joe", 40));
		people.add(new Person("Joe", 23));
		people.add(new Person("Joe", 35));
		people.add(new Person("Pip", 21));
		people.add(new Person("Estella", 39));
		people.add(new Person("Estella", 20));
		people.add(new Person("Estella", 65));
		people.add(new Person("Biddy", 19));
		
		Collections.sort(people);
	
		people.forEach(System.out::println);

	}

}
