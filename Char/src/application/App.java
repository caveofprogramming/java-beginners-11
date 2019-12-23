package application;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
				"hope", "despair" };

		Random random = new Random();

		String randomWord = words[random.nextInt(words.length)];
		System.out.println(randomWord);
		
		char c1 = 'w';
		char c2 = randomWord.charAt(0);
		
		System.out.println("First character: " + c2);
		
		if(c1 == c2) {
			System.out.println("Chars match!");
		}
		else {
			System.out.println("Chars don't match.");
		}

	}

}
