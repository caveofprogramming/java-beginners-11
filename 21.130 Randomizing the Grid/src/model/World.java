package model;

import java.util.Random;

public class World {
	private int rows;
	private int columns;
	
	private boolean[][] grid;
	
	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];
	}
	
	public boolean getCell(int row, int col) {
		return grid[row][col];
	}
	
	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status;
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void randomize() {
		
		Random random = new Random();
		
		for(int i = 0; i < (rows*columns)/10; i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			
			setCell(row, col, true);
		}
		
	}
	
	
}
