package app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		var numbers = new ArrayList<>(List.of(1, 6, 4, 7, 3, 6, 3));

		numbers.removeIf(App::filter);
		numbers.replaceAll(App::map);

		numbers.forEach(System.out::println);
	}

	private static boolean filter(int n) {
		return n < 5;
	}

	private static int map(int value) {
		return value * 2;
	}

}
