package application;

import java.util.Random;

public class GuessWord {
	
	private String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
			"hope", "despair" };
	
	private String guess;
	
	private Random random = new Random();
	
	public GuessWord() {
		guess = words[random.nextInt(words.length)];
	}

	public String toString() {
		return guess;
	}
}
