package application;

public class App {

	public static void main(String[] args) {
	
		for(Fruit fruit: Fruit.values()) {
			System.out.println(fruit);
		}
		
		System.out.println(Fruit.BANANA.ordinal());
		
		Fruit fruit2 = Fruit.valueOf("ORANGE");
		System.out.println(fruit2);
		
		System.out.println(fruit2 == Fruit.ORANGE);
	}

}
