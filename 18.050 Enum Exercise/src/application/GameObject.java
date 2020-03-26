package application;

public enum GameObject {
	
	ROCK, PAPER, SCISSORS;
	
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
	
	
	public String compareText(GameObject other) {
		return compareText[this.ordinal()][other.ordinal()];
	}
	
	public int compare(GameObject other) {
		return comparison[this.ordinal()][other.ordinal()];
	}
}
