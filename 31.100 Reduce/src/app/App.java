package app;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {

		System.out.println(IntStream.range(0, 5).sum());

		var value = IntStream.range(0, 5).reduce(0, (subtotal, item) -> subtotal + item);

		System.out.println(value);

		IntStream.range(0, 5).reduce((subtotal, item) -> {

			System.out.println(subtotal + ": " + item);

			return subtotal + item;
		});
	}

}
