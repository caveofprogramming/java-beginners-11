package app;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private String name;
	private Set<Skill> skills;
	private boolean onHoliday = false;
	
	public Person(String name) {
		this.name = name;
		
		skills = new HashSet<>();
	}
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}
	
	public Set<Skill> getSkills() {
		return skills;
	}
	
	public void setOnHoliday(boolean onHoliday) {
		this.onHoliday = onHoliday;
	}
	
	public boolean isOnHoliday() {
		return onHoliday;
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
