package gui;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements ColorChangeListener {

	private static final long serialVersionUID = 1L;

	public MainPanel() {
		setBackground(Color.green);
	}
	
	public void changeColor(Color color) {
		setBackground(color);
	}
	
}
