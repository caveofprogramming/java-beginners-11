package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Joe");
		person1.setAge(92);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());

	}

}
