package solution;

import java.util.HashSet;
import java.util.Set;

public class VitalSkillSet extends HashSet<String> {
	private static final long serialVersionUID = 1L;
	
	private Set<String> vitalSkills = Set.of("reception", "programming", "management");
	
	public boolean isComplete() {
		
		for(var vitalSkill: vitalSkills) {
			if(!this.contains(vitalSkill)) {
				return false;
			}
		}
		
		return true;
	}
	
	public String toString() {
		return super.toString();
	}

}
