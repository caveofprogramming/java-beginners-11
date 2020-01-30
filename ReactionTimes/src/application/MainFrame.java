package application;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private enum State {
		START, REACT
	}
	
	private ReactionPanel reactionPanel = new ReactionPanel();
	
	private State state = State.START;

	private CardLayout cardLayout;

	// Used to detect key pressed.
	private class KeyCheck extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			
			if(state == State.START) {
				cardLayout.show(MainFrame.this.getContentPane(), State.REACT.toString());
				state = State.REACT;
			}
			else {
				reactionPanel.reset();
			}
		}
	}
	
	private class WhenComplete implements CompletionListener {

		@Override
		public void complete() {
			state = State.START;
			cardLayout.show(MainFrame.this.getContentPane(), State.START.toString());
		}
		
	}

	public MainFrame() {
		super("Reaction Times");
		
		// "Listen" for key presses.
		addKeyListener(new KeyCheck());
		
		reactionPanel.addCompletionListener(new WhenComplete());
		
		/*
		 * CardLayout lets us present different views to the user,
		 * as if each view is a card in a deck of cards.
		 * See https://docs.oracle.com/javase/tutorial/uiswing/layout/card.html
		 */
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		add(new StartPanel(), State.START.toString());
		add(reactionPanel, State.REACT.toString());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}
}
