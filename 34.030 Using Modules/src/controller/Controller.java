package controller;

import cellular.Rule;
import gui.ArtPanel;
import gui.MainFrame;

public class Controller {
	private MainFrame mainFrame;
	private ArtPanel artPanel;
	
	
	public Controller() {
		
		artPanel = new ArtPanel(new Rule(90));
		mainFrame = new MainFrame();
		
		mainFrame.setContentPane(artPanel);
	}
}
