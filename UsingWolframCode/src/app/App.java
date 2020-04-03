package app;

import javax.swing.SwingUtilities;

import controller.Controller;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Controller::new);
	}

}
