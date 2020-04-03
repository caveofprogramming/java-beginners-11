package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		Fruit fruit1 = new Apple();
		System.out.println(fruit1);
		
		Fruit fruit2 = new Banana();
		System.out.println(fruit2);
	}

}
