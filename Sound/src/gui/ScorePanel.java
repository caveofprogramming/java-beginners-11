package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.data.NoteSet;

public class ScorePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Staff staff;

	public ScorePanel() {
		setLayout(new BorderLayout());
		
		int margin = 50; // TODO handle scaling better
		setBorder(new EmptyBorder(margin, margin, 0, margin));

		staff = new Staff();
		add(staff, BorderLayout.CENTER);
	}
	
	public NoteSet getScore() {
		return staff.getScore();
	}

	public void clear() {
		staff.clear();
		
	}

}
