package application;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Sigmund");
		p1.display();
		
		Person.Printer printer = p1.new Printer();
		printer.print();
	}	

}
