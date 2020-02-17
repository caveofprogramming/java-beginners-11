package application;

import collections.Array;
import collections.Util;
import heirarchy.Cat;
import heirarchy.Creature;

/* 
 * Create a Util class with a static method that accepts two Array<Mammal> arguments. 
 * Call the method "copy".
 * The method should copy all the items from one Array<Mammal> to the other.
 * 
 * Assume the destination Array<Mammal> is large enough to hold all the copied items.
 * 
 * Can you make this method more flexible using the 'extends' and 'super' keywords
 * in your type specifications?
 *
 */

public class App {

	public static void main(String[] args) {

		Array<Cat> source = new Array<>(2);
		source.add(new Cat("cat"));
		source.add(new Cat("dog"));
		
		Array<Creature> dest = new Array<>(2);
		
		Util.copy(source, dest);
		
		for(int i = 0; i < dest.size(); i++) {
			System.out.println(dest.get(i));
		}
	}
	
}
