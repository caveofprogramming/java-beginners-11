package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rota {

	private List<Person> people = new ArrayList<>();

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	private List<Set<Person>> week = new ArrayList<>();
	
	private int personIndex = 0;

	public Rota() {
		
	}

	private void populateWeek() {

		week.clear();

		for (int day = 0; day < Day.values().length; day++) {
			populateDay(day);
		}
	}

	private void populateDay(int index) {
		
		Set<Person> workingPeople = new HashSet<>();
		VitalSkillSet vitalSkills = new VitalSkillSet();
		
		int personCount = 0;
		
		while(!vitalSkills.isComplete() && personCount < people.size()) {
			
			Person person = people.get(personIndex++);
			
			if(personIndex == people.size()) {
				personIndex = 0;
			}
			
			if(person.isOnHoliday()) {
				continue;
			}
			
			workingPeople.add(person);
			
			vitalSkills.addAll(person.getSkills());
			
			personCount++;
		}

		week.add(workingPeople);
	}

	public void addPerson(Person person) {
		people.add(person);
	}

	public void nextWeek() {
		populateWeek();
	}
	
	public String toString() {
		var sb = new StringBuilder();
		
		for(int i = 0; i < Day.values().length; i++) {
			var dayName = Day.values()[i];
			
			sb.append("\n");
			sb.append(dayName);
			sb.append("\n");
			
			var peopleSet = week.get(i);
			
			for(var p: peopleSet) {
				sb.append(p);
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
}