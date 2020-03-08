package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Rota {
	private List<Person> people;
	private List<Set<Person>> days = new ArrayList<>();
	
	private int peopleListPosition = 0;

	public Rota(List<Person> people) {
		this.people = people;
	}
	
	public void nextWeek() {
		
		
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
