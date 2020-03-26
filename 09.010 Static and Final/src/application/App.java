package application;

public class App {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Matilda");
		
		System.out.println(cat1);
		System.out.println(cat2);

		System.out.println(Cat.FOOD);
		
		System.out.println(Math.PI);
	}

}
