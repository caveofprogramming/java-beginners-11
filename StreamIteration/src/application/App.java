package application;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 7};
		
		Arrays.stream(numbers).forEach(i -> {
			System.out.println(i);
		});

	}

}
