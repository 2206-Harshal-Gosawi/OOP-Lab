package testingFloor;

public class Oven extends KitchenAppliance implements WifiEnabledDevice {
	public Oven() {
		super("Oven", false);
	}
	
	public Oven(String brand) {
		super("Oven", false,brand);
	}

	@Override
	public void enableWifi() {
		// TODO Auto-generated method stub
		
	}
}
