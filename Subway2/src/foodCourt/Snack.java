package foodCourt;

public abstract class Snack {
	private Integer productPrice;
	private String snackType;
	private String productName;

	public Snack(Integer productPrice,String snackType,String productName) {
		this.productPrice=productPrice;
		this.snackType=snackType;
		this.productName=productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getSnackType() {
		return snackType;
	}

	public String getProductName() {
		return productName;
	}
	
	
	public void printDetails() {
		System.out.printf("%-25s %-18s %-11s\n","Snack: "+productName,"Category: "+snackType,"Price: "+productPrice+"\\-Rs");
	}
	
}
