package game;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	@SuppressWarnings("unused") // Added temporarily to suppress 'not used' warning
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};
	
	public void run() {
		System.out.println("Game running");
		
		System.out.println(new Scissors());
	}
}
