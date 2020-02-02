package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import gui.data.NoteSet;
import gui.data.ScoreNote;
import synth.MusicalNote;

public class Staff extends JPanel {
	private static final long serialVersionUID = 1L;

	private int numberBars;
	private float lineHeight;
	private float barWidth;
	private float quarterBarWidth;
	private static final int MARGINTOP = 20;
	private int noteSize;
	
	private NoteSet noteSet = new NoteSet();

	public Staff() {
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				createNote(e.getX(), e.getY());
			}
		});

		// setBorder(new LineBorder(Color.blue));
	}

	private void createNote(int x, int y) {

		int bar = (int) ((float) x / barWidth);

		int quarter = (int) ((float) x / quarterBarWidth) % 4;

		int notePosition = Math.round(((float) y - lineHeight / 2) / (lineHeight / 2));
		MusicalNote musicalNote = MusicalNote.values()[11 - notePosition];

		ScoreNote note = new ScoreNote(bar, quarter, notePosition, musicalNote);
		noteSet.add(note);

		repaint();
	}

	private void drawNotes(Graphics2D g) {
		noteSet.forEach(n -> {

			int x = (int)Math.round(
					n.getBar() * barWidth + (n.getQuarter() * quarterBarWidth) + quarterBarWidth / 2 - lineHeight / 1.7);
			int y = Math.round(lineHeight / 2 * n.getNotePosition());

			g.fillOval(x, y, noteSize, (int)(noteSize * 0.9));
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		int width = getWidth();

		// Where should we start and end drawing, horizontally?
		int startx = 0;
		int endx = width - startx;

		// How many bars should we draw?
		int staffWidth = endx - startx;
		float barMinWidth = 200f;
		numberBars = (int) (staffWidth / barMinWidth);

		if (numberBars < 1) {
			// TODO Do something better here.
			System.out.println("Window too small");
			return;
		}

		barWidth = (float) staffWidth / numberBars;
		quarterBarWidth = barWidth / 4.0f;

		// Where do we start and end drawing vertically?
		int starty = MARGINTOP;
		int barAspectRatio = 4;
		int endy = MARGINTOP + starty + (endx - startx) / (numberBars * barAspectRatio);

		lineHeight = (endy - starty) / 4.0f;
		noteSize = (int)(lineHeight * 1.1);

		float y = starty;

		g2.drawLine(startx, starty, startx, endy);
		g2.drawLine(endx, starty, endx, endy);

		for (int line = 0; line < 5; line++) {

			g2.drawLine(startx, (int) y, endx, (int) y);

			y += lineHeight;
		}

		float x = startx;

		for (int bar = 0; bar < numberBars; bar++) {
			g2.drawLine((int) x, starty, (int) x, endy);

			x += barWidth;
		}

		drawNotes(g2);

	}

	public NoteSet getScore() {
		return noteSet;
	}
	
	public void clear() {
		noteSet.clear();
		repaint();
	}


}
