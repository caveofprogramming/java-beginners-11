package app;

import static app.Skill.MANAGEMENT;
import static app.Skill.PROGRAMMING;
import static app.Skill.RECEPTION;

import java.util.HashSet;
import java.util.Set;

public class VitalSkillSet extends HashSet<Skill> {
	private static final long serialVersionUID = 1L;
	
	private Set<Skill> vitalSkills = Set.of(PROGRAMMING, MANAGEMENT, RECEPTION);
	
	public boolean isComplete() {
		
		for(var skill: vitalSkills) {
			if(!contains(skill)) {
				return false;
			}
		}
		
		return true;
	}

}
