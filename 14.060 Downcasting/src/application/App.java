package application;


public class App {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Cat a2 = (Cat)a1;
		
		System.out.println(a2);
		a2.speak();
		a2.jump();
	}
	
}
