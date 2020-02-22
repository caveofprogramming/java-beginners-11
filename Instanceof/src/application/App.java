package application;

class Creature {
	
}

class Cat extends Creature {
	
}

public class App {

	public static void main(String[] args) {
		
		Creature c1 = new Creature();
		Object c2 = new Cat();
		
		System.out.println(c1 instanceof Creature);
		System.out.println(c2 instanceof Creature);

	}

}
