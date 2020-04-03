package application;

public class App {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = true;
		boolean haveUmbrella = true;
		
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println(takeUmbrella);
		
		takeUmbrella = isRaining && haveUmbrella ? true: false;

	}

}
