package gui.data;

import synth.MusicalNote;

public class ScoreNote implements Comparable<ScoreNote> {
	private Integer bar;
	private Integer quarter;
	private int notePosition;
	private MusicalNote note;

	public ScoreNote(int bar, int quarter, int notePosition, MusicalNote note) {
		this.bar = bar;
		this.quarter = quarter;
		this.notePosition = notePosition;
		this.note = note;
	}

	public int getNotePosition() {
		return notePosition;
	}

	public void setNotePosition(int notePosition) {
		this.notePosition = notePosition;
	}

	public int getBar() {
		return bar;
	}

	public void setBar(int bar) {
		this.bar = bar;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	
	public double getFrequency() {
		return note.getFrequency();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bar;
		result = prime * result + notePosition;
		result = prime * result + quarter;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreNote other = (ScoreNote) obj;
		if (bar != other.bar)
			return false;
		if (notePosition != other.notePosition)
			return false;
		if (quarter != other.quarter)
			return false;
		return true;
	}

	@Override
	public int compareTo(ScoreNote o) {
		if(this.bar == o.bar) {
			return this.quarter.compareTo(o.quarter);
		}
		else {
			return this.bar.compareTo(o.bar);
		}
	}

	public MusicalNote getNote() {
		return note;
	}
	
	

}
