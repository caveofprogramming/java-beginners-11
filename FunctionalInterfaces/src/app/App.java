package app;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		var list = List.of("one", "two", "three");
		
		list.forEach((s)->{
			System.out.print(s);
		});
		
	}
	
	

}
