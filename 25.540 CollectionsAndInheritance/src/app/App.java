package app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SkillSet extends HashSet<String> {

	private static final long serialVersionUID = 8934080421212885843L;

	public boolean isComplete() {
		return this.contains("programming") && this.contains("teaching");
	}
}

public class App {

	public static void main(String[] args) {
		Map<Integer, SkillSet> map = new HashMap<>();
		
		SkillSet skills1 = new SkillSet();
		
		skills1.add("programming");
		skills1.add("teaching");
		
		map.put(0, skills1);
		
		System.out.println(skills1.isComplete());
		
		for(var entry: map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

	}

}
