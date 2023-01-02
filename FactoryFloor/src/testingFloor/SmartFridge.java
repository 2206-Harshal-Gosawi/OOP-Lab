package testingFloor;

public class SmartFridge extends KitchenAppliance  implements WifiEnabledDevice {
	public SmartFridge() {
		super("Smart Fridge", true);
	}
	
	public SmartFridge(String brand) {
		super("Smart Fridge", true,brand);
	}

	@Override
	public void enableWifi() {
		// TODO Auto-generated method stub
		
	}
}
