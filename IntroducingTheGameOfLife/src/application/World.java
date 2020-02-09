package application;

import java.util.Arrays;
import java.util.Random;

public class World {

	private Random random = new Random();
	private boolean[][] grid;
	private boolean[][] buffer;

	private int rows;
	private int columns;

	private int numSeeds;

	public World(int rows, int columns) {

		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
		buffer = new boolean[rows][columns];

		numSeeds = rows * columns / 5;

		for (int i = 0; i < numSeeds; i++) {
			
			int x = random.nextInt(columns);
			int y = random.nextInt(rows);

			grid[y][x] = true;
		}
	}

	public void update() {

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				int neighbours = countNeighbours(row, col);

				if (neighbours < 2 || neighbours > 3) {
					buffer[row][col] = false;
				} else if (neighbours == 3) {
					buffer[row][col] = true;
				} else {
					buffer[row][col] = grid[row][col];
				}
			}
		}

		// Copy buffer to grid
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				grid[row][col] = buffer[row][col];
			}
		}
	}

	private int countNeighbours(int row, int column) {

		int neighbours = 0;

		for (int x = -1; x <= 1; x++) {
			for (int y = -1; y <= 1; y++) {

				if (x == 0 && y == 0) {
					continue;
				}

				int checkRow = row + x;
				int checkCol = column + y;
				
				if (checkRow < 0) {
					checkRow = rows - 1;
				} else if (checkRow == rows) {
					checkRow = 0;
				}

				if (checkCol < 0) {
					checkCol = columns - 1;
				} else if (checkCol == columns) {
					checkCol = 0;
				}

				boolean status = grid[checkRow][checkCol];

				if (status) {
					neighbours++;
				}
			}
		}

		return neighbours;
	}

	public void setSquare(int x, int y, boolean status) {
		grid[y][x] = status;
	}

	public boolean getSquare(int x, int y) {
		return grid[y][x];
	}

	public void clear() {
		
		for(int y = 0; y < rows; y++) {
			boolean[] row = grid[y];
			
			Arrays.fill(row, false);
		}

	}
}
