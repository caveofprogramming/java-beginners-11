package application;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private int score = 0;
	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);

	public void run() {

		for (int i = 0; i < 3; i++) {
			GameObject randomObject = pickObject();
			GameObject playerObject = getPlayerObject();

			System.out.println(playerObject + " - " + randomObject);
			boolean win = playerObject.beats(randomObject);
	
			if(win) {
				System.out.println(playerObject + " beats " + randomObject);
				System.out.println("win");
				++score;
			}
			else if(playerObject == randomObject) {
				System.out.println("draw");
			}
			else {
				System.out.println(randomObject + " beats " + playerObject);
				System.out.println("lose");
				--score;
			}
			
			System.out.println();
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
				GameObject[] objects = GameObject.values();
				return objects[input];
			}

		} while (true);
	}

	private GameObject pickObject() {
		GameObject[] objects = GameObject.values();
		return objects[random.nextInt(objects.length)];

	}
}
