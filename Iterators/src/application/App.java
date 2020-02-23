package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 6, 4));
		
		/*
		 * for(var n: numbers) { numbers.remove(n); }
		 */
		
		for(var it = numbers.listIterator(); it.hasNext(); ) {
			var number = it.next();
			
			System.out.println(number);
		}

	}

}
