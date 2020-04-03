package app;

import java.util.HashSet;

class Creature {
	public int id;
	public String name;

	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		return true;
	}
	
	

}

public class App {

	public static void main(String[] args) {
		
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "mouse"));
		creatures.add(new Creature(1, "cat"));
		creatures.add(new Creature(0, "mongoose"));
		creatures.add(new Creature(3, "dog"));
		
		creatures.forEach(System.out::println);
	}

}
