package app;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	private static String[][] peopleSkills = { 
 			{ "Oliver", "programming", "electronics" },
			{ "Jake", "reception", "engineering" },
			{ "Amelia", "programming", "reception", "electronics", "management" },
			{ "Noah", "management", "electronics" }, 
			{ "James", "programming", "management", "electronics" },
			{ "Margaret", "engineering", "electronics", "programming", "reception" }, 
			{ "Emma", "programming" },
			{ "Jack", "engineering", "electronics", "programming" }, 
			{ "Mary", "engineering", "electronics" },
	};

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		for(var row: peopleSkills) {
			var name = row[0];
			
			var person = new Person(name);
			
			for(var i = 1; i < row.length; i++) {
				
				var skill = row[i];
				person.addSkill(Skill.valueOf(skill.toUpperCase()));
			}
			
			people.add(person);
			
		}
		
		people.forEach(System.out::println);
	}

}
