package application;

public class GameObject {
	private String name;
	private int id;
	
	private static int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0},
	};
	
	private static String[][] compareText = {
			{"Rock matches rock", "Rock gets wrapped", "Rock smashes scissors"},
			{"Paper wraps rock", "Paper matches paper", "Paper gets cut"},
			{"Scissors get smashed", "Scissors cut paper", "Scissors match scissors"},
	};
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String compareText(GameObject other) {
		return compareText[id][other.id];
	}
	
	public int compare(GameObject other) {
		return comparison[id][other.id];
	}
	
	public String toString() {
		return name;
	}
}
