package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		

		List<Integer> list1 = new ArrayList<>(List.of(20,19,18));
		
		// List<Integer> list2 = new ArrayList<>(list1);
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(111);
		list2.addAll(list1);
		list2.add(222);

		for(var n: list2) {
			System.out.println(n);
		}
	}

	

}
