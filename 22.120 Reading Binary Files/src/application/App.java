package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		new App().run();
	}
	
	public void run() {
		
		String filename = "test.bin";
		
		writeFile(filename);
		readFile(filename);
	}
	
	public void readFile(String filename) {

		File file = new File(filename);
		
		try(var dis = new DataInputStream(new FileInputStream(file))) {
			
			int value = dis.readInt();
			
			byte byte1 = dis.readByte();
			byte byte2 = dis.readByte();
			
			System.out.println(value + ", " + byte1 + ", " + byte2);
			
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open: " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Cannot read: "  + file.getAbsolutePath());
		}

	}
	
	public void writeFile(String filename) {

		File file = new File(filename);
		
		int value = 1;
		
		byte[] bytes = new byte[2];
		bytes[0] = 2;
		bytes[1] = 3;
		
		try(var dos = new DataOutputStream(new FileOutputStream(file))) {
			dos.writeInt(value);
			dos.write(bytes);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create: " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Cannot write: "  + file.getAbsolutePath());
		}
		
		System.out.println("Written " + file.getAbsolutePath());
	}

}
