package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	private GuessWord guess;

	private Scanner scanner = new Scanner(System.in);

	private int mistakes = 0;

	private final int MAX_MISTAKES = 5;

	public void newGame() {
		guess = new GuessWord();
	}

	public void displayWord() {
		System.out.println("\n\n");
		System.out.println(guess);
		System.out.println();
	}

	public void getInput() {
		System.out.printf("\nTries remaining: %d\n", MAX_MISTAKES - mistakes);
		System.out.print("\nGuess a letter: ");
		String attempt = scanner.nextLine();

		if (!guess.check(attempt.charAt(0))) {
			mistakes++;
		}
	}

	public boolean isRunning() {
		if (mistakes == MAX_MISTAKES) {
			System.out.println("\nYOU LOSE!\n");
			return false;
		}

		if (guess.completed()) {
			System.out.println("\nWINNER!");
			return false;
		}

		return true;
	}

	public void end() {
		scanner.close();
	}

}
