package application;

import java.util.Scanner;

/**
 * 
 * Create a program that asks the user to enter a command.
 * 
 * If they hit the return key without entering anything, ask them again to enter
 * a command.
 * 
 * If they enter 'start' or 'START', regardless of capitalisation, print
 * 'Machine starting ....'
 * 
 * If they enter 'stop', regardless of capitalisation, print 'Machine stopping
 * ....'.
 * 
 * If they enter 'quit', print 'Exiting ....' and quit the program.
 * 
 * Otherwise print 'Unrecognised command'.
 * 
 * Ask them to enter a command repeatedly until they stop the program by
 * entering 'quit'.
 * 
 * Hints:
 * 
 * Use the string length to determine if they have entered nothing.
 * 
 * To check user input, use "if".
 * 
 */

public class App {
	public static void main(String[] args) {
		final String START = "start";
		final String STOP = "stop";
		final String QUIT = "quit";

		Scanner scanner = new Scanner(System.in);

		boolean running = true;

		do {
			System.out.print("Enter a command > ");
			String input = scanner.nextLine();

			if (input.length() == 0) {
				continue;
			}

			if (input.equalsIgnoreCase(START)) {
				System.out.println("Machine starting ...");
			} else if (input.equalsIgnoreCase(STOP)) {
				System.out.println("Machine stopping ...");
			} else if (input.equalsIgnoreCase(QUIT)) {
				running = false;
			} else {
				System.out.println("Unrecognised command.");
			}

		} while (running);

		scanner.close();
	}
}
