package application;

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		
		// Create a "Controller" in a Swing thread.
		SwingUtilities.invokeLater(() -> new Controller());
	}
}
