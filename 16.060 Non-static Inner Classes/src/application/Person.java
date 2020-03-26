package application;

public class Person {
	private String name;
	
	public class Printer {
		public void print() {
			System.out.println(name);
		}
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void display() {
		Printer printer = new Printer();
		printer.print();
	}
}
