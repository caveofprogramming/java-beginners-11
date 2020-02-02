package application;

import javax.swing.SwingUtilities;

import gui.Controller;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Controller());
	}

}
