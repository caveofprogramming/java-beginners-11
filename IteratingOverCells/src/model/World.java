package model;

import java.util.Arrays;
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

	public void clear() {
		for(int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}

	public void next() {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				System.out.println("(" + row + "," + col + ")");
			}
		}
		
	}
	
	
}
