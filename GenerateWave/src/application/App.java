package application;

import java.io.UnsupportedEncodingException;

public class App {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String filename = "test.wav";

		Wav wav = new Wav("test.wav", 3.0);
		wav.write();
	
		System.out.println("Written " + filename);
	}
}
