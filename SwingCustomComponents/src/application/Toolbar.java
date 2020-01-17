package application;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	public Toolbar() {
		add(new JButton("One"));
		add(new JButton("Two"));
	}
}
