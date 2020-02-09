package model;

public class World {
	private int rows;
	private int columns;
	
	private boolean[][] grid;
	
	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];
	}
	
	public boolean getCells(int row, int col) {
		return grid[row][col];
	}
	
	public void setCells(int row, int col, boolean status) {
		grid[row][col] = status;
	}
}
