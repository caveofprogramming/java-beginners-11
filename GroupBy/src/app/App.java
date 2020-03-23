package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class App {

	public static void main(String[] args) throws IOException {

		// Using streams:
		// Load a text file.
		// Create a map of all the words in the text file,
		// where the keys in the map are words
		// and the values are a count of the number of times each word occurs in the
		// file.

		// @formatter:off
		
		var wordcount = Files
			.lines(Paths.get("greatexpectations.txt"))
			.map(s -> s.split("[^a-zA-Z]"))
			.map(Arrays::asList)
			.flatMap(l -> l.stream())
			.filter(s -> !s.isBlank())
			.map(String::toLowerCase)
			.collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting())
			);


		var wordList = wordcount
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue((v1,v2)->v2.compareTo(v1)))
				.collect(
					Collectors.toList()
				);
		// @formatter:on

		for (int i = 0; i < wordList.size(); i++) {

			if (i % 7 == 0) {
				System.out.println();
			}

			var entry = wordList.get(i);

			System.out.printf("%15s: %-5d", entry.getKey(), entry.getValue());
		}

	}

}
