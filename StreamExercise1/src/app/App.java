package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException  {
		
		// Obtain a text file from Project Gutenberg (or anywhere else).
		// Using streams, create a list of all words in the text file.
		
		// Tips:
		// First read the file using the Files class.
		// Split each line into an array of strings (words)
		// Transform the arrays of strings into lists of strings: use Arrays.asList()
		// Flatten the data structure
		// Collect the final stream together into a list.
		
		// @formatter:off
		
		var words = Files
			.lines(Paths.get("greatexpectations.txt"))
			.map(s -> s.split("[^a-zA-Z]"))
			.map(a -> Arrays.asList(a))
			.flatMap(l -> l.stream())
			.collect(Collectors.toList());
		
		// @formatter:on
		
		int count = 0;
		for(var word: words) {
			System.out.printf("%-10s", word);
			
			if(count++ % 10 == 0) {
				System.out.println();
			}
		}

	}

}
