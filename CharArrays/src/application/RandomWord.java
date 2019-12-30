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
		
		String text = "";
		
		for(char c: characters) {
			if(c == '\u0000') {
				text += '_';
			}
			else {
				text += c;
			}
			
			text += ' ';
		}
		
		return text;
	}
}
