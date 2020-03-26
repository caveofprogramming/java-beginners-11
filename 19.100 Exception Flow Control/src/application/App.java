package application;

public class App {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person();

		try {
			p1.setName("Mary");
			System.out.println("Still in try block");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			System.out.println("In finally block");
		}

		System.out.println("Program completed");

	}

}
