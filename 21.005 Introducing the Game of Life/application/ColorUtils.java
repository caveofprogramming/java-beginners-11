package application;

public class ColorUtils {
	
	public static int r(int color) {
		return (color >> 16) & 0xFF;
	}
	
	public static int g(int color) {
		return (color >> 8) & 0xFF;
	}
	
	public static int b(int color) {
		return color & 0xFF;
	}
	
	public static int rgb(int red, int green, int blue) {
		return (red << 16) + (green << 8) + blue;
	}
	
	public static int average(int ... colors) {
		
		int red = 0;
		int green = 0;
		int blue = 0;
		
		for(var color: colors) {
			red += r(color);
			green += g(color);
			blue += b(color);
		}
		
		red /= colors.length;
		green /= colors.length;
		blue /= colors.length;
		
		return rgb(red, green, blue);
	}
}
