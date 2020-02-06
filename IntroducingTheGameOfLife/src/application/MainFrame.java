package application;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Cellular");
		
		ArtPanel artPanel = new ArtPanel();
		
		setLayout(new BorderLayout());
		add(artPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 0x20) {
					artPanel.update();
				}
				else if(e.getKeyChar() == 'x') {
					artPanel.clear();
				}
				else if(e.getKeyChar() == 'a') {
					artPanel.animate();
				}
			}
			
		});
	}
}
