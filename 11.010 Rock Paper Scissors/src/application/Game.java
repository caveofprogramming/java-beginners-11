package application;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private int score = 0;
	private Random random = new Random();
	private GameObject[] objects = { new Rock(), new Paper(), new Scissors() };
	private Scanner scanner = new Scanner(System.in);

	public void run() {

		for (int i = 0; i < 3; i++) {
			GameObject randomObject = pickObject();
			GameObject playerObject = getPlayerObject();
			
			int compare = playerObject.compare(randomObject);
			String compareText = playerObject.compareText(randomObject);
			
			String[] outcomes = {"lose", "draw", "win"};
			
			System.out.println(playerObject + " -- " + randomObject);
			System.out.println(compareText);
			System.out.println(outcomes[compare + 1]);
			System.out.println();
			
			score += compare;
		}

		scanner.close();
		
		if(score > 0) {
			System.out.println("Game over: you win!");
		}
		else if(score < 0) {
			System.out.println("Game over: you lose.");
		}
		else {
			System.out.println("Game over: it's a draw");
		}
		
	}

	public GameObject getPlayerObject() {

		do {
			System.out.println("Enter your choice (0. rock, 1. paper, 2. scissors): ");

			int input = scanner.nextInt();
			
			if(input >= 0 && input <= 2) {
				return objects[input];
			}

		} while (true);
	}

	private GameObject pickObject() {
		return objects[random.nextInt(objects.length)];

	}
}
