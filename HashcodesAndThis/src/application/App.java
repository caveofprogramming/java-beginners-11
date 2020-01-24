package application;

public class App {

	public static void main(String[] args) {
		
		Fox fox = new Fox();
		System.out.println(fox);
		System.out.printf("%x\n", fox.hashCode());

		Fox foxxx = fox;
		System.out.println(foxxx);
		
		System.out.println(fox.name);

	}
	
	

}
