package app;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;

public class App {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

		var receiver = MidiSystem.getReceiver();
		
		ShortMessage msg = new ShortMessage();
		msg.setMessage(ShortMessage.NOTE_ON, 0, 60, 127);
		
		receiver.send(msg, -1);
		
		Thread.sleep(3000);
	}

}
