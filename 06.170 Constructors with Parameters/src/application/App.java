package application;

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("Mary");
		person1.setHeight(160.0);
		
		Person person2 = new Person();
		person2.setName("Joe");
		person2.setHeight(170.5);
		
		Person person3 = new Person();
		
		System.out.println(person1.getName());
		System.out.println(person1.getHeight());
		System.out.println(person2.getName());
		System.out.println(person2.getHeight());
		System.out.println(person3.getName());
		System.out.println(person3.getHeight());

	}

}
