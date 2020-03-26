package application;

public class App {

	public static void main(String[] args) {
		Cat a1 = new Cat();
		Animal a2 = a1;
		
		System.out.println(a2);
		System.out.println(a2 == a1);
	}
	
}
