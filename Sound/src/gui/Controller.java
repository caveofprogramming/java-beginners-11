package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;

import gui.data.NoteSet;
import gui.data.ScoreNote;
import interfaces.KeyPressListener;
import synth.Synth;

public class Controller implements KeyPressListener {
	private MainFrame mainFrame;
	private ScorePanel scorePanel;
	private Synth synth;

	public Controller() {
		mainFrame = new MainFrame();
		scorePanel = new ScorePanel();

		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(scorePanel, BorderLayout.CENTER);

		mainFrame.setKeyPressListener(this);

		synth = new Synth();
	}
	
	private synchronized void playScore(NoteSet score) {
		

		try {
			synth.open();

			for (ScoreNote n : score) {
				synth.play(n.getNote(), 100);

				Thread.sleep(200);
			}

			synth.close();

		} catch (IOException e) {
			System.out.println("Unable to create synth.");
			System.out.println(e.getMessage());
		} catch (LineUnavailableException e) {
			System.out.println("Unable to play synth");
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onPlay() {
		
		var score = scorePanel.getScore();

		new Thread(new Runnable() {

			@Override
			public void run() {
				playScore(score);
			}

		}).start();

	}

	@Override
	public void onKeyPress(KeyEvent e) {
		if(e.getKeyChar() == 'x') {
			scorePanel.clear();
		}
		else if(e.getKeyCode() == 0x20) {
			onPlay();
		}
		
	}

	
}
