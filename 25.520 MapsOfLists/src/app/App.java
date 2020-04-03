package app;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, List<String>> societies = new HashMap<>();
		
		societies.put(0, new LinkedList<String>(List.of("WH","JH","IU")));
		societies.put(1, new LinkedList<String>(List.of("TY","LK","FG")));
		
		var people1 = societies.get(1);
		
		for(var person: people1) {
			System.out.println(person);
		}
		
		for(var society: societies.entrySet()) {
			var id = society.getKey();
			var people2 = society.getValue();
			
			System.out.print(id + "\t");
			
			for(var person: people2) {
				System.out.print(person);
				System.out.print("\t");
			}
			
			System.out.println();
		}
	}
}


