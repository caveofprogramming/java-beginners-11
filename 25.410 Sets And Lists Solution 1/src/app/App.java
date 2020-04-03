package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		loadWords(words1984File);
		loadWords(wordsAnimalFarm);
	}
	
	
	public static SortedSet<String> loadWords(File file) throws FileNotFoundException, IOException {
		
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(var br = new BufferedReader(new FileReader(file))) {
			
			String line;
			
			while((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				
				for(var word: words) {
					wordSet.add(word.toLowerCase());
				}
			}
		}
		
		return null;
	}
}
