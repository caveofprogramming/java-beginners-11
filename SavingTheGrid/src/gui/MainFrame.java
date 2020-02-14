package gui;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private GamePanel gamePanel = new GamePanel();
	
	private static final String defaultFileName = "gameoflife.gol";
	
	public MainFrame() {
		super("Game of Life");
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		
		Menu fileMenu = new Menu("File");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		MenuBar menuBar = new MenuBar();
		menuBar.add(fileMenu);
		
		setMenuBar(menuBar);
		
		JFileChooser fileChooser = new JFileChooser();
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("open");
			}
		});
		
		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setSelectedFile(new File(defaultFileName));
				int userOption = fileChooser.showSaveDialog(MainFrame.this);
				
				if(userOption == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					gamePanel.save(selectedFile);
				}
			}
		});
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				int code = e.getKeyCode();
				
				switch(code) {
				case 32:
					gamePanel.next();
					break;
				case 8:
					gamePanel.clear();
					break;
				case 10:
					gamePanel.randomize();
					break;
				}
			}
		});
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
