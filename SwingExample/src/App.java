import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

	public static void main(String[] args) {
		JFrame mainWindow = new JFrame("Test");

		mainWindow.setSize(400, 300);
		mainWindow.getContentPane().setBackground(Color.BLACK);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainWindow.setLayout(new BorderLayout());
		mainWindow.add(new JPanel());
		mainWindow.setVisible(true);
	}

}
