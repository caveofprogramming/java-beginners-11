package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

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
				groupingBy(identity(), counting())
			);


		var wordList = wordcount
				.entrySet()
				.stream()
				.sorted(comparingByValue((v1,v2)->v2.compareTo(v1)))
				.collect(
					toList()
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
