package app;

import java.util.List;

public class Rota {
	List<Person> people;

	public Rota(List<Person> people) {
		this.people = people;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(var person: people) {
			sb.append(person);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
