package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import interfaces.KeyPressListener;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private KeyPressListener keyPressListener;

	public MainFrame() {
		super("Soft Synth");

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				keyPressListener.onKeyPress(e);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 400);
		setVisible(true);
	}

	public void setKeyPressListener(KeyPressListener keyPressListener) {
		this.keyPressListener = keyPressListener;
	}
}
