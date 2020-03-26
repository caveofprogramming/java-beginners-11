package app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		// HashSet, LinkedHashSet, TreeSet
		// HashMap, LinkedHashMap, TreeMap
		
		Map<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(1, "Jan");
		months1.put(3, "Mar");
		months1.put(6, "Jun");
		
		months1.forEach((k,v)->System.out.println(k + ":" + v));
		
		System.out.println();
		
		Map<Integer, String> months2 = new TreeMap<>();
		
		months2.put(3, "Mar");
		months2.put(6, "Jun");
		months2.put(1, "Jan");
		
		months2.forEach((k,v)->System.out.println(k + ":" + v));
	}

}
