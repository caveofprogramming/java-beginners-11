package application;

import java.util.HashSet;

/*
 * HashSet store unique items; don't allow duplicates
 * HashSet is unordered
 * The contains() method is fast and efficient
 * 
 */

class Creature {
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Creature other = (Creature) obj;
		if (id != other.id)
			return false;
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
		
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "cat"));
		creatures.add(new Creature(1, "dog"));
		creatures.add(new Creature(2, "rat"));
		creatures.add(new Creature(2, "rat"));
		creatures.add(new Creature(3, "elephant"));
		
		System.out.println(creatures.contains(new Creature(0, "cat")));
		
		for(var c: creatures) {
			System.out.println(c);
		}
		

	}

}
