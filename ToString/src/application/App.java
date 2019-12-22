package application;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person("Mary", 160.0);
		Person person2 = new Person("Joe", 170.5);
		Person person3 = new Person();
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);

	}

}
