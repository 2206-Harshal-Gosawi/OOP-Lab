package DataAccess;

public class Laptop {
	private String model;
	private Integer price;
	public Laptop(String model,Integer price) {
		this.model=model;
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
