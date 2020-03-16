package app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		App app = new App();

		var numbers = new ArrayList<>(List.of(1, 6, 4, 7, 3, 6, 3));

		numbers.removeIf(app::filter);
		numbers.replaceAll(app::map);

		numbers.forEach(app::print);
	}

	private boolean filter(int n) {
		return n < 5;
	}

	private int map(int value) {
		return value * 2;
	}
	
	private void print(int value) {
		System.out.println("Got value: " + value);
	}

}
