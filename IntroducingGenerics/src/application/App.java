package application;

import collections.Wrapper;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
	
		Wrapper<Cat> wrapper = new Wrapper<>();
		
		Cat cat = new Cat("Joe");
		
		wrapper.set(cat);
		
		Cat retrieved = wrapper.get();

		System.out.println(retrieved);
	}

}
