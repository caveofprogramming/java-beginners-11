package application;

import collections.Pair;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
	
		Pair<Integer, Cat> pair = new Pair<>(5, new Cat("Tiddles"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
	}

}
