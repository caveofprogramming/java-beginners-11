package app;

public class App {

	public static void main(String[] args) {
		People people = new People();
		
		var peopleList1 = people.get();
		
		//peopleList1.remove(1);
		
		var peopleList2 = people.get();
		
		peopleList2.forEach(System.out::println);
	}

}
