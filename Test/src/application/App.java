package application;

public class App {

	public static void main(String[] args) {
		
		Hangman hangman = new Hangman();
		hangman.newGame();

		do {	
			hangman.displayWord();
			hangman.getInput();
		} while(hangman.isRunning());

		hangman.end();
	}

}
