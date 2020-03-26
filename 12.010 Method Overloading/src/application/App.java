package application;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		person.greet();
		
		person.greet("Joe");
		person.greet(190);
		person.greet("Sue", 189);
	}

}
