package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeMap;

class IncrementMap extends TreeMap<String, Integer> {
	private static final long serialVersionUID = 1L;

	public void putOrAdd(String key, Integer value) {

		Integer count = get(key);

		if (count == null) {
			put(key, value);
		} else {
			put(key, value + count);
		}
	}
}

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
				IncrementMap::new, 
				App::accumulate,
				App::combine
			);
		
		// @formatter:on

		wordcount.forEach((word, count) -> {
			System.out.println(word + ": " + count);
		});
	}

	private static void accumulate(IncrementMap map, String word) {
		map.putOrAdd(word, 1);
	}

	private static void combine(IncrementMap map1, IncrementMap map2) {
		map2.forEach((word, count2) -> {
			map1.putOrAdd(word, count2);
		});
	}

}
