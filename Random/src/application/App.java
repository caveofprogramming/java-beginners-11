package application;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		String[] words = { "times", "worst", "wisdom", "foolishness", "belief", "incredulity", "light", "darkness",
				"hope", "despair" };

		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			int randomInt = random.nextInt(5);
			System.out.print(randomInt);
			System.out.print(" ");
		}

	}

}
