package application;

public class App {

	public static void main(String[] args) {
		HouseCat cat1 = new HouseCat();
		cat1.vocalize();
		cat1.hunt();
		
		Tiger cat2 = new Tiger();
		cat2.vocalize();
		cat2.hunt();
		
		Lion cat3 = new Lion();
		cat3.vocalize();
		cat3.hunt();

	}

}
