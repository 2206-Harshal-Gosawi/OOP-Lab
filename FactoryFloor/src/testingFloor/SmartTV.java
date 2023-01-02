package testingFloor;

public class SmartTV extends HomeAppliance  implements WifiEnabledDevice {
	public SmartTV() {
		super("Smart TV", true);
	}
	
	public SmartTV(String brand) {
		super("Smart TV", true,brand);
	}

	@Override
	public void enableWifi() {
		// TODO Auto-generated method stub
		
	}
}
