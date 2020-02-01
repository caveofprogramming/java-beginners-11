package panels;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import entity.ReactionTime;

public class DetailsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextArea textArea;
	
	public DetailsPanel() {
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFocusable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		add(scrollPane, BorderLayout.CENTER);
		add(new JLabel("Press spacebar to continue.", SwingConstants.CENTER), BorderLayout.NORTH);
	}

	public void setReactionTimes(List<ReactionTime> reactionTimes) {
		
		StringBuilder sb = new StringBuilder();
		
		int line = 1;
		
		for(ReactionTime rt: reactionTimes) {
			sb.append(String.format("%d. %s: %d ms\n", line, rt.getDate(), rt.getReactionTime()));
			line++;
		}
		
		textArea.setText(sb.toString());
	}
}
