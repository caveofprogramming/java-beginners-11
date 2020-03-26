package application;

public enum Fruit {
	APPLE("green"), BANANA("yellow"), ORANGE("orange");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase() + " (" + color + ")";
	}
}
