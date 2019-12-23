package application;

import java.util.Arrays;
import java.util.Random;

public class GuessWord {
	private String randomWord;
	
	private String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
			"hope", "despair"};
	
	private char[] guesses;
	
	public GuessWord() {
		Random random = new Random();
		
		randomWord = words[random.nextInt(words.length)];
		guesses = new char[randomWord.length()];
		Arrays.fill(guesses, '_');
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(char c: guesses) {
			sb.append(c);
			sb.append(' ');
		}
		
		return sb.toString();
	}
	
	public boolean check(char guessLetter) {
		boolean correct = false;
		
		for(int i=0; i < guesses.length; i++) {
			char c = randomWord.charAt(i);
			
			if(c == guessLetter) {
				guesses[i] = c;
				correct = true;
			}
		}
		
		return correct;
	}
	
	public boolean completed() {
		
		for(char c: guesses) {
			if(c == '_') {
				return false;
			}
		}
		
		return true;
	}
}
