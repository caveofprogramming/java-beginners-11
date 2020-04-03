package controller;

import gui.ArtPanel;
import gui.MainFrame;

public class Controller {
	private MainFrame mainFrame;
	private ArtPanel artPanel;
	
	
	public Controller() {
		
		artPanel = new ArtPanel();
		mainFrame = new MainFrame();
		
		mainFrame.setContentPane(artPanel);
	}
}
