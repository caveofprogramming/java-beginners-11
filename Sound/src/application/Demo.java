package application;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/*
 * Plays a sin wave note.
 */


public class Demo {

	public static void main(String[] args) throws LineUnavailableException {
		
		// Java will use so many samples per second to create the sound.
		// 44100 is high quality sound.
		int sampleRate = 44100;
		
		// We use 16 bits for each sample and only one channel (mono).
		AudioFormat format = new AudioFormat((float) sampleRate, 16, 1, true, false);
		
		SourceDataLine line = AudioSystem.getSourceDataLine(format);
		line.open();
		line.start();
		
		int duration = 500; // milliseconds
		int numberSamples = (sampleRate * duration)/1000; // total number of samples to create
		
		float frequency = 512;
		
		// Calculate how many samples long is a single wave.
		// (samples per second) divided by (waves per second)
		// gives us number of samples per wave.
		float wavelength = sampleRate/frequency; 
		System.out.println(wavelength);
		
		byte[] buf = new byte[2];
		
		for(int sampleNumber=0; sampleNumber<numberSamples; sampleNumber++) {

			// Basic trigonometry. sin() goes through a complete wave from 0 to 2*PI, so we need to make
			// sure that happens the correct number of times per second for the desired frequency.
			short sample = (short)(Short.MAX_VALUE * Math.sin(2 * Math.PI * sampleNumber/wavelength));
			
			// We need the bytes to be written in the right order, but by default they are
			// stored in the 'wrong' order for our purposes here. Re-arrange them.
			buf[0] = (byte) (sample & 0xFF);  	// First byte (least significant)
			buf[1] = (byte) (sample >> 8);		// Second byte (most significant)
			
			line.write(buf, 0, 2);
		}
		
		
		line.drain();
		line.stop();

	}

}
