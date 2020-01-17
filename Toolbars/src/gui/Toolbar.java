package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar() {
		add(new JButton("One"));
		add(new JButton("Two"));
	}
}
