package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Big O notation
 * 
 * O(1)
 * O(n)
 * O(n^2)
 * O(c^n)
 */

public class App {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		List<Integer> list = linkedList;

		try (var bw = new BufferedWriter(new FileWriter("timings.txt"))) {
			for (int numberItems = 0; numberItems < 1E6; numberItems += 50_000) {

				for (int i = 0; i < numberItems; i++) {
					list.add(i);
				}

				long duration = timeOperations(list);

				String info = String.format("%d\t%d\n", numberItems, duration);

				bw.write(info);
				System.out.print(info);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static long timeOperations(List<Integer> list) {

		long start = System.currentTimeMillis();

		for(var n: list) {
			
		}

		return System.currentTimeMillis() - start;
	}

}
