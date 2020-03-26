package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/*
 * WAVE PCM format.
 * 
 * All numbers are little-endian.
 * 
 * Riff chunk
 * 
 * Bytes	Name			Description
 * 
 * 4		Chunk ID				ASCII "RIFF"
 * 4		Chunk size				Size of everything after this (size of file minus 8 bytes).
 * 4		Format					ASCII "WAVE"
 * 
 * 4		Subchunk ID				ASCII "fmt "
 * 4		Subchunk size			Size of the rest of the format chunk. 16 bytes
 * 2		audio format			1 for PCM. If compressed, something else.
 * 2		number of channels		1 = mono, 2 = stereo
 * 4		sample rate				e.g. 44100
 * 4		byte rate				sample rate * number of channels * bytes per sample
 * 2		block align				number of bytes per sample for all channels in total
 * 2		bits per sample			number of bytes per sample * 8 (for one channel)
 * 
 * 4		Subchunk ID				ASCII "data"
 * 4		Chunk size				Size of rest of subchunk in bytes; i.e. data size.
 * 			data					the actual data (little endian)
 * 
 */

public class Wav {

	private static final int SAMPLE_RATE = 44100;
	
	private int nSamples;
	private String filename;
	
	private WaveHeader header;
	
	/*
	 * Duration is in seconds
	 */

	public Wav(String filename, double duration) throws UnsupportedEncodingException {
		this.filename = filename;
		this.header = new WaveHeader(duration, SAMPLE_RATE);

		this.nSamples = (int)(SAMPLE_RATE * duration);
	}
	
	private void writeHeader(FileOutputStream fos) throws IOException {
		fos.write(header.getBytes());
	}
	
	private void writeData(FileOutputStream fos) throws IOException {
		final double frequency = 512;

		final double variationFrequency = 1;
		final double variationAmplititude = 300;
		
		for(int i = 0; i < nSamples; i++) {
						
			double variation = variationAmplititude * Math.sin(2 * Math.PI * variationFrequency * (double)i/SAMPLE_RATE);
			
			double amplitude =  Math.sin( 2 * Math.PI * frequency * (double)i/SAMPLE_RATE + variation);
			
			short sample = (short)(amplitude * Short.MAX_VALUE);
			
			// Little endian
			byte byte1 = (byte)(sample & 0xFF);
			byte byte2 = (byte)((sample >> 8) & 0xFF);
			
			fos.write(byte1);
			fos.write(byte2);
		}
	}
	
	public void write() {
		try(FileOutputStream fos = new FileOutputStream(filename)) {
			writeHeader(fos);
			writeData(fos);
		}
		catch(FileNotFoundException e) {
			System.err.println("Unable to create file: " + filename);
		} catch (IOException e) {
			System.err.println("Unable to write file: " + filename);
		}
	}
}
