package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
		
		for(var it = numbers.iterator(); it.hasNext(); ) {
			var number = it.next();
			
			System.out.println(number);
		}

	}

}
