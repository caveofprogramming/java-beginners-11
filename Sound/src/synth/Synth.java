package synth;

import java.io.Closeable;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Synth implements Closeable {
	
	private static final int SAMPLE_RATE = 44100;
	
	private AudioFormat format;
	private SourceDataLine line;
	
	public Synth() {
		format = new AudioFormat((float) SAMPLE_RATE, 16, 1, true, false);
	}
	
	public void open() throws LineUnavailableException {
		line = AudioSystem.getSourceDataLine(format);
		line.open();
		line.start();
	}
	
	public void play(MusicalNote note, int duration) {
				
				int numberSamples = (SAMPLE_RATE * duration)/1000; // total number of samples to create
				
				double frequency = note.getFrequency();
				double wavelength = SAMPLE_RATE/frequency; 
				
				byte[] buf = new byte[2];
				
				for(int sampleNumber=0; sampleNumber<numberSamples; sampleNumber++) {

					short sample = (short)(Short.MAX_VALUE * Math.sin(2 * Math.PI * sampleNumber/wavelength));
					
					buf[0] = (byte) (sample & 0xFF);  
					buf[1] = (byte) (sample >> 8);	
					
					line.write(buf, 0, 2);
				}
	}

	@Override
	public void close() throws IOException {
		line.drain();
		line.stop();
	}
}
