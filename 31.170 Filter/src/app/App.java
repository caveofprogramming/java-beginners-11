package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) throws IOException  {

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
				TreeMap<String, Integer>::new, 
				App::accumulate,
				App::combine
			);
		
		// @formatter:on
		
		wordcount.forEach((word, count)->{
			System.out.println(word + ": " + count);
		});
	}
	
	private static void accumulate(Map<String, Integer> map, String word) {
		Integer count = map.get(word);
		
		if(count == null) {
			map.put(word, 1);
		}
		else {
			map.put(word, count + 1);
		}
	}
	
	private static void combine(Map<String, Integer> map1, Map<String, Integer> map2) {
		
		map2.forEach((word, count2)->{
			
			Integer count1 = map1.get(word);
			
			if(count1 == null) {
				map1.put(word, count2);
			}
			else {
				map1.put(word, count1 + count2);
			}
		});
		
	}

}
