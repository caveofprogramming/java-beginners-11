package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import interfaces.FileListener;
import interfaces.QuitListener;
import interfaces.SpacebarListener;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private SpacebarListener spacebarListener;
	private FileListener fileListener;
	private QuitListener quitListener;
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem saveMenu = new JMenuItem("Save");
	private JMenu fileMenu = new JMenu("File");
	
	private class KeyCheck extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == 0x20) {
				// spacebar pressed
				spacebarListener.onSpacebar();
			}
			else if(e.getKeyChar() == 'x'){
				quitListener.quit();
			}
		}
		
	}
	
	/*
	 * Preset the 'save file' dialog.
	 */
	private class SaveMenuAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			File file = new File("reactiontimes.csv");
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setSelectedFile(file);
			fileChooser.setDialogTitle("Save reaction times");  
			
			int userSelection = fileChooser.showSaveDialog(MainFrame.this.getContentPane());
			
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    File fileToSave = fileChooser.getSelectedFile();
			    fileListener.save(fileToSave);
			}
		}
	}


	public MainFrame() {
		super("Reaction Times");
		
		// "Listen" for key presses.
		addKeyListener(new KeyCheck());
		
		saveMenu.addActionListener(new SaveMenuAction());
		setJMenuBar(menuBar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}

	public void addSpacebarListener(SpacebarListener spacebarListener) {
		this.spacebarListener = spacebarListener;
	}
	
	public void setFileListener(FileListener fs) {
		this.fileListener = fs;
	}
	
	public void setQuitListener(QuitListener quitListener) {
		this.quitListener = quitListener;
	}
	
	/*
	 * Show the menu
	 */
	public void showSaveMenu() {
		fileMenu.add(saveMenu);
 		menuBar.add(fileMenu);
		menuBar.revalidate(); // Tell the menu it needs to redraw itself.
        menuBar.repaint(); // Trigger an actual redraw.
	}
	
	/*
	 * Hide the menu
	 */
	public void hideSaveMenu() {
		menuBar.remove(fileMenu);
		menuBar.revalidate();
        menuBar.repaint();
	}	
}
