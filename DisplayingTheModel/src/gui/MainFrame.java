package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game of Life");
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
