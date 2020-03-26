package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final int NUM_VALUES = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[NUM_VALUES];
		
		
		for(int i=0; i<NUM_VALUES; i++) {
			System.out.print("Enter a number: ");
			
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("You entered: ");
		
		int total = 0;
		
		for(int i=0; i<NUM_VALUES; i++) {
			System.out.println(numbers[i]);
			
			total += numbers[i];
		}
		
		System.out.println("Total: " + total);

	}

}
