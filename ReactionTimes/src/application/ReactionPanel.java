package application;

import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

public class ReactionPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private CompletionListener completionListener;

	public ReactionPanel() {
		JLabel textLabel = new JLabel("Press spacebar when color changes");
		textLabel.setForeground(Color.white);
		add(textLabel);
		setBackground(Color.red);
		
		var worker = new SwingWorker<Boolean, Void>() {

			@Override
			protected Boolean doInBackground() throws Exception {
				
				Random random = new Random();
				
				for(int i=0; i<2; i++) {
					Thread.sleep(random.nextInt(10000) + 2000);
					setBackground(Color.green);
				}
				
				completionListener.complete();
				
				return true;
			}
		};
		
		worker.execute();
	}
	
	public void reset() {
		setBackground(Color.red);
	}

	public void addCompletionListener(CompletionListener completionListener) {
		this.completionListener = completionListener;
		
	}
}
