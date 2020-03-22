package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) throws IOException  {

		// Using streams:
		// Load a text file.
		// Create a map of all the words in the text file,
		// where the keys in the map are words
		// and the values are a count of the number of times each word occurs in the
		// file.

		var map1 = new HashMap<String, Integer>(Map.of("one", 1, "two", 1));
		var map2 = new HashMap<String, Integer>(Map.of("two", 1, "three", 3, "four", 4));
		
		
		combine(map1, map2);
		
		System.out.println(map1);
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
