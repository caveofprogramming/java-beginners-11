package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean gotCodeword = false;
		
		for(;;) {
			System.out.print(" > ");
			
			String input = scanner.nextLine();
			
			if(input.equals("quit")) {
				break;
			}
			else if(input.equals("volcano")) {
				gotCodeword = true;
			}
		}
		
		scanner.close();
		
		if(gotCodeword) {
			System.out.println("Codeword entered.");
		}
		else {
			System.out.println("No codeword detected.");
		}
	}

}


