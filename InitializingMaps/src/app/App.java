package app;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class App {

	public static void main(String[] args) {

		// @formatter:off
		HashMap<Integer, String> months1 = new HashMap<>(Map.of(
				3, "Mar", 
				4, "Apr"
		));

		HashMap<Integer, String> months2 = new HashMap<>(Map.ofEntries(
				entry(5, "May"), 
				entry(6, "Jun"),
				entry(7, "Jul")
		));
		// @formatter:on
		
		months1.put(1, "Jan");
		months1.put(2, "Feb");

		months1.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

		System.out.println();

		months2.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

	}

}
