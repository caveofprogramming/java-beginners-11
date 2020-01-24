package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;


class ColorButtonListener implements ActionListener {
	
	private MainPanel mainPanel;
	private Color color;

	public ColorButtonListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.changeColor(color);
	}
}


public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {

		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.red));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.blue));

		add(redButton);
		add(blueButton);
	}
}
