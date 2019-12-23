package application;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
				"hope", "despair" };

		Random random = new Random();

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			sb.append(words[random.nextInt(words.length)]);
		}

		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello").append(" ").append(" how are you?");
		sb2.append("I am OK");
		sb2.append(50);
		sb2.append('c');
		sb2.append('a');
		
		System.out.println(sb2.toString());
	}

}
