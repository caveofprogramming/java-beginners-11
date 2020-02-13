package application;

import java.io.File;
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

	private static final String ENCODING = "US-ASCII";
	private static final int SAMPLE_RATE = 44100;
	private static final int NUM_CHANNELS = 1;
	private static final int BITS_PER_SAMPLE = 16;
	private static final int BYTES_PER_SAMPLE = BITS_PER_SAMPLE/8;
	
	private int nSamples;

	private byte[] riffId;		// 4
	private byte[] riffSize;	// 4
	private byte[] riffFormat; 	// 4

	private byte[] formatId;	// 4
	private byte[] formatSize;	// 4
	private byte[] audioFormat;	// 2
	private byte[] numChannels;	// 2
	private byte[] sampleRate;	// 4
	private byte[] byteRate;	// 4
	private byte[] blockAlign;	// 2
	private byte[] bitsPerSample; // 2

	private byte[] dataId;	// 4
	private byte[] dataSize; // 4
	private byte[] data;
	
	private String filename;
	
	/*
	 * Duration is in seconds
	 */

	public Wav(String filename, double duration) throws UnsupportedEncodingException {
		this.filename = filename;
		
		this.nSamples = (int)(SAMPLE_RATE * duration);
		
		/* Wave header and data */
		
		this.riffId = "RIFF".getBytes(ENCODING);
		this.riffFormat = "WAVE".getBytes(ENCODING);
		
		this.formatId = "fmt ".getBytes();
		this.formatSize = Util.convertLittleEndian(4, 16);
		this.audioFormat = Util.convertLittleEndian(2, 1);
		this.numChannels = Util.convertLittleEndian(2, NUM_CHANNELS);
		this.byteRate = Util.convertLittleEndian(4, SAMPLE_RATE * NUM_CHANNELS * BYTES_PER_SAMPLE);
		this.sampleRate = Util.convertLittleEndian(4, SAMPLE_RATE);
		this.blockAlign = Util.convertLittleEndian(2, NUM_CHANNELS * BYTES_PER_SAMPLE);
		this.bitsPerSample = Util.convertLittleEndian(2, BITS_PER_SAMPLE);
		
		int dataSizeBytes = nSamples * BYTES_PER_SAMPLE * NUM_CHANNELS;

		this.dataId = "data".getBytes();
		this.dataSize = Util.convertLittleEndian(4, dataSizeBytes);
		this.data = new byte[dataSizeBytes];
		
		// @formatter:off
		int riffSize = 
				riffFormat.length +
				formatId.length + 
				formatSize.length + 
				audioFormat.length + 
				numChannels.length + 
				sampleRate.length + 
				byteRate.length + 
				blockAlign.length + 
				bitsPerSample.length + 
				dataId.length + 
				dataSize.length +
				data.length;
		// @formatter:on
				
		this.riffSize = Util.convertLittleEndian(4, riffSize);
		
		/* End of wave header and data */
	}
	
	public void check() {
		File file = new File(filename);
		
		long fileSize = file.length();
		
		if(Util.convertBigEndian(this.riffSize) + 8 != fileSize) {
			System.err.printf("File size %d not equal to riff size %d + 8\n", fileSize, Util.convertBigEndian(this.riffSize));
		}
		
	}
	
	private void writeHeader(FileOutputStream fos) throws IOException {
		fos.write(riffId);
		fos.write(riffSize);
		fos.write(riffFormat);
		fos.write(formatId);
		fos.write(formatSize);
		fos.write(audioFormat);
		fos.write(numChannels);
		fos.write(sampleRate);
		fos.write(byteRate);
		fos.write(blockAlign);
		fos.write(bitsPerSample);
		fos.write(dataId);
		fos.write(dataSize);
	}
	
	private void writeData(FileOutputStream fos) throws IOException {
		final double frequency = 512;

		final double variationFrequency = 1;
		final double variationAmplititude = 300;
		
		for(int i = 0; i < nSamples; i++) {
						
			double variation = variationAmplititude * Math.sin(2 * Math.PI * variationFrequency * (double)i/SAMPLE_RATE);
			
			double amplitude =  Math.sin( 2 * Math.PI * frequency * (double)i/SAMPLE_RATE + variation);
			
			byte[] bytes = Util.convertLittleEndian(2, (short)(amplitude * Short.MAX_VALUE));
			
			fos.write(bytes);
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
