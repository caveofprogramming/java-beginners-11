package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ArtPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;

	public ArtPanel() {
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		int width = getWidth();
		int height = getHeight();
		
		if(image == null || image.getWidth() != width || image.getHeight() != height) {
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		}
		
		g.drawImage(image, 0, 0, null);
	}
	
	

}
