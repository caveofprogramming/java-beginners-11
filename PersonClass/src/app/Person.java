package app;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private String name;
	private Set<Skill> skills;
	
	public Person(String name) {
		this.name = name;
		
		skills = new HashSet<>();
	}
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(": ");
		
		for(var skill: skills) {
			sb.append(skill);
			sb.append("\t");
		}
		
		return sb.toString();
	}
}
