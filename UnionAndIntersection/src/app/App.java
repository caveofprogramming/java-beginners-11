package app;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		var fruits1 = new HashSet<String>(Set.of("apple", "banana", "cherry", "pear"));
		var fruits2 = new HashSet<String>(Set.of("raspberry", "apple", "blackberry", "cherry"));
		
		var union = new HashSet<String>(fruits1);
		union.addAll(fruits2);
		
		union.forEach(System.out::println);
		
		System.out.println();
		
		var intersection = new HashSet<String>(fruits1);
		intersection.retainAll(fruits2);
		
		intersection.forEach(System.out::println);
	}

}
