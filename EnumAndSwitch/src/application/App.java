package application;

public class App {

	public static void main(String[] args) {
	
		Fruit fruit = Fruit.ORANGE;
		
		switch(fruit) {
		case ORANGE:
			System.out.println("orange");
		break;
		case BANANA:
			System.out.println("banana");
			break;
		case APPLE:
			System.out.println("apple");
			break;
		default:
			System.out.println("invalid fruit");
			break;
		}
	}

}
