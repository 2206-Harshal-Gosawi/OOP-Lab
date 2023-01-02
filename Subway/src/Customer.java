
public class Customer {

	public static void main(String[] args) {
		
		FastFoodCorner shop = new FastFoodCorner("Vasco");
		System.out.println("-----SUBWAY "+shop.getLocation().toUpperCase()+"-----");
		Integer totalPrice=0;
		Snack item1=shop.orderFood("vadaPav");
		item1.printDetails();
		
		Snack item2=shop.orderFood("vegBurger");
		item2.printDetails();
		
		Snack item3=shop.orderFood("vegSandwich");
		item3.printDetails();
		
		Snack item4=shop.orderFood("chickenBurger");
		item4.printDetails();
		
		Snack item5=shop.orderFood("chickenSandwich");
		item5.printDetails();
		
		Snack item6=shop.orderFood("shawarma");
		item6.printDetails();
		
		totalPrice=item1.getProductPrice()+item2.getProductPrice()+item3.getProductPrice()+item4.getProductPrice()+item5.getProductPrice()+item6.getProductPrice();
		System.out.println("-----TOTAL PRICE = "+totalPrice+"/-Rs-----");
	}

}
