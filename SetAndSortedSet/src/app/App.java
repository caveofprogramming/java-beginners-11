package app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Set<Integer> numbers1 = new HashSet<>();
		Set<Integer> numbers2 = new LinkedHashSet<>();
		Set<Integer> numbers3 = new TreeSet<>();
		
		SortedSet<Integer> numbers4 = new TreeSet<>();
	}

}
