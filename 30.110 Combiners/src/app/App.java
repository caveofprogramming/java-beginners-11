package app;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		var result = Stream.of("hello", "how", "are", "you").parallel().reduce("",
				(partial, item) -> partial + " " + item, (partial1, partial2) -> partial1 + partial2);

		System.out.println(result);
	}

}
