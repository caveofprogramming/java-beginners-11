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
	
	public void play(MusicalNote note, int duration) throws InterruptedException {
				
				int totalSamples = (SAMPLE_RATE * duration)/1000; // total number of samples to create
				double envelope = 1.0;
				
				double frequency = note.getFrequency();
				double wavelength = SAMPLE_RATE/frequency; 
				
				byte[] buf = new byte[2];
				
				for(int i=0; i<totalSamples; i++) {

					short sample = (short)(envelope * Short.MAX_VALUE * Math.sin(2 * Math.PI * i/wavelength));
					
					buf[0] = (byte) (sample & 0xFF);  
					buf[1] = (byte) (sample >> 8);	
					
					
					line.write(buf, 0, 2);
					
					
					envelope = 1.0 - ((double)i/totalSamples);
				}
	}

	@Override
	public void close() throws IOException {
		
		line.stop();
	}
}
