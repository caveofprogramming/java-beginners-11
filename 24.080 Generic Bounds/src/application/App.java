package application;

import collections.Array;
import heirarchy.Cat;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {

		Array<Mammal> mammals = new Array<>(2);
		mammals.add(new Mammal("dolphin"));
		mammals.add(new Mammal("sheep"));
		
		Array<Cat> cats = new Array<>(2);
		cats.add(new Cat("Bertie"));
		cats.add(new Cat("Tiddles"));
		
		feedAll(mammals);
		feedAll(cats);
	}

	public static void feedAll(Array<? extends Mammal> mammals) {
		for(int i = 0; i < mammals.size(); i++) {
			Mammal m = mammals.get(i);
			m.feed();
		}
	}

}
