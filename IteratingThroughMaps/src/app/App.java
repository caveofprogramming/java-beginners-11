package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		// @formatter:off
		HashMap<String, String> months = new HashMap<>(Map.of(
				"JAN", "January",
				"FEB", "February",
				"MAR", "March", 
				"APR", "April",
				"MAY", "May",
				"JUN", "July"
				));
		// @formatter:on

		months.forEach((monthCode, monthName) -> System.out.println(monthCode + ": " + monthName));
		
		System.out.println();
		
		// better use 'var'
		for(Map.Entry<String, String> entry: months.entrySet()) {
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			
			System.out.println(monthCode + ": " + monthName);
		}
		
		System.out.println();
		
		for(var monthCode: months.keySet()) {
			var monthName = months.get(monthCode);
						
			System.out.println(monthCode + ": " + monthName);
		}
		
		System.out.println();
		
		// better use 'var'
		Iterator<Map.Entry<String, String>> it = months.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			
			System.out.println(monthCode + ": " + monthName);
		}
		
	}

}
