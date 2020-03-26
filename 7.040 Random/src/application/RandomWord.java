package application;

import java.util.Random;

public class RandomWord {
	private String[] words = { "father", "family", "infant", "tongue", "nothing", "longer", "explicit", "called",
			"authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "inscription" };
	
	private String chosenWord;
	private Random random = new Random();
	
	public RandomWord() {
		chosenWord = words[random.nextInt(words.length)];
	}
	
	public String toString() {
		return chosenWord;
	}
}
