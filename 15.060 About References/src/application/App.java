package application;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1);
		
		Person p2 = p1;
		
		System.out.println(p2);
		
		test(p2);
	}
	
	static void test(Person person) {
		System.out.println(person);
	}

}
