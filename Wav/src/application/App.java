package application;

import java.io.UnsupportedEncodingException;

public class App {
	public static void main(String[] args) throws UnsupportedEncodingException {

		Wav wav = new Wav("test.wav", 3.0);
		
		wav.write();
		
		wav.write();
		
		wav.check();
		
		System.out.println("Completed");
	}
}
