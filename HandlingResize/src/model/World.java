package model;

import java.util.Random;

public class World {
	
	private boolean[][] grid;
	
	private int rows;
	private int columns;
	
	public World(int rows, int columns) {
		
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];
		
		init();
	}
	
	private void init() {
		Random random = new Random();
		
		for(int i = 0; i < (rows * columns/10); i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			
			grid[row][col] = true;
		}
	}
	
	public boolean getCell(int row, int col) {
		return grid[row][col];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
}
