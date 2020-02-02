package synth;

public enum MusicalNote {
	C4(261.63), D4(293.66), E4(329.63), F4(349.23), G4(392.00), A4(440.0), B4(493.88), C5(523.5), D5(587.33),
	E5(659.25), F5(698.46), G5(783.99), A5(880.0), B5(987.77);

	private double frequency;

	MusicalNote(double frequency) {
		this.frequency = frequency;
	}

	public double getFrequency() {
		return frequency;
	}
}
