
public class FastFoodCorner {
	private String location;

	public FastFoodCorner(String location) {
		this.location = location;
	}
	
	public Snack orderFood(String foodName) {
			Snack snack = null;
			switch (foodName) {
			case "vadaPav":
				snack = new VadaPav(20);
				break;
				
			case "vegBurger":
				snack = new VegBurger(45);
				break;
				
			case "vegSandwich":
				snack = new Sandwich(15);
				break;
				
			case "chickenBurger":
				snack = new ChickenBurger(60);
				break;
				
			case "chickenSandwich":
				snack = new ChickenSandwich(50);
				break;
				
			case "shawarma":
				snack = new Shawarma(120);
				break;

			default:
				System.out.println("Sorry we don't have "+foodName);
				break;
			}
			return snack;	
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}	
	
	
	
}
