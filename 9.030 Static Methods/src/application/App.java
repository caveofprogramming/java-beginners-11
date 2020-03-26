package application;

public class App {

	public static void main(String[] args) {
		
		final String CAT_FORMAT_STR = "Count of cats: %d\n";
		
		String catCount = String.format(CAT_FORMAT_STR, Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Matilda");
		Cat cat3 = new Cat("Peter");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);

		System.out.println(Cat.FOOD);
		
		catCount = String.format(CAT_FORMAT_STR, Cat.getCount());
		System.out.println(catCount);
	}

}
