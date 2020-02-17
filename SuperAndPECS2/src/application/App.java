package application;

import collections.Array;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {

		Array<Mammal> mammals = new Array<>(3);
		mammals.add(new Mammal("dolphin"));
		mammals.add(new Mammal("sheep"));
		
		Array<Cat> cats = new Array<>(2);
		cats.add(new Cat("Bertie"));
		cats.add(new Cat("Tiddles"));
		
		feedAll(mammals);
		feedAll(cats);
		
		System.out.println();
		addMammal(mammals);
		feedAll(mammals);
		
		System.out.println();
		
		Array<Creature> creatures = new Array<>(5);
		creatures.add(new Creature("worm"));
		
		addMammal(creatures);
		
		for(int i = 0; i < creatures.size(); i++) {
			System.out.println(creatures.get(i));
		}
	}
	
	// PECS = producer extends, consumer super

	private static void feedAll(Array<? extends Mammal> mammals) {
		for(int i = 0; i < mammals.size(); i++) {
			Mammal m = mammals.get(i);
			m.feed();
		}
	}
	
	private static void addMammal(Array<? super Mammal> mammals) {
		mammals.add(new Mammal("giraffe"));
	}
}
