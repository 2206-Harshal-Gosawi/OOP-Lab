package Game;

public class Basket {
	String color;
	String material;
	
	public Basket(String color, String material) {
		super();
		this.color = color;
		this.material = material;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	void goesIn(Ball b) {
		
	}
}
