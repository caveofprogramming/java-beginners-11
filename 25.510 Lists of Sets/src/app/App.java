package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		List<Set<String>> exerciseRota = new ArrayList<>();
		
		exerciseRota.add(new HashSet<String>(Set.of("pushups", "pullups", "leg raises")));
		exerciseRota.add(new HashSet<String>(Set.of("walking", "star jumps", "cycling")));
		
		for(var day: exerciseRota) {
			for(var exercise: day) {
				System.out.print(exercise);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		Set<String> exercises = exerciseRota.get(0);
		
		for(var exercise: exercises) {
			System.out.println(exercise);
		}
	
	}

}
