package gui.data;

import java.util.TreeSet;

public class NoteSet extends TreeSet<ScoreNote> {
	private static final long serialVersionUID = 1L;
	
	public NoteSet() {
		
	}

	public NoteSet(NoteSet other) {
		super(other);
	}
}
