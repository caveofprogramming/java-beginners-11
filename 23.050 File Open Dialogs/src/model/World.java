package model;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class World {
	private int rows;
	private int columns;

	private boolean[][] grid;
	private boolean[][] buffer;

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
		buffer = new boolean[rows][columns];
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

		for (int i = 0; i < (rows * columns) / 10; i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);

			setCell(row, col, true);
		}

	}

	public void clear() {
		for (int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}

	private int countNeighbours(int row, int col) {

		int neighbours = 0;

		for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for (int colOffset = -1; colOffset <= 1; colOffset++) {

				if (rowOffset == 0 && colOffset == 0) {
					continue;
				}

				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;

				if (gridRow < 0) {
					continue;
				} else if (gridRow == rows) {
					continue;
				}

				if (gridCol < 0) {
					continue;
				} else if (gridCol == columns) {
					continue;
				}

				boolean status = getCell(gridRow, gridCol);

				if (status) {
					neighbours++;
				}
			}
		}

		return neighbours;
	}

	public void next() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				int neighbours = countNeighbours(row, col);

				/*
				 * If neighbouring cell count < 2, deactivate cell If neighbouring cell count >
				 * 3, deactive cell If neighbouring cell count == 3, activate cell If
				 * neighbouring cell count == 2, don't mess with it
				 */
				boolean status = false;

				if (neighbours < 2) {
					status = false;
				} else if (neighbours > 3) {
					status = false;
				} else if (neighbours == 3) {
					status = true;
				} else if (neighbours == 2) {
					status = getCell(row, col);
				}

				buffer[row][col] = status;
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				grid[row][col] = buffer[row][col];
			}
		}

	}

	public void save(File selectedFile) {
		try(var dos = new DataOutputStream(new FileOutputStream(selectedFile))) {
			dos.writeInt(rows);
			dos.writeInt(columns);
			
			for(int row = 0; row < rows; row++) {
				for(int col = 0; col < columns; col++) {
					dos.writeBoolean(grid[row][col]);
				}
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
