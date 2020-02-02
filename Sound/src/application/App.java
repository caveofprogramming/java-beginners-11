package application;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;


public class App {

	public static void main(String[] args) throws LineUnavailableException {
		
		
		int sampleRate = 44100;
		
		AudioFormat format = new AudioFormat((float) sampleRate, 16, 1, true, false);
		SourceDataLine line = AudioSystem.getSourceDataLine(format);
		line.open();
		line.start();
		
		int duration = 1000; // milliseconds
		int numberSamples = (sampleRate * duration)/1000; // total number of samples to create
		
		float frequency = 512;
		float wavelength = sampleRate/frequency; // in samples
		System.out.println(wavelength);
		
		byte[] buf = new byte[2];
		
		for(int sampleNumber=0; sampleNumber<numberSamples; sampleNumber++) {

			short sample = (short)(Short.MAX_VALUE * Math.sin(2 * Math.PI * sampleNumber/wavelength));
			
			buf[0] = (byte) (sample & 0xFF); 
			buf[1] = (byte) (sample >> 8);
			
			line.write(buf, 0, 2);
		}
		
		
		line.drain();
		line.stop();

	}

}
