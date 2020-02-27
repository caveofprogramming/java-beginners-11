package app;

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

	public static void main(String[] args) {

		String text = "Hello; how are you? It is very windy/rainy today! George's feet are cold.";
		
		String[] words = text.split("[^a-zA-Z]+");
		
		for(var word: words) {
			
			if(word.length() < 2) {
				continue;
			}
			
			System.out.println(word.toLowerCase());
		}

	}

}
