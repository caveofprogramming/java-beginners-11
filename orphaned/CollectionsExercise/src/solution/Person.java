package solution;

import java.util.Set;
import java.util.TreeSet;

public class Person {
	private String name;
	private Set<String> skills = new TreeSet<String>();
	private boolean onHoliday = false;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void addSkills(String... skillList) {
		for(var s: skillList) {
			skills.add(s);
		}
	}
	
	public boolean hasSkill(String skill) {
		return skills.contains(skill);
	}
	
	public boolean isOnHoliday() {
		return onHoliday;
	}
	
	public void setOnHoliday(boolean status) {
		this.onHoliday = status;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(": ");
		
		for(var s: skills) {
			sb.append(s);
			sb.append(" ");
		}
		
		return sb.toString();
	}

	public Set<String> getSkills() {
		return skills;
	}
}
