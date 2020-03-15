package app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// Remove all items outside the range 0-10.
		// Add 100 to each item.
		// Display the resulting list.
		
		var list = new ArrayList<>(List.of(1, 5, 9, 1000, 3, 6, -20, 4));
		
		list.removeIf(n -> n < 0 || n > 10);
		list.replaceAll(n -> n + 100);
		
		list.forEach(System.out::println);

	}

}
