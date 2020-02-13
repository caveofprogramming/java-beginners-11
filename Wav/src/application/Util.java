package application;

public class Util {
	public static byte[] convertLittleEndian(int size, int value) {

		byte[] bytes = new byte[size];

		for (int i = 0; i < size; i++) {
			int shift = i * 8;

			bytes[i] = (byte) ((value >> shift) & 0xFF);
		}

		return bytes;
	}

	public static int convertBigEndian(byte[] bytes) {

		int value = 0;
		
		for (int i = bytes.length - 1; i >= 0; i--) {
			value = value << 8;
			value += bytes[i] & 0xFF;
		}
		
		return value;
	}

	public static String toString(int value) {

		StringBuilder sb = new StringBuilder();

		sb.append(String.format("%02x ", (value >> 24) & 0xFF));
		sb.append(String.format("%02x ", (value >> 16) & 0xFF));
		sb.append(String.format("%02x ", (value >> 8) & 0xFF));
		sb.append(String.format("%02x ", (value >> 0) & 0xFF));

		return sb.toString();
	}

	public static String toString(byte[] bytes) {

		StringBuilder sb = new StringBuilder();

		for (var b : bytes) {
			sb.append(String.format("%02x ", b));
		}

		return sb.toString();
	}

}
