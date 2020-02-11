package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game of Life");
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				int code = e.getKeyCode();
				
				switch(code) {
				case 32:
					System.out.println("spacebar");
					break;
				case 8:
					gamePanel.clear();
					break;
				case 10:
					gamePanel.randomize();
					break;
				}
			}
		});
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
