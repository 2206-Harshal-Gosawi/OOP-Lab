import java.util.ArrayList;

import foodCourt.FastFoodCorner;
import foodCourt.Snack;

public class Customer {

	public static void main(String[] args) {
		FastFoodCorner shop = new FastFoodCorner("Vasco");
		Integer totalPrice=0;
		
		ArrayList<String> snacks = new ArrayList<>();
		snacks.add("vadaPav");
		snacks.add("vegBurger");
		snacks.add("vegSandwich");
		snacks.add("chickenBurger");
		snacks.add("chickenSandwich");
		snacks.add("shawarma");
		
		
		ArrayList<Snack> orderedSnacks = shop.orderMultiple(snacks);
			
		System.out.printf("-------------------------YOUR ORDER-------------------------\n");
		for(Snack i:orderedSnacks) {
			i.printDetails();
			totalPrice+=i.getProductPrice();
		}
		System.out.println("--------------------TOTAL PRICE = "+totalPrice+"/-Rs--------------------");
	}

}
