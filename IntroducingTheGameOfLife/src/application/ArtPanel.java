package application;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

public class ArtPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int CELLSIZE = 100;

	private int width;
	private int height;
	private int horizontalMargin;
	private int verticalMargin;

	int rows;
	int columns;

	private static final Color foreground = Color.GREEN;
	private static final Color background = Color.BLACK;
	private static final Color gridColor = Color.GRAY;

	private World world;
	private ScheduledFuture<?> future;
	
	private boolean initialize = true;

	public ArtPanel() {

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				onClick(e);
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				init();
			}
		});

		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		
		setDoubleBuffered(true);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(800, 600);
	}

	private void init() {
		initialize = true;
	}

	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
	
		if (initialize) {
			width = getWidth();
			height = getHeight();
			
			rows = (width - (horizontalMargin * 2)) / CELLSIZE;
			columns = (height - (verticalMargin * 2)) / CELLSIZE;

			horizontalMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
			verticalMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
			
			world = new World(rows, columns);

			initialize = false;
		}

		// Fixes resize bug. First call to getWidth() sometimes returns
		// old size after resizing.
		if(getWidth() != width) {
			repaint();
			return;
		}
		
		drawGrid(g2);

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				boolean status = world.getSquare(row, col);
				setSquare(g2, row, col, status);
			}
		}
	}
	
	private void nextState() {
		world.update();
	}

	private void onClick(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();

		int row = (x - horizontalMargin) / CELLSIZE;
		int column = (y - verticalMargin) / CELLSIZE;
		
		boolean status = world.getSquare(row, column);
		world.setSquare(row, column, !status);

		repaint();
	}

	private void setSquare(Graphics2D g, int row, int column, boolean status) {

		int x = row * CELLSIZE + horizontalMargin;
		int y = column * CELLSIZE + verticalMargin;
		
		if (status) {
			g.setColor(foreground);
		} else {
			g.setColor(background);
		}

		g.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);
	}

	private void drawGrid(Graphics2D g) {
		g.setColor(background);
		g.fillRect(0, 0, width, height);

		g.setColor(gridColor);

		for (int x = horizontalMargin; x < width; x += CELLSIZE) {
			g.drawLine(x, verticalMargin, x, height - verticalMargin);
		}

		for (int y = verticalMargin; y < height; y += CELLSIZE) {
			g.drawLine(horizontalMargin, y, width - horizontalMargin, y);
		}
	}

	public void update() {
		nextState();
		repaint();
	}

	public void clear() {
		world.clear();
		repaint();
	}

	public void animate() {
		
		if(future == null) {
			future = Executors.newScheduledThreadPool(1).scheduleAtFixedRate(()->update(), 500, 200, TimeUnit.MILLISECONDS);
		}
		else {
			future.cancel(true);
			future = null;
		}
		
	}

}
