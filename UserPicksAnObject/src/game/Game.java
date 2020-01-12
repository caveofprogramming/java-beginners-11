package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};
	
	public void run() {
		System.out.println("Game running");
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		GameObject obj1 = objects[random.nextInt(objects.length)];
		
		System.out.println("Choose an object.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.print("> ");
		
		int objectIndex = scanner.nextInt();
		GameObject obj2 = objects[objectIndex - 1];
		
		
		System.out.println("You chose: " + obj2);
		System.out.println("The computer chose: " + obj1);
		
		System.out.println(obj2.compareTo(obj1));
		
		scanner.close();
	}
}
