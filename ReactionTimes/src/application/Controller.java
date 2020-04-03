package application;

import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import entity.ReactionTime;
import interfaces.FileListener;
import interfaces.QuitListener;
import interfaces.SpacebarListener;
import interfaces.TestListener;
import panels.DetailsPanel;
import panels.MessagePanel;
import panels.ReactionPanel;
import panels.StartPanel;

/*
 * Create the various user interface components.
 * Listen to events they fire, and instruct them appropriately.
 */

public class Controller implements SpacebarListener, TestListener, FileListener, QuitListener {

	private MainFrame mainFrame;
	private StartPanel startPanel;
	private ReactionPanel reactionPanel;
	private MessagePanel completePanel;
	private DetailsPanel detailsPanel;
	private CardLayout cardLayout;

	private enum State {
		START, REACT, COMPLETE, DETAILS;
	}

	private State state = State.START;

	public Controller() {
		mainFrame = new MainFrame();
		startPanel = new StartPanel();
		completePanel = new MessagePanel("Test complete", "Press spacebar to view details.");
		reactionPanel = new ReactionPanel();
		detailsPanel = new DetailsPanel();

		reactionPanel.setNumTests(10);

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
		mainFrame.add(detailsPanel, State.DETAILS.toString());

		mainFrame.addSpacebarListener(this);
		mainFrame.setFileListener(this);
		mainFrame.setQuitListener(() -> reactionPanel.stop());
		reactionPanel.setTestListener(this);

		setState(State.START);
	}

	private void setState(State state) {
		this.state = state;
		cardLayout.show(mainFrame.getContentPane(), state.toString());

		// The 'save' menu only appears when a test is complete.
		// Otherwise we hide it.
		if (state == State.START) {
			mainFrame.hideSaveMenu();
		}
	}

	/*
	 * This method runs when the user hits the spacebar.
	 */
	public void onSpacebar() {
		switch (state) {
		case START:
			reactionPanel.setNumTests(startPanel.getNumTests());
			setState(State.REACT);
			break;
		case REACT:
			reactionPanel.onSpacebar();
			break;
		case COMPLETE:
			setState(State.DETAILS);
			break;
		case DETAILS:
			setState(State.START);
			break;
		default:
			System.out.println("Invalid state");
			break;
		}
	}

	@Override
	public void testComplete() {

		if (reactionPanel.hasData()) {
			mainFrame.showSaveMenu();

			long averageReactionTime = reactionPanel.getAverageReactionTime();

			String info = String.format("Average reaction time: %d milliseconds", averageReactionTime);
			completePanel.setTitle(info);
			
			List<ReactionTime> reactionTimes = reactionPanel.getReactionTimes();
			detailsPanel.setReactionTimes(reactionTimes);

			setState(State.COMPLETE);
		} else {
			setState(State.START);
		}
	}

	/*
	 * Save a file containing a list of reaction times.
	 */

	@Override
	public void save(File file) {
		List<ReactionTime> reactionTimes = reactionPanel.getReactionTimes();

		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {

			int lineNumber = 1;
			for (ReactionTime time : reactionTimes) {
				String line = String.format("%d,\"%s\",%d", lineNumber, time.getDate(), time.getReactionTime());
				br.write(line);
				br.write("\n");
				lineNumber++;
			}

		} catch (IOException e2) {
			JOptionPane.showMessageDialog(mainFrame, "Unable to save file", "Save reaction times",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	@Override
	public void quit() {
		reactionPanel.stop();
	}
}
