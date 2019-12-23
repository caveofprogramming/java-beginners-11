package application;

import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
		
		String word = "apple";
		
		char[] charArray = new char[word.length()];
		
		Arrays.fill(charArray, '_');
		
		for(char c: charArray) {
			System.out.print(c);
			System.out.print(' ');
		}
		
		/*
		 * apple
		 * _____
		 * _ _ _ _ _ 
		 */

	}

}
