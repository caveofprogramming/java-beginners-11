package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Pick two large texts. Example: George Orwell, 1984 and Animal Farm.
 * 
 * How many *unique* words are in each of these texts?
 * 
 * What words are only found in 1984?
 * What words are only found in Animal Farm?
 * Print these out.
 * 
 * Print a list of all words that are found in both texts, 
 * sorted in alphabetical order.
 */

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		var words1984File = new File("1984.txt");
		var wordsAnimalFarm = new File("animalfarm.txt");

		var set1984 = loadWords(words1984File);
		var setAnimalFarm = loadWords(wordsAnimalFarm);

		System.out.println("Unique words in 1984: " + set1984.size());
		System.out.println("Unique words in Animal Farm: " + setAnimalFarm.size());
		
		var setOnlyIn1984 = new TreeSet<String>(set1984);
		setOnlyIn1984.removeAll(setAnimalFarm);

		System.out.println("Only in 1984: " + setOnlyIn1984.size() + " words");
		//displayWords(setOnlyIn1984);
		
		var setOnlyInAnimalFarm = new TreeSet<String>(setAnimalFarm);
		setOnlyInAnimalFarm.removeAll(set1984);
		
		System.out.println("Only in Animal Farm: " + setOnlyInAnimalFarm.size() + " words");
		
		var setBoth = new TreeSet<String>(setAnimalFarm);
		setBoth.retainAll(set1984);
		
		System.out.println("In both: " + setBoth.size() + " words");
		
		displayWords(setBoth);

	}

	private static void displayWords(Set<String> words) {

		int index = 0;
		
		for (var word : words) {
			System.out.printf("%-15s ", word);
			
			if(++index % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static SortedSet<String> loadWords(File file) throws FileNotFoundException, IOException {

		TreeSet<String> wordSet = new TreeSet<>();

		try (var br = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");

				for (var word : words) {

					if (word.length() > 1) {
						wordSet.add(word.toLowerCase());
					}
				}
			}
		}

		return wordSet;
	}
}
