package app;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		
		Stream.of(1, 2, 3).forEach(System.out::println);
		
		System.out.println();
		
		Stream.generate(()->"hello").limit(3).forEach(System.out::println);
		
		System.out.println();
		
		List.of(1, 2, 3).stream().forEach(System.out::print);
	}

}
