package application;

public class App {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = false;
		boolean mightRain = false;
		boolean haveUmbrella = true;
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("Take umbrella!");
		}
		else {
			System.out.println("Don't take umbrella.");
		}
		
		boolean rainCheck = isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("Take umbrella!");
		}
		else {
			System.out.println("Don't take umbrella.");
		}

	}

}
