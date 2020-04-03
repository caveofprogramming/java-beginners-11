package application;

class Person {
	String name;
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Mary";
		
		Person person2 = new Person();
		person2.name = "Joe"; 
		
		System.out.println(person1.name);
		System.out.println(person2.name);

	}

}
