package Game;

public class Court {
	String courtType;
	String color;
	Basket basket;
	
	public Court(String courtType, String color, Basket basket) {
		super();
		this.courtType = courtType;
		this.color = color;
		this.basket = basket;
	}
	public String getCourtType() {
		return courtType;
	}
	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
}
