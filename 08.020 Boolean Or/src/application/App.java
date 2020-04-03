package application;

public class App {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = true;
		boolean mightRain = false;
		boolean takeUmbrella = false;
		
		takeUmbrella = isRaining || mightRain;
		
		
		System.out.println(takeUmbrella);

	}

}
