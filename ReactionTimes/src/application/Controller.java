package application;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.swing.JOptionPane;

import entity.ReactionTime;
import interfaces.FileListener;
import interfaces.SpacebarListener;
import interfaces.TestListener;
import panels.MessagePanel;
import panels.ReactionPanel;

/*
 * Create the various user interface components.
 * Listen to events they fire, and instruct them appropriately.
 */

public class Controller implements SpacebarListener, TestListener, FileListener {

	private MainFrame mainFrame;
	private MessagePanel startPanel;
	private ReactionPanel reactionPanel;
	private MessagePanel completePanel;
	private CardLayout cardLayout;

	private enum State {
		START, REACT, COMPLETE;
	}

	private State state = State.START;

	public Controller() {
		mainFrame = new MainFrame();
		startPanel = new MessagePanel("Press spacebar to continue", null);
		completePanel = new MessagePanel("Test complete", "Press spacebar to try again.");
		reactionPanel = new ReactionPanel();
		
		reactionPanel.setNumTests(20);

		/*
		 * CardLayout lets us present different views to the user, as if each view is a
		 * card in a deck of cards. See
		 * https://docs.oracle.com/javase/tutorial/uiswing/layout/card.html
		 */
		cardLayout = new CardLayout();
		mainFrame.setLayout(cardLayout);

		mainFrame.add(startPanel, State.START.toString());
		mainFrame.add(reactionPanel, State.REACT.toString());
		mainFrame.add(completePanel, State.COMPLETE.toString());

		mainFrame.addSpacebarListener(this);
		reactionPanel.setTestListener(this);
		mainFrame.setFileListener(this);
		
		setState(State.START);
	}

	private void setState(State state) {
		this.state = state;
		cardLayout.show(mainFrame.getContentPane(), state.toString());
		
		// The 'save' menu only appears when a test is complete.
		// Otherwise we hide it.
		if(state == State.START) {
			mainFrame.hideSaveMenu();
		}
	}

	/*
	 * This method runs when the user hits the spacebar.
	 */
	public void onSpacebar() {
		switch (state) {
		case START:
			setState(State.REACT);
			break;
		case REACT:
			reactionPanel.onSpacebar();
			break;
		case COMPLETE:
			setState(State.START);
			break;
		default:
			System.out.println("Invalid state");
			break;
		}
	}

	@Override
	public void testComplete() {
		mainFrame.showSaveMenu();
		
		long averageReactionTime = reactionPanel.getAverageReactionTime();

		String info = String.format("Average reaction time: %d milliseconds", averageReactionTime);
		completePanel.setTitle(info);

		setState(State.COMPLETE);
	}
	
	/*
	 * Save a file containing a list of reaction times.
	 */

	@Override
	public void save(File file) {
		List<ReactionTime> reactionTimes = reactionPanel.getReactionTimes();

		try (OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file))) {
			
			int lineNumber = 1;
			for(ReactionTime time: reactionTimes) {
				String line = String.format("%d,\"%s\",%d", lineNumber, time.getDate(), time.getReactionTime());
				os.write(line);
				os.write("\n");
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(mainFrame, "Unable to save file", "Save reaction times", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(mainFrame, "Error saving file", "Save reaction times", JOptionPane.WARNING_MESSAGE);
		}

	}
}
