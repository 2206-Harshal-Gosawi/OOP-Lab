package foodCourt;

public abstract class NonVegItems extends Snack {
	
	public NonVegItems(Integer productPrice,String productName) {
		super(productPrice,"NON-VEG",productName);
	}
}
