package app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 6, 4, 6, 4, 8, 6));
		
		numbers.stream().forEach(n -> {
			System.out.println(n);
		});
	}

}
