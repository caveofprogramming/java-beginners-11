package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;

import controller.Rule;

public class ArtPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Rule rule;
	private Random random = new Random();
	
	private static final int ON_COLOR = 0x00FF00;
	private static final int OFF_COLOR = 0x0000FF;

	public ArtPanel(Rule rule) {
		this.rule = rule;
	}

	@Override
	protected void paintComponent(Graphics g) {

		int width = getWidth();
		int height = getHeight();

		if (image == null || image.getWidth() != width || image.getHeight() != height) {
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		}

		boolean on = true;
		
		for (int x = 0; x < width; x++) {
			
			image.setRGB(x, 0, on ? ON_COLOR: OFF_COLOR);
			
			if(random.nextInt(20) == 0) {
				on = !on;
			}
		}
		
		for(int y = 1; y < height; y++) {
			for(int x = 0; x < width; x++) {
				
			}
		}

		g.drawImage(image, 0, 0, null);
	}

}
