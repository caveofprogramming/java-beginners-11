

import java.util.Arrays;
import java.util.Random;

public class GuessWord {
	
	private String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
			"hope", "despair" };
	
	private String randomWord;
	private char[] guessedCharacters;
	
	private Random random = new Random();
	
	public GuessWord() {
		randomWord = words[random.nextInt(words.length)];
		guessedCharacters = new char[randomWord.length()];
		
		Arrays.fill(guessedCharacters, '_');
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(char c: guessedCharacters) {
			sb.append(c);
			sb.append(' ');
		}
		
		return sb.toString();
	}
}
