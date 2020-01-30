package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import entity.ReactionTime;
import interfaces.TestListener;

public class ReactionPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private TestListener testListener;
	private static final int NUM_TESTS = 2;
	private int test = 0;

	List<ReactionTime> reactionTimes = new ArrayList<>();
	Long startTime = 0L;

	public ReactionPanel() {
		JLabel textLabel = new JLabel("Press spacebar when color changes", SwingConstants.CENTER);
		setLayout(new BorderLayout());
		add(textLabel, BorderLayout.CENTER);
		setBackground(Color.red);
		
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				startTest();
			}
		});

	}

	public void startTest() {
		
		setBackground(Color.red);
		reactionTimes.clear();
		
		var worker = new SwingWorker<Boolean, Void>() {

			@Override
			protected Boolean doInBackground() throws Exception {

				Random random = new Random();

				test = 0;

				while (test < NUM_TESTS) {
					Thread.sleep(random.nextInt(5000) + 3000);
					setBackground(Color.green);
					startTime = System.currentTimeMillis();
					test++;
				}

				return true;
			}
		};

		worker.execute();
	}

	public void setTestListener(TestListener testListener) {
		this.testListener = testListener;

	}
	
	public void onSpacebar() {

		long currentTime = System.currentTimeMillis();
		long reactionTime = currentTime - startTime;

		reactionTimes.add(new ReactionTime(new Date(), reactionTime));

		setBackground(Color.red);

		if (test == NUM_TESTS) {
			testListener.testComplete();
		}
	}

	public long getAverageReactionTime() {
		return Math.round(reactionTimes.stream().mapToLong(a -> a.getReactionTime()).average().getAsDouble());
	}

	public List<ReactionTime> getReactionTimes() {
		return reactionTimes;
	}
}
