package application;

import java.util.Random;

public class RandomWord {
	private String[] words = { "father", "family", "infant", "tongue", "nothing", "longer", "explicit", "called",
			"authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "inscription" };
	
	private String chosenWord;
	private Random random = new Random();
	private char[] characters;
	
	public RandomWord() {
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();

		for(char c: characters) {
			sb.append(c == '\u0000' ? '_': c);
			sb.append(' ');
		}
		
		return sb.toString();
	}

	public void addGuess(char c) {
		// Fill in c in the character array
		// wherever it's found
		// in the random word
		for(int i=0; i<chosenWord.length(); i++) {
			if(c == chosenWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
}
