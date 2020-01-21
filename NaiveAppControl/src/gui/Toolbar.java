package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class RedButtonListener implements ActionListener {
	
	private MainPanel mainPanel;

	public RedButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.changeColor(Color.red);
	}
}

class BlueButtonListener implements ActionListener {
	
	private MainPanel mainPanel;

	public BlueButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.changeColor(Color.blue);
	}
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {

		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new RedButtonListener(mainPanel));
		blueButton.addActionListener(new BlueButtonListener(mainPanel));

		add(redButton);
		add(blueButton);
	}
}
