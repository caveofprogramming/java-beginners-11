package application;

import collections.Wrapper;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
	
		Wrapper wrapper = new Wrapper();
		
		Cat cat = new Cat("Joe");
		
		wrapper.set(cat);
		
		Cat retrieved = (Cat)wrapper.get();

		System.out.println(retrieved);
	}

}
