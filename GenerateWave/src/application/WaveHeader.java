package application;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class WaveHeader {
	private static final String ENCODING = "US-ASCII";
	private static final int NUM_CHANNELS = 1;
	private static final int BITS_PER_SAMPLE = 16;
	private static final int BYTES_PER_SAMPLE = BITS_PER_SAMPLE / 8;
	private static final int PCM = 1;

	private String riffId;
	private int riffSize;
	private String riffFormat; 

	private String formatId; 
	private int formatSize;
	private short audioFormat; 
	private short numChannels;
	private int sampleRate; 
	private int byteRate; 
	private short blockAlign; 
	private short bitsPerSample;

	private String dataId; 
	private int dataSize; 

	public WaveHeader(double duration, int sampleRate) throws UnsupportedEncodingException {

		int dataSizeInBytes = (int) (duration * sampleRate * NUM_CHANNELS * BYTES_PER_SAMPLE);

		this.riffId = "RIFF";
		this.riffSize = dataSizeInBytes + 36;
		this.riffFormat = "WAVE";

		this.formatId = "fmt ";
		this.formatSize = 16;
		this.audioFormat = PCM;
		this.numChannels = NUM_CHANNELS;
		this.sampleRate = sampleRate;
		this.byteRate = sampleRate * NUM_CHANNELS * BYTES_PER_SAMPLE;
		this.blockAlign = NUM_CHANNELS * BYTES_PER_SAMPLE;
		this.bitsPerSample = BITS_PER_SAMPLE;

		this.dataId = "data";
		this.dataSize = dataSizeInBytes;
	}

	public byte[] getBytes() {
		
		Charset charSet = Charset.forName(ENCODING);
		
		ByteBuffer buffer = ByteBuffer.allocate(44);
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		
		buffer.put(riffId.getBytes(charSet));
		buffer.putInt(riffSize);
		buffer.put(riffFormat.getBytes(charSet));
		
		buffer.put(formatId.getBytes(charSet));
		buffer.putInt(formatSize);
		buffer.putShort(audioFormat);
		buffer.putShort(numChannels);
		buffer.putInt(sampleRate);
		buffer.putInt(byteRate);
		buffer.putShort(blockAlign);
		buffer.putShort(bitsPerSample);
		
		buffer.put(dataId.getBytes(charSet));
		buffer.putInt(dataSize);
		
		
		return buffer.array();
	}
}
