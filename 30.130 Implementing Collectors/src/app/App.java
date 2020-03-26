package app;

import java.util.ArrayList;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		var result = Stream.of("one", "two", "three", "four")
				.collect(
						()-> new ArrayList<String>(),
						(list, item) -> list.add(item),
						(list1, list2) -> list1.addAll(list2)
						);
		
		System.out.println(result);
	}

}
