package app;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		var fruits1 = new HashSet<String>(Set.of("apple", "banana", "cherry", "pear"));
		var fruits2 = new HashSet<String>(Set.of("raspberry", "apple", "blackberry", "cherry"));
		
		var onlyInFruits1 = new HashSet<String>(fruits1);
		onlyInFruits1.removeAll(fruits2);
		
		onlyInFruits1.forEach(System.out::println);
		
	}

}
