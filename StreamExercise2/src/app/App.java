package app;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		// factorial
		// 4! = 4 x 3 x 2 x 1 = 24
		// 3! = 3 x 2 x 1 = 6
		// 5! = 5 x 4 x 3 x 2 x 1 = 120
		
		var factorial = IntStream.range(1, 6).reduce(1, (subtotal, value) -> subtotal * value );
		System.out.println(factorial);
	}

}
