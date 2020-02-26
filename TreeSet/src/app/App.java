package app;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		return name.compareTo(other.name);
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
}

public class App {
	public static void main(String[] args) {
		TreeSet<Person> people = new TreeSet<Person>();
		
		people.add(new Person("Ethel"));
		people.add(new Person("Albert"));
		people.add(new Person("Sally"));
		people.add(new Person("Mel"));
		
		for(var person: people) {
			System.out.println(person);
		}
	}
}
