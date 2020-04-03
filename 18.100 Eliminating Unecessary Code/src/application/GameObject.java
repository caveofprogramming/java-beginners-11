package application;

public enum GameObject {
	
	ROCK, PAPER, SCISSORS;
	
	private GameObject beats;
	
	static {
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}
	
	boolean beats(GameObject other) {
		return this.beats == other;
	}

}
