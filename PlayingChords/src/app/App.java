package app;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;

public class App {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

		var receiver = MidiSystem.getReceiver();
		
		int[] notes = { 60, 64, 67, 60, 65, 67, 55, 59, 62, 55, 60, 62, 53, 57, 60, 53, 58, 60 };
		int[] times = {0, 0, 0, 1000, 1000, 1000, 2000, 2000, 2000, 3000, 3000, 3000, 4000, 4000, 4000, 5000, 5000, 5000};
		
		for(int i = 0; i < notes.length; i++) {
			
			int note = notes[i];
			int time = times[i];
			receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1000);
			receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 127), (time + 1000) * 1000);
		}
		
		Thread.sleep(7000);
	}

}
