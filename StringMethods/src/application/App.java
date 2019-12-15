package application;

public class App {

	public static void main(String[] args) {
		
		String name = "Joe";
		
		if(name.equals("Joe")) {
			System.out.println("1. Name is Joe");
		}
		
		if(name.equalsIgnoreCase("JOE")) {
			System.out.println("2. Name is Joe");
		}
		
		System.out.printf("The length of '%s' is %d\n", name, name.length());
		
	}

}
