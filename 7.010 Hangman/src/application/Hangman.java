package application;

public class Hangman {
	
	private boolean running = true;
	
	public void run() {
		
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while(running);
	}
	
	private void checkUserInput() {
		System.out.println("checkUserInput");
		
	}

	private void getUserInput() {
		System.out.println("getUserInput");
		
	}

	void displayWord() {
		System.out.println("displayWord");
	}
}
