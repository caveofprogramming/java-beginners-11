package app;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		IntStream.range(1, 13).forEach(n -> {
			IntStream.range(1, 13).forEach(k -> {
				int value = n * k;
				
				System.out.printf("%4d", value);
			});
			
			System.out.println();
		});

	}

}
