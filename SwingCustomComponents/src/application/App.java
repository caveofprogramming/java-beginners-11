package application;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		SwingUtilities.invokeLater(() -> {
			JFrame mainFrame = new JFrame();
			
			mainFrame.setSize(600, 400);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mainFrame.setVisible(true);
			
			mainFrame.setLayout(new BorderLayout());
			mainFrame.add(new Toolbar(), BorderLayout.NORTH);
			
			mainFrame.add(new MainPanel(), BorderLayout.CENTER);
			
			
		});
		
		
	}

}
