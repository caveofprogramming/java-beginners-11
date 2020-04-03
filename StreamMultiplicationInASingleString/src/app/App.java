package app;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		
		// @formatter:off
		
		var table = IntStream
			.range(1, 13)
			.mapToObj(n -> {
				
				return IntStream
					.range(1, 13)
					.map(k -> k * n)
					.mapToObj(Integer::toString)
					.map(s -> String.format("%4s", s))
					.collect(Collectors.joining());
			})
			.collect(Collectors.joining("\n"));
		
		
		// @formatter:on
		
		System.out.println(table);

	}

}
