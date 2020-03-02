package app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}

public class App {

	public static void main(String[] args) {

		// HashMap, LinkedHashMap, TreeMap
		
		// Make 'Person' the key
		
		// method that accepts a map, adds items to the map, prints the map
		
		HashMap<Person, Integer> people1 = new HashMap<>();
		LinkedHashMap<Person, Integer> people2 = new LinkedHashMap<>();
		TreeMap<Person, Integer> people3 = new TreeMap<>();
		
		addItemsAndPrint(people1);
		System.out.println();
		addItemsAndPrint(people2);
		System.out.println();
		addItemsAndPrint(people3);
		
		System.out.println();
		System.out.println(people3.get(new Person("lkjlkjl")));
		System.out.println(people3.containsKey(new Person("lkjlkjl")));
	}
	
	
	public static void addItemsAndPrint(Map<Person, Integer> map) {
		
		map.put(new Person("Joe"), 45);
		map.put(new Person("Pip"), 20);
		map.put(new Person("Joe"), 40);
		map.put(new Person("Estella"), 19);
		
		map.forEach((k,v)->System.out.println(k + ": " + v));
	}
}
