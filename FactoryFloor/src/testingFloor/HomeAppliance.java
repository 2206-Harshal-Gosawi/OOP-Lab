package testingFloor;

public class HomeAppliance extends Appliance {
	
	public HomeAppliance(String applianceName,Boolean wifiEnabled) {
		super(applianceName,wifiEnabled,"Home Appliance","");
	}
	
	public HomeAppliance(String applianceName,Boolean wifiEnabled,String brand) {
		super(applianceName,wifiEnabled,"Home Appliance",brand);
	}
	
}
