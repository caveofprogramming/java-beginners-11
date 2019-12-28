package application;

public class RandomWord {
	private String[] words = { "father", "family", "infant", "tongue", "nothing", "longer", "explicit", "called",
			"authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "inscription" };
	
	private String chosenWord;
	
	public RandomWord() {
		chosenWord = words[1];
	}
	
	public String toString() {
		return chosenWord;
	}
}
