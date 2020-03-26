package application;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new HouseCat();
		cat1.hunt();
		cat1.vocalize();
		
		// Does not work:
		// cat1.purr();
		((HouseCat)cat1).purr();
		
		System.out.println();
		
		HouseCat cat2 = new HouseCat();
		cat2.hunt();
		cat2.vocalize();
		cat2.purr();

	}

}
