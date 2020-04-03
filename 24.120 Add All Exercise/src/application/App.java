package application;

import collections.Array;
import heirarchy.Cat;
import heirarchy.Mammal;

/* 
 *
 *
 */

public class App {

	public static void main(String[] args) {
		Array<Cat> source = new Array<Cat>(2);
		source.add(new Cat("Tiddles"));
		source.add(new Cat("Bertie"));
		
		Array<Mammal> dest = new Array<Mammal>(2);
		dest.addAll(source);
		
		for(int i = 0; i < dest.size(); i++) {
			System.out.println(dest.get(i));
		}
	}
	
}
