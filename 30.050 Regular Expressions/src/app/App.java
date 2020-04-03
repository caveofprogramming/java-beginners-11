package app;

public class App {

	public static void main(String[] args) {
		
		String line = "This is a sentence. It contains some words, and some punctuation.";
		
		String[] words = line.split("[^a-zA-Z]");
		
		
		for(var word: words) {
			System.out.println(word);
		}
	}

}
