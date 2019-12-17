package application;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		String[] animals = {"dog", "bear", "horse"};
		
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
	}

}
